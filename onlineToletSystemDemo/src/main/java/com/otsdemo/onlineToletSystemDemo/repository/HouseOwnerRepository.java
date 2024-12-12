package com.otsdemo.onlineToletSystemDemo.repository;

import com.otsdemo.onlineToletSystemDemo.model.Flat;
import com.otsdemo.onlineToletSystemDemo.model.HouseOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseOwnerRepository extends JpaRepository<HouseOwner, Long> {

    public HouseOwner findByName(String houseOwnnerId);
}
