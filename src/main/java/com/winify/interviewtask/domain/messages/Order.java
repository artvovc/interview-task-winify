package com.winify.interviewtask.domain.messages;

import java.io.Serializable;

public class Order implements Serializable {

  private Long productId;

  private Long userId;

  public Order() {}

  public Order(Long productId, Long userId) {
    this.productId = productId;
    this.userId = userId;
  }

  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  @Override
  public String toString() {
    return "Order{" + "productId=" + productId + ", userId=" + userId + '}';
  }
}
