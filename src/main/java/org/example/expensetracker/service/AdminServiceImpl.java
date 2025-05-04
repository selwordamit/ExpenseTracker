package org.example.expensetracker.service;

import org.example.expensetracker.model.AppUser;
import org.example.expensetracker.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{
    private final UserRepository userRepository;

    public AdminServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<AppUser> getAllUsers() {
        return userRepository.findAll();
    }
}
