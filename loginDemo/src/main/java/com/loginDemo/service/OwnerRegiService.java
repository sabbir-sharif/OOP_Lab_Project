package com.loginDemo.service;

import com.loginDemo.model.Owner;
import com.loginDemo.repository.OwnerLoginRepository;
import com.loginDemo.repository.OwnerRegiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerRegiService {

    @Autowired
    OwnerRegiRepository ownerRegiRepository;

    public void register(Owner owner){
        ownerRegiRepository.save(owner);
    }

    public boolean checkUserName(String userName){
        return ownerRegiRepository.existsByUserName(userName);
    }
}
