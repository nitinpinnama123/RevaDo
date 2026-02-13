package com.revature.revado.repository;

import com.revature.revado.entity.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author $ {USER}
 **/
@Repository
public interface TodoRepository extends JpaRepository<TodoItem, UUID> {

}
