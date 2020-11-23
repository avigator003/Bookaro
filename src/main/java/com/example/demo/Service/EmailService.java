package com.example.demo.Service;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

	
	
	public boolean send(String to,int otp) throws AddressException, MessagingException
	{
		String user="informatics003@gmail.com";
		String pass="Eurotrip@123";
		Properties properties=new Properties();
        properties.put("mail.smtp.host","smtp.gmail.com");
	    properties.put("mail.smtp.port","587");
	    properties.put("mail.smtp.auth","true");
	    properties.put("mail.smtp.starttls.enable","true");
	    
	    
	    	Authenticator authenticator=new Authenticator()
	    			{
	    		
	    		protected PasswordAuthentication getPasswordAuthentication()
	    		{
	    			return new PasswordAuthentication(user, pass);
	    		}
	    			};
	    			
	   Session ss=Session.getInstance(properties, authenticator);		
	   Message msg=new MimeMessage(ss);
	   msg.setFrom(new InternetAddress(user));
	   msg.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
	   msg.setSubject("Bookaro Email Verification");
	   String message="Bookaro Email Verification OTP :"+otp;
	   msg.setText(message);
	   Transport.send(msg);
	   return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
