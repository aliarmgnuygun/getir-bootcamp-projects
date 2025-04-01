package com.getir.week1project.service;

import com.getir.week1project.model.BaseHouse;
import com.getir.week1project.model.House;
import com.getir.week1project.model.SummerHouse;
import com.getir.week1project.model.Villa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IHouseService {
    List<House> getHouseList();
    List<Villa> getVillaList();
    List<SummerHouse> getSummerHouseList();

    double getTotalPriceOfHouses();
    double getTotalPriceOfVillas();
    double getTotalPriceOfSummerHouses();
    double getTotalPriceOfAllHouses();

    double getAverageSquareMetersOfHouses();
    double getAverageSquareMetersOfVillas();
    double getAverageSquareMetersOfSummerHouses();
    double getAverageSquareMetersOfAllHouses();

    List<BaseHouse> filterHousesByRooms(int roomCount, int livingRoomCount);
}