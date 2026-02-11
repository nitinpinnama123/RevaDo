package com.revature.revado.controller;

import com.revature.revado.entity.Subtask;
import com.revature.revado.entity.TodoItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author $ {USER}
 **/

@RestController
@RequestMapping("/todoItem/{id}/subtask")
public class SubtaskController {
    @GetMapping
    public Subtask getSubtaskInformation(){
        Subtask task = new Subtask();
        task.setSubtaskId(1);
        task.setSubtaskDesc("");
        task.setComplete(true);
        return task;
    }
}
