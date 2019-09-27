package com.winify.interviewtask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({
  "classpath:hibernate-derby-embedded.properties",
  "classpath:active-mq-embedded.properties",
})
public class InterviewTaskApplication {

  private static Logger logger = LoggerFactory.getLogger(InterviewTaskApplication.class);

  public static void main(String[] args) {

    SpringApplication.run(InterviewTaskApplication.class, args);
    logger.info("App started");
  }
}
