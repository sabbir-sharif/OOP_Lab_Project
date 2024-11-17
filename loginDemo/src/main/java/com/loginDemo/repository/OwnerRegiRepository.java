package com.loginDemo.repository;

import com.loginDemo.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRegiRepository extends JpaRepository<Owner, Integer> {

    public boolean existsByUserName(String userName);
}
