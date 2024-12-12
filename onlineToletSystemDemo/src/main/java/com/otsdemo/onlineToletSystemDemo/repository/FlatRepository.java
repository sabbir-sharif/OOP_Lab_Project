package com.otsdemo.onlineToletSystemDemo.repository;

import com.otsdemo.onlineToletSystemDemo.model.Flat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlatRepository extends JpaRepository<Flat, Long> {
}
