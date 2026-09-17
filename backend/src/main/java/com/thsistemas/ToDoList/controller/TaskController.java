package com.thsistemas.ToDoList.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thsistemas.ToDoList.model.Task;
import com.thsistemas.ToDoList.service.TaskService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("api/tasks") 
public class TaskController {
    private final TaskService taskService;
    
    //Injetando o service via construtor
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    
    //requisições
    // Get

    //listar todos
    @GetMapping
    public List<Task> getAll() {
        return taskService.getAllTasks();
    }

    //listar por id
    @GetMapping("/{id}")
    public ResponseEntity<Task> getById(@PathVariable Long id) {
        Task task = taskService.getTaskById(id);
        return task != null ? ResponseEntity.ok(task) : ResponseEntity.notFound().build();
    }
    
    
    // Post
    @PostMapping
    public ResponseEntity<Task> create(@RequestBody @Valid Task task) {
        Task created = taskService.save(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    // Put
    @PutMapping("/{id}")
    public ResponseEntity<Task> update(@PathVariable Long id, @RequestBody @Valid Task task) {
        Task updated = taskService.update(id, task);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }
    
    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        try{
            taskService.delete(id);
            return ResponseEntity.noContent().build();
        }catch(RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

}
