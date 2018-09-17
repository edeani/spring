package com.realangular.demo.repository;

import com.realangular.demo.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
