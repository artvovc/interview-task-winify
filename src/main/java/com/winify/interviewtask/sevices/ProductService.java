package com.winify.interviewtask.sevices;

import com.winify.interviewtask.domain.Product;

public interface ProductService {
  void buy(Long productId, Long user);

  Iterable<Product> all();

  Product findById(Long id);

  Product update(Product product);
}
