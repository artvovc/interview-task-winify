package com.winify.interviewtask.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "clients")
public class User implements Serializable {

  @Id @GeneratedValue(strategy= GenerationType.IDENTITY) private Long id;

  private String username;

  private String password;

  private BigDecimal wallet;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public BigDecimal getWallet() {
    return wallet;
  }

  public void setWallet(BigDecimal wallet) {
    this.wallet = wallet;
  }

  @Override
  public String toString() {
    return "User{"
        + "id="
        + id
        + ", login='"
        + username
        + '\''
        + ", password='"
        + password
        + '\''
        + ", wallet="
        + wallet
        + '}';
  }
}
