package com.example.mobilerecharge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mobilerecharge.model.LoginPage;
import com.example.mobilerecharge.repository.LoginPageRepository;

@Service
public class LoginPageService {
    @Autowired

    public LoginPageRepository repo;
    public LoginPage addDetails(LoginPage login){
        return repo.save(login);
    }


}