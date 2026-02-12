package com.revature.revado.service;

import com.revature.revado.repository.TodoRepository;
import org.springframework.stereotype.Service;

/**
 * @author $ {USER}
 **/
@Service
public class TodoItemService {
    private final TodoRepository todoRepository;
    public TodoItemService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void deleteTodo(int id) {
        if (!todoRepository.existsById(id)) {
            throw new RuntimeException("Todo not found with id: " + id);
        }
        todoRepository.deleteById(id);
    }
}
