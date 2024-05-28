package com.tka.utility;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Message {
	
//	@Pointcut("execution (public void deposit()) ")	
//	public void messageSend() {
//		
//	}
//	
//	@After("messageSend()")
//	public void sendSMS() {
//		System.out.println("------- SMS Send To Client----------");
//	}
//	
//	@Pointcut("execution (public void deposit1(..)) ")	
//	public void messageSend1() {
//		
//	}
	
	
//	@After("messageSend1()")
//	public void sendSMS1(JoinPoint jt) {
//		System.out.println("=======  SMS Send To the Client=========== "+Arrays.toString(jt.getArgs()));
//		}
	
//	@Pointcut("execution (public void withdraw())")
//	public void pinValid() {
//		
//	}
//	
//	@Before("pinValid()")
//	public void checkpinValid() {
//		System.out.println("+++++++++++ Pin is Validatated++++++++++++");
//	}
	
	
	@Pointcut("execution (* com.tka.entity.Account.*(..)) ")
	public void checkAfterBeforeLogic() {		
	}	
	@Around("checkAfterBeforeLogic()")
	public void arroundMessage(ProceedingJoinPoint p) {		
		System.out.println("======== before Method Pin is validatated==============");
		//pin validation logic 		
		// end of pin validation logic 		
			try {
				p.proceed();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				
		// Send SMS Logic 
		
		System.out.println("========After Method Send SMS Logic=====");		
	}
	
	
	
	

}
