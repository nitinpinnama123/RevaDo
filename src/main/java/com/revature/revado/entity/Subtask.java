package com.revature.revado.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author $ {USER}
 **/
@Data
@Entity
@Table(name = "subtasks")
public class Subtask {
    private UUID subtaskId;
    private String subtaskDesc;
    private String status;
    @ManyToOne
    @JoinColumn(name = "todo_item_id")
    private TodoItem todoItem;
}
