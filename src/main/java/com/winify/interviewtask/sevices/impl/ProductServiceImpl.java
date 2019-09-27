package com.winify.interviewtask.sevices.impl;

import com.winify.interviewtask.domain.Product;
import com.winify.interviewtask.domain.messages.Order;
import com.winify.interviewtask.repositories.ProductRepository;
import com.winify.interviewtask.sevices.Producer;
import com.winify.interviewtask.sevices.ProductService;
import java.text.MessageFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  private static Logger logger = LoggerFactory.getLogger(ProductService.class);

  @Autowired private ProductRepository productRepo;

  @Autowired private Producer<Order> producer;

  @Override
  public void buy(Long productId, Long user) {

    logger.info("buy -> productId: {}, userId: {}", productId, user);

    producer.send(new Order(productId, user));
  }

  @Override
  public Iterable<Product> all() {
    return productRepo.findAll();
  }

  @Override
  public Product findById(Long id) {
    return productRepo
        .findById(id)
        .orElseThrow(
            () -> {
              logger.error("Product with id {} does not exists", id);
              return new RuntimeException(
                  MessageFormat.format("Product with id {} does not exists", id));
            });
  }

  @Override
  public Product update(Product product) {
    return productRepo.save(product);
  }
}
