package com.winify.interviewtask.sevices;

import com.winify.interviewtask.domain.auth.UserDetailsCustom;
import com.winify.interviewtask.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired private UserRepository userRepo;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return new UserDetailsCustom(userRepo.findFirstByLogin(username));
  }
}
