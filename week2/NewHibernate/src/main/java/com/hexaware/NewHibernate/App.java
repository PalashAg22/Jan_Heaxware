package com.hexaware.NewHibernate;

import java.util.Scanner;

import com.hexaware.NewHibernate.entity.User;
import com.hexaware.NewHibernate.service.IService;
import com.hexaware.NewHibernate.service.IServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	
	static IService service = new IServiceImpl();
	static Scanner scn = new Scanner(System.in);
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       System.out.println("*****Welcome*****");
       service.deleteUserByUserID(103);
       //System.out.println(service.getUserByUserID(102));
       //System.out.println(service.getUserByName("user2"));
       System.out.println(service.getAllUser());
       boolean flag = false;
       
       while(flag) {
    	   System.out.println("1. create new user");
    	   System.out.println("2. update user password");
    	   
    	   int choice = scn.nextInt();
    	   switch (choice) {
    	   
    	   case 1:
    		   User u1 = readData();
    		   service.createUser(u1);
    		   break;
    	   case 2:
    		   User u2 = readData();
    		   System.out.println("enter new password");
    		   String npass = scn.next();
    		   scn.nextLine();
    		   service.updateUserPassword(u2,npass);
    		   break;
    	   
    	   
    	   case 7:
    		   flag = false;
    		   break;
    	
    	   default :
    		   System.out.println("enter correct choice");
    		   break;
    	   }
       }
        
    }
    
    public static User readData() {
    	System.out.println("enter user id");
    	int id = scn.nextInt();
    	System.out.println("enter name");
    	String name = scn.next();
    	scn.nextLine();
    	System.out.println("enter user-name");
    	String uname = scn.next();
    	//scn.nextLine();
    	System.out.println("enter password");
    	String pass = scn.next();
    	
    	User user = new User(id,name,uname,pass);
    	return user;
    }
}
