package com.loginDemo.repository;

import com.loginDemo.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface OwnerLoginRepository extends JpaRepository<Owner, Integer> {
    //Optional<Owner> findByUserName(String userName);

    public boolean existsByUserName(String userName);
    public boolean existsByPassword(String password);

}
