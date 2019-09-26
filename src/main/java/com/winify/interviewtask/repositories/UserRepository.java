package com.winify.interviewtask.repositories;

import com.winify.interviewtask.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {}
