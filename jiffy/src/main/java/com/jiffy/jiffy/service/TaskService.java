package com.jiffy.jiffy.service;

import com.jiffy.jiffy.model.Task;
import com.jiffy.jiffy.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        List<Task> tasks = taskRepository.findAll();
        System.out.println("Fetched tasks: " + tasks); // Debugging
        return tasks;
    }
    

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
}
