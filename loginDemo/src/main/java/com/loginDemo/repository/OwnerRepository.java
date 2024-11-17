package com.loginDemo.repository;

import com.loginDemo.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Property, Integer> {
}
