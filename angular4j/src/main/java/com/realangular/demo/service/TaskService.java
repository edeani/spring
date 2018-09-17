package com.realangular.demo.service;

import com.realangular.demo.domain.Task;

public interface TaskService {
    Iterable<Task> list();
    Task save(Task task);
}
