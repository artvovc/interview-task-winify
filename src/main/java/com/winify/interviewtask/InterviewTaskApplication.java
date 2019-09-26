package com.winify.interviewtask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"classpath:hibernate-derby.properties"})
public class InterviewTaskApplication {

  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(InterviewTaskApplication.class);
    SpringApplication.run(InterviewTaskApplication.class, args);
    logger.info("App started");
  }
}
