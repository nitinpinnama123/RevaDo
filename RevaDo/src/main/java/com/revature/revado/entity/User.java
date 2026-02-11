package com.revature.revado.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author $ {USER}
 **/
@Data
@NoArgsConstructor
public class User {
    private UUID id;
    private String username;
    private String password;
}
