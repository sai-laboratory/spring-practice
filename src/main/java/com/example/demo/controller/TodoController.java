package com.example.demo.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;


@Controller
public class TodoController {
    private final TaskService taskService;

    public TodoController (TaskService taskService) {
        this.taskService = taskService;
    }

    // 一覧表示
    @GetMapping("todo")
    public String index(Model model) {
        List<Task> todoList = taskService.getAllTasks();
        model.addAttribute("todos", todoList);
        return "todo";
    }

    // タスクの追加
    @PostMapping("todo")
    public String create(TodoForm newTask) {
        taskService.addTask(newTask.getTitle());
        return "redirect:/todo";
    }

}
