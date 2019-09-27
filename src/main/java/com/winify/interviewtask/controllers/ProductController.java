package com.winify.interviewtask.controllers;

import com.winify.interviewtask.domain.auth.UserDetailsCustom;
import com.winify.interviewtask.sevices.ProductService;
import com.winify.interviewtask.sevices.UserService;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

  private static Logger logger = LoggerFactory.getLogger(ProductController.class);

  @Autowired private ProductService productService;
  @Autowired private UserService userService;

  @RequestMapping
  public String getAll(
      HttpServletRequest request, UsernamePasswordAuthenticationToken principal, Model model) {
    logger.info("Method: {} Path: {}", request.getMethod(), request.getContextPath());
    model.addAttribute("products", productService.all());
    model.addAttribute(
        "balance",
        userService.findById(((UserDetailsCustom) principal.getPrincipal()).getId()).getWallet());
    return "index";
  }

  @RequestMapping(path = "/{productId}", method = RequestMethod.POST)
  public String but(
      @PathVariable("productId") Long productId,
      HttpServletRequest request,
      UsernamePasswordAuthenticationToken principal,
      Model model) {
    logger.info("Method: {} Path: {}", request.getMethod(), request.getContextPath());
    productService.buy(productId, ((UserDetailsCustom) principal.getPrincipal()).getId());
    model.addAttribute("products", productService.all());
    model.addAttribute(
        "balance",
        userService.findById(((UserDetailsCustom) principal.getPrincipal()).getId()).getWallet());
    return "index";
  }
}
