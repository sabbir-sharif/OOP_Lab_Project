package com.otsdemo.onlineToletSystemDemo.service;

import com.otsdemo.onlineToletSystemDemo.controller.TenantController;
import com.otsdemo.onlineToletSystemDemo.model.Tenant;
import com.otsdemo.onlineToletSystemDemo.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TenantService {

    @Autowired
    private TenantRepository tenantRepository;

    public void addtenant(Tenant tenant) {
        tenantRepository.save(tenant);
    }
}
