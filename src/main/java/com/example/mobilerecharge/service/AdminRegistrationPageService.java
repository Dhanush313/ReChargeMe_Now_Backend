package com.example.mobilerecharge.service;

import com.example.mobilerecharge.model.AdminRegistrationPage;
import com.example.mobilerecharge.repository.AdminRegistrationPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminRegistrationPageService {

    @Autowired
    private final AdminRegistrationPageRepository adminRegistrationPageRepository;

    public AdminRegistrationPageService(AdminRegistrationPageRepository adminRegistrationPageRepository) {
        this.adminRegistrationPageRepository = adminRegistrationPageRepository;
    }

    public List<AdminRegistrationPage> getAllAdminRegistrationPages() {
        return adminRegistrationPageRepository.findAll();
    }

    public Optional<AdminRegistrationPage> getAdminRegistrationPageById(String adminName) {
        return adminRegistrationPageRepository.findById(adminName);
    }

    public AdminRegistrationPage saveAdminRegistrationPage(AdminRegistrationPage adminRegistrationPage) {
        return adminRegistrationPageRepository.save(adminRegistrationPage);
    }

    public void deleteAdminRegistrationPage(String adminName) {
        adminRegistrationPageRepository.deleteById(adminName);
    }
}
