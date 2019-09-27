package com.winify.interviewtask.sevices;

public interface Producer<M> {

  void send(M message);
}
