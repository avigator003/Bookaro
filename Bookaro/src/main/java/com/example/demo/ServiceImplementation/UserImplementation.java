package com.example.demo.ServiceImplementation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.Principal.UserPrincipal;
import com.example.demo.Service.UserService;
import com.example.demo.model.Books;
import com.example.demo.model.User;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.UserRepository;

@Service
public class UserImplementation implements UserService,UserDetailsService {

	
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	

	@Autowired
	private BookRepository repo1;
	
	public Session giveSession()
	{
        SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
		Session ss=sessionFactory.openSession();
		return ss;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=repo.findByUsername(username);
		if(user==null)
		{
	    System.out.println("User Not Found");
		return null;
	    }
		else
		{
			return new UserPrincipal(user);
		}
	}
	

	@Override
	public void saveUser(User user) {
		repo.save(user);
		
	}
	
	public User login(String username,String password)
	{
     Session ss=giveSession();
	Query query=ss.createQuery("from User where username=:username and password=:password");
	query.setString("username", username);
	query.setString("password", password);
	User user=(User) query.uniqueResult();
	if(user==null)
	{

		ss.close();
	return null;	
	}
	else {

		ss.close();
	return user;	
	}
	
	
	}
	


	public boolean check(String email,int otp)
	{
		Session ss=giveSession();
		Query query=ss.createQuery("from User where email=:email and otp=:otp");
		query.setString("email",email);
		query.setInteger("otp", otp);
		User user=(User) query.uniqueResult();
		if(user==null)
		{
		return false;	
		}
		else {
			user.setVerify(true);
			ss.update(user);
			ss.beginTransaction().commit();
			ss.close();

		return true;	
		}
		
	}
	
	public void saveBooks(Books book,String filename,int id) {

		Session ss=giveSession();
	    Date date =new Date();
		User user= ss.get(User.class, id);
		user.setBook(book);
		book.setBookPic(filename);
		book.setUser(user);
		book.setDate(date);
		ss.update(user);
		ss.save(book);
		ss.beginTransaction().commit();
		ss.close();
		
	}
	
	public List<User> getAllUser()
	{
		Session ss=giveSession();
		Query query=ss.createQuery("from User");
		List<User> users=query.list();
		
	    ss.close();
		return users;
		
	}
	
	
	public List<Books> getAllBooks()
	{
		Session ss=giveSession();
		Query query=ss.createQuery("from Books b ORDER BY b.date DESC ");
		List<Books> books=query.list();
		
	    ss.close();
		return books;
		
	}
	
	
	public Books getBook(int id)
	{
		Session ss=giveSession();
		Books book=ss.get(Books.class, id);
		return book;
	}
	
	
	public List<Books> Search(String search)
	{
		Session ss=giveSession();
		List<Books> books=new ArrayList<>();
	    List<Books> books1=getAllBooks();
	    List<String> h=new ArrayList<>();
	    Query query=null;
	    
	    
		for(Books b:books1)
		{
			String s=b.getSubject();
			
		    for (int i = 0; i < s.length(); i++)  
		  {
	           for (int j = i+1; j <= s.length(); j++) 
	           {
        		  
	        	   if(s.substring(i,j).equalsIgnoreCase(search))
	        			   {
	        		      query=ss.createQuery("from Books b WHERE b.subject=:s");
	        		      query.setString("s", s);
	        		      break;
	        			   }
	        	   else {
	        		   continue;
	        	   }
	           }
		       }
	       
		}
		ss.close();
		
		    if(query==null)
		    {
		    	return null;
		    }
		    else {
		    	List<Books> books2=query.list();
		    	return books2;
		    	
		    }
}
	
	

	public List<Books> getBooksByClasses(String clas)
	{
		Session ss=giveSession();
		Query query=ss.createQuery("from Books b where b.classes=:clas ORDER BY b.date");
		query.setString("clas", clas);
		List<Books> book=query.list();
		return book;
		
	}
	}

