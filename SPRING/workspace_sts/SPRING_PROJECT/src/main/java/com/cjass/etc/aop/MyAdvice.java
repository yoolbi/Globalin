package com.cjass.etc.aop;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
@Aspect
public class MyAdvice {

	@Pointcut("execution(* com.cjass.web.member.controller.MemberController.list(..))")
	public void advice() {
	}

	@Around("advice()")
	public Object checkSession(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("Around...");

		// HttpServletRequest req = null;
		// Object[] ob = joinPoint.getArgs();
		// if (ob[0] instanceof HttpServletRequest) {
		// req = (HttpServletRequest) ob[0];
		// }

		ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		HttpServletRequest request = sra.getRequest();

		HttpSession session = request.getSession();
		String uri = request.getRequestURI();
		System.out.println("SESSION ID IS " + session.getId());
//		return "error/error";
		return joinPoint.proceed();
	}

	@Before("advice()")
	public void before(JoinPoint joinPoint) throws IOException {
		System.out.println("Before...");
//		ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
//		HttpServletRequest request = sra.getRequest();
//
//		HttpSession session = request.getSession();
//		String uri = request.getRequestURI();
//		System.out.println("SESSION ID IS " + session.getId());
//
//		HttpServletResponse res = sra.getResponse();
//		PrintWriter pw = res.getWriter();
//		pw.println("<script>");
//		pw.println("alert('Please Login.');document.location.href='/';");
//		pw.println("</script>");
//		pw.flush();
//		pw.close();
	}

	@After("advice()")
	public void after(JoinPoint joinPoint) {
		System.out.println("After...");
	}
}
