package org.example.expensetracker.service;

import org.example.expensetracker.model.AppUser;

import java.util.List;

public interface AdminService {
    List<AppUser> getAllUsers();
}
