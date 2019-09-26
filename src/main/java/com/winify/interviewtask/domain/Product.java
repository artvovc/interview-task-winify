package com.winify.interviewtask.domain;

import com.winify.interviewtask.domain.converters.AtomicIntConverter;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import javax.persistence.*;

@Entity(name = "products")
public class Product implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String owner;

  private BigDecimal price;

  @Convert(converter = AtomicIntConverter.class)
  private AtomicInteger stock;

  @Temporal(TemporalType.TIMESTAMP)
  private Date creationtime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public AtomicInteger getStock() {
    return stock;
  }

  public void setStock(AtomicInteger stock) {
    this.stock = stock;
  }

  public Date getCreationtime() {
    return creationtime;
  }

  public void setCreationtime(Date creationtime) {
    this.creationtime = creationtime;
  }

  @Override
  public String toString() {
    return "Product{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", owner='"
        + owner
        + '\''
        + ", price="
        + price
        + ", stock="
        + stock
        + ", creationtime="
        + creationtime
        + '}';
  }
}
