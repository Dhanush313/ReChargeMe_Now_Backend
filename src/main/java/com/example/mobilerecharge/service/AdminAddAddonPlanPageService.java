package com.example.mobilerecharge.service;

import com.example.mobilerecharge.model.AdminAddAddonPlanPage;
import com.example.mobilerecharge.repository.AdminAddAddonPlanPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminAddAddonPlanPageService {

    @Autowired
    private final AdminAddAddonPlanPageRepository adminAddAddonPlanPageRepository;

    public AdminAddAddonPlanPageService(AdminAddAddonPlanPageRepository adminAddAddonPlanPageRepository) {
        this.adminAddAddonPlanPageRepository = adminAddAddonPlanPageRepository;
    }

    public List<AdminAddAddonPlanPage> getAllAdminAddAddonPlans() {
        return adminAddAddonPlanPageRepository.findAll();
    }

    public Optional<AdminAddAddonPlanPage> getAdminAddAddonPlanById(String addonName) {
        return adminAddAddonPlanPageRepository.findById(addonName);
    }

    public AdminAddAddonPlanPage saveAdminAddAddonPlan(AdminAddAddonPlanPage adminAddAddonPlanPage) {
        return adminAddAddonPlanPageRepository.save(adminAddAddonPlanPage);
    }

    public void deleteAdminAddAddonPlan(String addonName) {
        adminAddAddonPlanPageRepository.deleteById(addonName);
    }
}
