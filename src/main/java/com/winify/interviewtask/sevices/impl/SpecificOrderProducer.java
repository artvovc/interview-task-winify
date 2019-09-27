package com.winify.interviewtask.sevices.impl;

import com.winify.interviewtask.domain.messages.Order;
import com.winify.interviewtask.sevices.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class SpecificOrderProducer implements Producer<Order> {

  private static Logger logger = LoggerFactory.getLogger(SpecificOrderProducer.class);

  @Autowired private JmsTemplate jmsTemplate;

  public void send(Order message) {
    logger.info("sending message: {}", message);
    jmsTemplate.convertAndSend("queue", message);
  }
}
