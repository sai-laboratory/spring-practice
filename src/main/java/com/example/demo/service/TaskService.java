package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;

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

    // 更新
    public void updateStatus(Long id, int status) {
        taskRepository.findById(id).ifPresent(task -> {
            task.setStatus(status);
            taskRepository.save(task);
        });
    }

    // 削除
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
