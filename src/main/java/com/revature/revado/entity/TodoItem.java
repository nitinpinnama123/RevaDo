package com.revature.revado.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.UUID;

/**
 * @author $ {USER}
 **/
@Data
@Entity
@Table(name = "items")
public class TodoItem {
    private UUID id;
    private String description;
    private String status;
    @ManyToOne
    @JoinColumn(name = "created_by_id")
    private User createdBy;
    private Time timeCreated;
    @ManyToOne
    @JoinColumn(name = "assigned_to_id")
    private User assignedTo;
}
