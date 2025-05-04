package org.example.expensetracker.service;

import org.example.expensetracker.dto.AppUserDTO;
import org.example.expensetracker.dto.AuthDTO;
import org.example.expensetracker.dto.AuthResponseDTO;

public interface AuthService {

    AuthResponseDTO registerUser(AppUserDTO appUserDTO);
    AuthResponseDTO loginUser(AuthDTO authDTO);
}
