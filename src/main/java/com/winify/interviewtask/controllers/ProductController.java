package com.winify.interviewtask.controllers;

import com.winify.interviewtask.sevices.ProductService;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

  private Logger logger = LoggerFactory.getLogger(ProductController.class);

  @Autowired private ProductService productService;

  @RequestMapping
  public String getAll(HttpServletRequest request, Model model) {
    logger.info("Method: {} Path: {}", request.getMethod(), request.getContextPath());
    model.addAttribute("products", productService.all());
    return "homepage";
  }
}
