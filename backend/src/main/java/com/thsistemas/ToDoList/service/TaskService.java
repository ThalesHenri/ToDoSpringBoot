package com.thsistemas.ToDoList.service;
import java.util.ArrayList;
import java.util.List;

import com.thsistemas.ToDoList.model.Task;

public class TaskService {
    public TaskService() {
        
    }




    public List<Task> getAllTasks() {
        // Lógica para obter todas as tarefas
        return new ArrayList<>();
    }


    public Task getTaskById(Long id) {
        // Lógica para obter uma tarefa por ID
        return new Task();
    }

    public Task save(Task task) {
        // Lógica para salvar uma nova tarefa
        return task;
    }

    public Task update(Long id, Task task) {
        // Lógica para atualizar uma tarefa existente
        return task;
    }
    public void delete(Long id) {
        // Lógica para deletar uma tarefa por ID
    }
}
