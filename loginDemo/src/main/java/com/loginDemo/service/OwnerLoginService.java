package com.loginDemo.service;

import com.loginDemo.model.Owner;
import com.loginDemo.repository.OwnerLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerLoginService {

    @Autowired
    OwnerLoginRepository ownerLoginRepository;

    public void register(Owner owner){
        ownerLoginRepository.save(owner);
    }

    public boolean checkUserName(String userName){
        return ownerLoginRepository.existsByUserName(userName);
    }

    public boolean checkPassword(String password){
        return ownerLoginRepository.existsByPassword(password);
    }
}
