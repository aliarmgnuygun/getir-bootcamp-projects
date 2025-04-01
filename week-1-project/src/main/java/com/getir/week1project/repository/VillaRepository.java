package com.getir.week1project.repository;

import com.getir.week1project.model.Villa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillaRepository extends JpaRepository<Villa, Integer> {
}