package com.jiffy.jiffy.controller;

import com.jiffy.jiffy.model.Task;
import com.jiffy.jiffy.service.TaskService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor()
public class TaskController {
    private final TaskService taskService;

    

    @GetMapping("/gettask")
    public List<Task> getTasks() {
        System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        return taskService.getAllTasks();
    }

    @PostMapping("/createtask")
    public Task createTask(@RequestBody Task task) {
        System.out.println("helooooooooooooooooooooooooooooooooooooo");
        return taskService.createTask(task);
    }
}
