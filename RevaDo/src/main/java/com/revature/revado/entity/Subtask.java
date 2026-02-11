package com.revature.revado.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author $ {USER}
 **/
@Data
@NoArgsConstructor
public class Subtask {
    private int subtaskId;
    private boolean isComplete;
    private String subtaskDesc;
}
