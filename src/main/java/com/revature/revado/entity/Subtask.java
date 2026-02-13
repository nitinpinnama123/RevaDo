package com.revature.revado.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author $ {USER}
 **/
@Data
@Entity
@Table(name = "subtasks")
public class Subtask {
    private int subtaskId;
    private boolean isComplete;
    private String subtaskDesc;
}
