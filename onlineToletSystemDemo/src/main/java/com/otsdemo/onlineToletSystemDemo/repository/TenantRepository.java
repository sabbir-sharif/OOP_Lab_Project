package com.otsdemo.onlineToletSystemDemo.repository;

import com.otsdemo.onlineToletSystemDemo.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Integer> {
}
