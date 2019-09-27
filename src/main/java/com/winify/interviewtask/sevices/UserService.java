package com.winify.interviewtask.sevices;

import com.winify.interviewtask.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

  User findById(Long id);

  User update(User user);
}
