package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;

import java.awt.CardLayout;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.AddressException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.example.demo.Service.EmailService;
import com.example.demo.Service.FIleUploadService;
import com.example.demo.ServiceImplementation.BookServiceImplementation;
import com.example.demo.ServiceImplementation.UserImplementation;
import com.example.demo.model.Books;
import com.example.demo.model.BooksDetails;
import com.example.demo.model.User;

@Controller
@RequestMapping(value = "/bookaro/")
public class WebController {
     
    
    List<BooksDetails> bookDetaisl=new ArrayList<>();
    
    List<Integer> quan=new ArrayList<>();
   
	@Autowired
    private UserImplementation us;
	
	@Autowired
	private EmailService em;

	@Autowired
	private FIleUploadService file;
	
	@Autowired
	private BookServiceImplementation bookService;
	private int quantity=0;
	
	
      @RequestMapping(value="index")
       public String index()
         {
           return "index/index";
         }
      
      
      
      @RequestMapping(value="registerform")
      public String registerform()
       {
          return "register/register";
       }
      
      
      @RequestMapping(value="register")
      public String register(User user) throws AddressException, MessagingException
       {
           int otp=Random();
    	   String email=user.getEmail();
           user.setOtp(otp);

    	   us.saveUser(user);
       	   boolean status=em.send(email,otp);
           return "login/verify";
       }
      
      @RequestMapping(value="loginform" )
      public String loginform()
       {
    	  return "login/login";
       }
      
      @RequestMapping(value="login",method = {RequestMethod.GET, RequestMethod.POST})
     
      public String login(@RequestParam(value="username")String username,@RequestParam(value="password")String password,HttpServletRequest req)
       {
    	  User user=us.login(username, password);
    	  
    	  if(user==null)
    	  {
    		  
    		  return "redirect:/bookaro/loginform";
    	  }
    	  else {
    	  if(user.IsisVerify()==false)
    	  {
    		  return "redirect:/bookaro/verify?err=1";
    	  }
    	  else {
    		 int id= user.getUserid();
    		 HttpSession ss=req.getSession();
    		 ss.setAttribute("id", id);
    		 
    	    return "redirect:/bookaro/bookaro";
    	  }
    	  }
       }
    	  
    	  
       @RequestMapping(value="verify")
        public String verify(@RequestParam(value="err",defaultValue ="0",required = false) int status,ModelMap map ) throws AddressException, MessagingException
        {
    	   String msg1 = "";
    	   if(status==1)
    	   {
    	            msg1 = "Invalid User or Password !! Please Try Again";
    	            map.put("msg1", msg1);
    	            System.out.println("verify page");
    	            return "login/verify";
    	   }
    	   else {
            return "login/login";
    	   }
    	 
        }

       
       @RequestMapping(value="verifyus")
        public String verifyus(@RequestParam(value = "email")String email,@RequestParam(value="otp")int otp) throws AddressException, MessagingException
        {
    	   boolean status= us.check(email, otp);
    	   if(status==false)
    	   {
    		   return "redirect:/bookaro/verify?err=1";
    	   }
    	   else {
    		   
    		   return "login/login";
    	   }
    	   
 	 
        }
       
       
      

      


      @RequestMapping(value="cart")
	   public String cart(ModelMap map,HttpServletRequest http)
	    {
          HttpSession ss=http.getSession();

          map.put("items", ss.getAttribute("totalItems"));
    	  map.put("cart", ss.getAttribute("cart"));
    	  return "user/cart";
	    }
 
      @RequestMapping(value="bookaro")
	   public String bookaro(ModelMap map)
	    {
    	  map.put("quantity", quantity);
       	  return "user/bookaro";
	    }
      
      @RequestMapping(value="sell")
	   public String sell(ModelMap map)
	    {
          map.put("quantity", quantity);
      	  return "sell/sell";
	    }

      
      @RequestMapping(value="sellbook")
	   public String sellBook(HttpServletRequest req,@RequestParam("filename1")MultipartFile filename,Books book,ModelMap map) throws IOException
	    {
    	  HttpSession ss=req.getSession();
    	  int id=(int) ss.getAttribute("id");
     	  String filename2=file.upload(filename, id);
    	  us.saveBooks(book,filename2,id);
    	  return "sell/sell";
	    }


