package com.jiffy.jiffy.repository;

import com.jiffy.jiffy.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
