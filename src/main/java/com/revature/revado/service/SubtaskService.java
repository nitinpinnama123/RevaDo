package com.revature.revado.service;

import com.revature.revado.repository.SubtaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author $ {USER}
 **/
@Service
@RequiredArgsConstructor
public class SubtaskService {
    private final SubtaskRepository subtaskRepo;
}
