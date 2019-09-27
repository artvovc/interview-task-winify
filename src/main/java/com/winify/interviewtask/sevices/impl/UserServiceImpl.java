package com.winify.interviewtask.sevices.impl;

import com.winify.interviewtask.domain.User;
import com.winify.interviewtask.domain.auth.UserDetailsCustom;
import com.winify.interviewtask.repositories.UserRepository;
import com.winify.interviewtask.sevices.UserService;
import java.text.MessageFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private static Logger logger = LoggerFactory.getLogger(UserService.class);

  @Autowired private UserRepository userRepo;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return new UserDetailsCustom(userRepo.findFirstByLogin(username));
  }

  @Override
  public User findById(Long id) {
    return userRepo
        .findById(id)
        .orElseThrow(
            () -> {
              logger.error("User with id {} does not exists", id);
              return new RuntimeException(
                  MessageFormat.format("User with id {} does not exists", id));
            });
  }

  @Override
  public User update(User user) {
    return userRepo.save(user);
  }
}
