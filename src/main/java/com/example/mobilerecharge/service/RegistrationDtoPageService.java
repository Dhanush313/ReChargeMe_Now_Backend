package com.example.mobilerecharge.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mobilerecharge.dto.RegistrationPageDto;
import com.example.mobilerecharge.model.RegistrationPage;
import com.example.mobilerecharge.repository.RegistrationPageRepository;

@Service
public class RegistrationDtoPageService {

    @Autowired
    private RegistrationPageRepository userRegRepo;

    private RegistrationPageDto convertEntityToDto(RegistrationPage userReg) {
        RegistrationPageDto userRegDto = new RegistrationPageDto();
        userRegDto.setFullName(userReg.getFullName());
        userRegDto.setEmail(userReg.getEmail());
        userRegDto.setPassword(userReg.getPassword());
        userRegDto.setConfirmPassword(userReg.getConfirmPassword());
        userRegDto.setMobileNumber(userReg.getMobileNumber());
        // userRegDto.setMobileNumber(userReg.getMobileNumber());
        return userRegDto;
    }

    public boolean addUser(RegistrationPage userReg) {
        userRegRepo.save(userReg);
        return true;
    }

    public List<RegistrationPageDto> getAllUsers() {
        return userRegRepo.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

}