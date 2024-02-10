package com.example.mobilerecharge.repository;

import com.example.mobilerecharge.model.AdminRegistrationPage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRegistrationPageRepository extends JpaRepository<AdminRegistrationPage, String> {
    // You can add custom query methods if needed
}
