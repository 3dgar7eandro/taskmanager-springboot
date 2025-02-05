package com.tuusuario.taskmaster.repository;

import com.tuusuario.taskmaster.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
