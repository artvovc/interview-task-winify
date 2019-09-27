package com.winify.interviewtask.sevices;

import com.winify.interviewtask.domain.Product;
import com.winify.interviewtask.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  Logger logger = LoggerFactory.getLogger(ProductService.class);

  @Autowired private ProductRepository productRepo;

  @Override
  public void buy(Long productId, Long user) {

    logger.info("buy -> productId: {}, userId: {}", productId, user);

    

  }

  @Override
  public Iterable<Product> all() {
    return productRepo.findAll();
  }
}
