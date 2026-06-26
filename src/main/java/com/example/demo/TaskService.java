package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // 全件取得
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // 追加
    public void addTask(String title) {
        if (title != null && !title.isBlank()) {
            taskRepository.save(new Task(title, 0));
        }
    }
}
