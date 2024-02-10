
package com.example.mobilerecharge.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mobilerecharge.model.LoginPage;
import com.example.mobilerecharge.repository.LoginPageRepository;

@Service
public class LoginDtoPageService {

    @Autowired
    private LoginPageRepository userRegRepo;

    public boolean addUser(LoginPage userlog) {
        userRegRepo.save(userlog);
        return true;
    }

    
}