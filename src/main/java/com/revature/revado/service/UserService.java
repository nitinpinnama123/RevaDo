package com.revature.revado.service;

import com.revature.revado.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author $ {USER}
 **/
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepo;
}
