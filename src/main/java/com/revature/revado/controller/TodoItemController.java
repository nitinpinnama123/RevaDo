package com.revature.revado.controller;

import com.revature.revado.entity.TodoItem;
import com.revature.revado.service.TodoItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author $ {USER}
 **/
@RestController
@RequestMapping("/todoItem")
public class TodoItemController {
    @GetMapping
    public TodoItem getTodoItemInformation(){
        TodoItem item = new TodoItem();
        item.setId(1);
        item.setComplete(false);
        item.setDescription("");
        return item;
    }

    @PostMapping
    public ResponseEntity<TodoItem> addTodoItem(@RequestBody TodoItem item)
    {
        item.setId(item.getId());
        item.setComplete(true);
        item.setDescription(item.getDescription());
        return ResponseEntity.status(HttpStatus.MOVED_PERMANENTLY).header("custom-header", "custom value").body(item);
    }

    @PatchMapping
    public TodoItem editTodo(@RequestBody TodoItem item)
    {
        item.setComplete(item.isComplete());
        item.setDescription(item.getDescription());
        return item;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TodoItem> deleteTodo(@RequestBody TodoItem item)
    {
        TodoItemService todoService = null;
        todoService.deleteTodo(item.getId());
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("custom-header", "custom value")
                .body(item);
    }
}
