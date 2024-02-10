package com.example.mobilerecharge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mobilerecharge.dto.LoginPageDto;
import com.example.mobilerecharge.model.LoginPage;

public interface LoginPageRepository extends JpaRepository<LoginPage, String>{

    void save(LoginPageDto userReg);

}