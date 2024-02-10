package com.example.mobilerecharge.repository;

import com.example.mobilerecharge.model.RegistrationPage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationPageRepository extends JpaRepository<RegistrationPage, String> {
    // You can add custom query methods if needed
}
