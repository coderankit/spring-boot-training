package com.example.logger;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Around("execution(* com.example.account.operations.dao.OperationsDAO.addMoney(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

		try {
			System.out.println(new Date() + " : Entering " + joinPoint.getSignature().getName());
			Object object = joinPoint.proceed();
			System.out.println(new Date() + " : Existing " + joinPoint.getSignature().getName());
			return object;
		} catch (Exception ex) {
			System.out.println(new Date() + " : Error while executing " + joinPoint.getSignature().getName());
			throw ex;
		}
	}
}
