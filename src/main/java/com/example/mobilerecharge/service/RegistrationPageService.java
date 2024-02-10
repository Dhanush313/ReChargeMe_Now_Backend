package com.example.mobilerecharge.service;

import com.example.mobilerecharge.model.RegistrationPage;
import com.example.mobilerecharge.repository.RegistrationPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationPageService {

    @Autowired
    private final RegistrationPageRepository registrationPageRepository;

    public RegistrationPageService(RegistrationPageRepository registrationPageRepository) {
        this.registrationPageRepository = registrationPageRepository;
    }

    public List<RegistrationPage> getAllRegistrationPages() {
        return registrationPageRepository.findAll();
    }

    public Optional<RegistrationPage> getRegistrationPageById(String fullName) {
        return registrationPageRepository.findById(fullName);
    }

    public RegistrationPage saveRegistrationPage(RegistrationPage registrationPage) {
        return registrationPageRepository.save(registrationPage);
    }

    public void deleteRegistrationPage(String fullName) {
        registrationPageRepository.deleteById(fullName);
    }
}
