package com.getir.week1project.repository;

import com.getir.week1project.model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<House, Integer> {
}