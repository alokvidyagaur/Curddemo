package com.example.demo123Aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@Aspect
@EnableAspectJAutoProxy
public class AOP 
{
	@After("execution(public void com.example.demo.rest.EmployeerestController.deleteById()")
 public void Run()
 {
	 System.out.println("hello this has been deleted");
 }
}
