package com.revature.revado.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author $ {USER}
 **/
@Data
@NoArgsConstructor
public class TodoItem {
    private int id;
    private String description;
    private boolean isComplete;
}
