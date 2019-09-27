package com.winify.interviewtask.sevices.impl;

import com.winify.interviewtask.domain.Product;
import com.winify.interviewtask.domain.User;
import com.winify.interviewtask.domain.messages.Order;
import com.winify.interviewtask.sevices.ProductService;
import com.winify.interviewtask.sevices.UserService;
import java.util.concurrent.atomic.AtomicInteger;
import javax.jms.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class SpecificConsumer {

  @Autowired ProductService productService;

  @Autowired UserService userService;

  private static Logger logger = LoggerFactory.getLogger(SpecificConsumer.class);

  @JmsListener(destination = "queue")
  public void receiveMessage(
      @Payload Order order, @Headers MessageHeaders headers, Message message, Session session) {

    logger.info("message received: {}", order);

    User user = userService.findById(order.getUserId());

    Product product = productService.findById(order.getProductId());

    if (product.getPrice().compareTo(user.getWallet()) != 1) {

      user.setWallet(user.getWallet().subtract(product.getPrice()));

      int xint = product.getStock().decrementAndGet();

      if (xint >= 0) {

        product.setStock(new AtomicInteger(xint));

        try {

          productService.update(product);

          userService.update(user);

        } catch (Exception e) {
          // depend on error do rollback strategy
        }
      }
    }
  }
}
