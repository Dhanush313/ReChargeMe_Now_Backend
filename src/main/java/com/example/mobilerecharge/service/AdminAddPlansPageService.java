package com.example.mobilerecharge.service;

import com.example.mobilerecharge.model.AdminAddPlansPage;
import com.example.mobilerecharge.repository.AdminAddPlansPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminAddPlansPageService {

    @Autowired
    private final AdminAddPlansPageRepository adminAddPlansPageRepository;

    public AdminAddPlansPageService(AdminAddPlansPageRepository adminAddPlansPageRepository) {
        this.adminAddPlansPageRepository = adminAddPlansPageRepository;
    }

    public List<AdminAddPlansPage> getAllPlans() {
        return adminAddPlansPageRepository.findAll();
    }

    public void addPlan(AdminAddPlansPage adminAddPlansPage) {
        adminAddPlansPageRepository.save(adminAddPlansPage);
    }

    // You can add more methods for updating, deleting, or fetching a specific plan
}
