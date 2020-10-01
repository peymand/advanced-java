package com.kaheshan.dummy.aspect;

import lombok.extern.log4j.Log4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
@Log4j
public class MyCloudLogAsyncAspect {

	@Before("execution(public void save*())")
	public void logMethod() {
		log.debug("=====>>> Logging to Cloud in async fashion");
	}

}
