package com.winify.interviewtask.sevices;

import com.winify.interviewtask.domain.Product;
import com.winify.interviewtask.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired private ProductRepository productRepo;

  @Override
  public void buy(Long productId, Long user) {}

  @Override
  public Iterable<Product> all() {
    return productRepo.findAll();
  }
}
