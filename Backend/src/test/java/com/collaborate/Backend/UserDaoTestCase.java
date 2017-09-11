package com.collaborate.Backend;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.collaborate.DAO.UserDao;

import com.collaborate.Model.User;

public class UserDaoTestCase {
	
	static UserDao userDao;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.collaborate");
		annotationConfigAppContext.refresh();
		userDao=(UserDao)annotationConfigAppContext.getBean("userDao");
	}
	
	@Test
	
	public void createUserTest()
	{
		
	User user=new User();	
	
	user.setUserId(1000);
	user.setFirstname("Sai");
	user.setLastname("Mahesh");
	user.setEmail("sai.mahesh246@gmail.com");
	user.setPassword("");
	user.setRole("");
	user.setStatus("NA");
	
	user.setLikes(0);
	
	assertTrue("problem in User Creation",userDao.createUser(user));
	}
	
	

}
