package com.example.demo.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Books;
import com.example.demo.model.User;
import com.example.demo.repository.BookRepository;
@Service
public class FIleUploadService {

	private final String uploadLocation="E:\\images\\bookaro\\";
	
	
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	

	
	public Session giveSession()
	{
        SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
		Session ss=sessionFactory.openSession();
		return ss;
	}
	
	public String upload(MultipartFile file,int id) throws IOException
	{
		byte data[]=file.getBytes();
		String name=file.getOriginalFilename();
		File dir=new File(uploadLocation+id);
		if(!dir.exists())
		{
			dir.mkdir();
		}
		String ext=name.substring(name.lastIndexOf("."));
		String filename=System.currentTimeMillis()+ext;
		

	    FileOutputStream fos=new FileOutputStream(new File(dir,filename));
        fos.write(data);
        fos.flush();
        fos.close();
        String path=dir.getAbsolutePath()+"\\";
        return path+filename;
    
	}
	
	 public String getProfilePic(String filename) throws FileNotFoundException, IOException
	   {
	         File file = new File(filename);
	         try{
	   FileInputStream fis = new FileInputStream(file);            
	            int size = fis.available();
	            byte arr[] = new byte[size];
	            
	            fis.read(arr);
	            fis.close();
	            byte[] encoded = Base64.getEncoder().encode(arr);
	           
	            return new String(encoded);   
	            
	         }
	          catch (FileNotFoundException ex) 
	        {
	            System.out.println("Profile Pic Not Found !");
	            return null;
	        } catch (IOException ex) 
	        {
	            System.out.println("Profile Pic reading error");
	            return null;
	        }
	    }
	 
}


	

