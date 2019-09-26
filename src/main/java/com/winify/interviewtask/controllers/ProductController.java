package com.winify.interviewtask.controllers;

import com.winify.interviewtask.domain.Product;
import com.winify.interviewtask.sevices.ProductService;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  Logger logger = LoggerFactory.getLogger(ProductController.class);

  @Autowired private ProductService productService;

  @GetMapping(produces = "application/json")
  public Iterable<Product> getAll(HttpServletRequest request) {
    logger.info("Method: {} Path: {}", request.getMethod(), request.getContextPath());
    return productService.all();
  }
}
