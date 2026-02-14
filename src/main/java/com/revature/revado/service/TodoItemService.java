package com.revature.revado.service;

import com.revature.revado.entity.TodoItem;
import com.revature.revado.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author $ {USER}
 **/
@Service
@RequiredArgsConstructor
public class TodoItemService {
    private final TodoRepository todoRepo;

    public TodoItem createTodoItem(String description, String status, UUID createdById, UUID assignedToId) {

    }

}
