package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.config.Config;
import com.tka.entity.Account;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		Account acc= context.getBean(Account.class);
		
		//System.out.println(acc);
		
		acc.deposit();
//		acc.deposit1(5000.0);
		acc.withdraw();
		

	}

}