      @RequestMapping(value="buy")
	   public String buy(ModelMap map,String search,HttpServletRequest http) throws FileNotFoundException, IOException
	    {
    	  HttpSession ss=http.getSession();
    	  
    	  if(search==null)
    	  {
    	   List<Books> books=us.getAllBooks();

    	   for(Books b: books)
    	  {
            String filename =b.getBookPic();
  			String bookPic = file.getProfilePic(filename);
  			b.setBookPic(bookPic);
  		  }
     	 
     	 
    	  map.put("book", books);
    	  map.put("cart", bookDetaisl);
    	  ss.setAttribute("cart", bookDetaisl);
          map.put("items", ss.getAttribute("totalItems"));
          return "buy/buy";
    	  }
    	  
    	  
    	  else {
    		 List<Books> books1= us.Search(search);
    		 map.put("book", books1);
             map.put("items", ss.getAttribute("totalItems"));

    		  return "buy/buy";
    	  }
	    }
      
      
      @RequestMapping(value="/AddCart/{id}")
	   public String AddToCart(HttpServletRequest req,@PathVariable("id")int bookid1,ModelMap map,HttpServletRequest http) throws IOException
	    {
         Books book=bookService.getBook(bookid1);
 	     HttpSession ss=http.getSession();
    	  if(bookDetaisl.size()==0)
    	      bookDetaisl.add(new BooksDetails(bookid1,1,book.getPrice(),book.getSubject(),file.getProfilePic(book.getBookPic())));
    	  else {
    		  
    		  boolean status=false;
    		  int index=-1;
    		  for(BooksDetails b:bookDetaisl)
    		  {
    			  if(b.getBookId()==bookid1)
    			  { 
    			     index++;
    		         status=true;
    		         break;
    			  }
    			  else
    			  {
                      index++;
    				  status=false;
    				  continue;
    			  }
    			  
    		 }
    		  
    		  if(status)
    		  {
    			BooksDetails boo=bookDetaisl.get(index);
    			int quan=boo.getQuantity();
    			boo.setQuantity(quan+1);
    		 }
    		  else {
    				BooksDetails boo=new BooksDetails(bookid1,1,book.getPrice(),book.getSubject(),file.getProfilePic(book.getBookPic()));
    	    	    bookDetaisl.add(boo);
    		  }
    		  }
    		  
          
             ss.setAttribute("totalItems",  bookDetaisl.size());
             return "redirect:/bookaro/buy";
    	   
	    }

      
     @RequestMapping("/removeCart/{count}")
     public String RemoveCart(@PathVariable("count")int count) throws FileNotFoundException, IOException
     {
    	
    	 quantity--; 
    	 return "redirect:/bookaro/cart";
     }
     

     @RequestMapping("/removeCart1/{count}")
     public String RemoveCart1(@PathVariable("count")int count) throws FileNotFoundException, IOException
     {
    	
    	 quantity--; 
    	 return "redirect:/bookaro/buy";
     }
     

	 List<String> pic=new ArrayList<>();
	 List<Books> boo=new ArrayList<>();
	 
	 
     @RequestMapping("/searchClasses/{id}")
     public String SearchClasses(@PathVariable("id") String clas,ModelMap map) throws FileNotFoundException, IOException
     {
    	 boo=us.getBooksByClasses(clas);
    	 for(Books b:boo)
    	{
    		String filename=b.getBookPic();
    		User user=b.getUser();
    		
    	}
    	
    	 map.put("books1", pic);
    	 map.put("book1",boo);
    	 return "redirect:/bookaro/buy1";
    	 
     }
     
     @RequestMapping("/buy1")
     public String buy1(ModelMap map)
     {
    	 map.put("books1", pic);
    	 map.put("book1",boo);

    	 return "buy/buy1";
     }
     
     
     @RequestMapping("contact")
     public String contact()
     {
    	 return "contact/contact";
     }
     

public int Random()
{
	Random rn=new Random();
	return rn.nextInt(999999);
}
      
      

}
