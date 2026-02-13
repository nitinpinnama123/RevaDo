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
@Table(name = "items")
public class TodoItem {
    private int id;
    private String description;
    private boolean isComplete;
}
