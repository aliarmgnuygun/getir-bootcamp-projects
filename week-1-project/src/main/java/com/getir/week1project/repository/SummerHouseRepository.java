package com.getir.week1project.repository;

import com.getir.week1project.model.SummerHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SummerHouseRepository extends JpaRepository<SummerHouse, Integer> {
}