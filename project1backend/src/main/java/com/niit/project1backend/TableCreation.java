package com.niit.project1backend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.DBConfiguration;



/**
 * Hello world!
 *
 */
public class TableCreation 
{
    public static void main( String[] args )
    {
    	System.out.println( "WELCOME TO HIBERNATE APPLICATION" );
        ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class);
        System.out.println("TABLE CREATED SUCCESSFULLY");
    }
}
