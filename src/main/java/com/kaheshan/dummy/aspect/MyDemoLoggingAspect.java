package com.kaheshan.dummy.aspect;

import com.kaheshan.dummy.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;


@Aspect
@Component
@Order(2)
@Slf4j
public class MyDemoLoggingAspect {

//	@Before("com.kaheshan.dummy.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
//	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
//
//		System.out.println("\n=====>>> Executing @Before advice on method");
//
//		// display the method signature
//		MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature();
//
//		System.out.println("Method: " + methodSig);
//
//		// display method arguments
//
//		// get args
//		Object[] args = theJoinPoint.getArgs();
//
//		// loop thru args
//		for (Object tempArg : args) {
//			System.out.println(tempArg);
//
//			if (tempArg instanceof Customer) {
//
//				// downcast and print Account specific stuff
//				Customer customer = (Customer) tempArg;
//
//				System.out.println("customer name: " + customer.getFirstName());
//				System.out.println("customer level: " + customer.getLastName());
//
//			}
//		}
//
//	}
//
//	@AfterReturning(
//			pointcut="execution(* com.kaheshan.dummy.dao.CustomerDAOImpl.getCustomer(..))",
//			returning="result")
//	public void afterReturningFindAccountsAdvice(
//			JoinPoint theJoinPoint, List<Customer> result) {
//
//		// print out which method we are advising on
//		String method = theJoinPoint.getSignature().toShortString();
//		System.out.println("\n=====>>> Executing @AfterReturning on method: " + method);
//
//		// print out the results of the method call
//		System.out.println("\n=====>>> result is: " + result);
//
//		// let's post-process the data ... let's modify it :-)
//
//		// convert the account names to uppercase
//		convertCustomerNamesToUpperCase(result);
//
//		System.out.println("\n=====>>> result is: " + result);
//
//	}
//
//
//	@AfterThrowing(
//			pointcut="execution(* com.kaheshan.dummy.dao.CustomerDAOImpl.getCustomer(..))",
//			throwing="theExc")
//	public void afterThrowingFindAccountsAdvice(
//			JoinPoint theJoinPoint, Throwable theExc) {
//
//		// print out which method we are advising on
//		String method = theJoinPoint.getSignature().toShortString();
//		System.out.println("\n=====>>> Executing @AfterThrowing on method: " + method);
//
//		// log the exception
//		System.out.println("\n=====>>> The exception is: " + theExc);
//
//	}
//
//	@After("execution(* com.kaheshan.dummy.dao.CustomerDAOImpl.getCustomer(..))")
//	public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint) {
//
//		// print out which method we are advising on
//		String method = theJoinPoint.getSignature().toShortString();
//		System.out.println("\n=====>>> Executing @After (finally) on method: "
//				+ method);
//
//	}
//
//	@Around("execution(* com.kaheshan.dummy.dao.CustomerDAOImpl.getCustomer(..))")
//	public Object aroundGetFortune(
//			ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {
//
//		// print out method we are advising on
//		String method = theProceedingJoinPoint.getSignature().toShortString();
//		log.info("\n=====>>> Executing @Around on method: " + method);
//
//		// get begin timestamp
//		long begin = System.currentTimeMillis();
//
//		// now, let's execute the method
//		Object result = theProceedingJoinPoint.proceed();
//
//		// get end timestamp
//		long end = System.currentTimeMillis();
//
//		// compute duration and display it
//		long duration = end - begin;
//		log.info("\n=====> Duration: " + duration / 1000.0 + " seconds");
//
//		return result;
//	}
//
//	private void convertCustomerNamesToUpperCase(List<Customer> result) {
//
//		// loop through accounts
//
//		for (Customer customer : result) {
//
//			// get uppercase version of name
//			String theUpperName = customer.getFirstName().toUpperCase();
//
//			// update the name on the account
//			customer.setFirstName(theUpperName);
//		}
//
//	}
	
}










