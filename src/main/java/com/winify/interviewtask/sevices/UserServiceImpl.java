package com.winify.interviewtask.sevices;

import com.winify.interviewtask.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

  @Autowired private UserRepository userRepo;
}
