package com.getir.week1project.service;

import com.getir.week1project.model.BaseHouse;
import com.getir.week1project.model.House;
import com.getir.week1project.model.SummerHouse;
import com.getir.week1project.model.Villa;
import com.getir.week1project.repository.HouseRepository;
import com.getir.week1project.repository.SummerHouseRepository;
import com.getir.week1project.repository.VillaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HouseService implements IHouseService{
    private final HouseRepository houseRepository;
    private final VillaRepository villaRepository;
    private final SummerHouseRepository summerHouseRepository;

    public HouseService(HouseRepository houseRepository, VillaRepository villaRepository, SummerHouseRepository summerHouseRepository) {
        this.houseRepository = houseRepository;
        this.villaRepository = villaRepository;
        this.summerHouseRepository = summerHouseRepository;
    }

    @Override
    public List<House> getHouseList() {
        return houseRepository.findAll();
    }

    @Override
    public List<Villa> getVillaList() {
        return villaRepository.findAll();
    }

    @Override
    public List<SummerHouse> getSummerHouseList() {
        return summerHouseRepository.findAll();
    }

    @Override
    public double getTotalPriceOfHouses() {
        return getHouseList().stream()
                .mapToDouble(BaseHouse::getPrice)
                .sum();
    }

    @Override
    public double getTotalPriceOfVillas() {
        return getVillaList().stream()
                .mapToDouble(BaseHouse::getPrice)
                .sum();
    }

    @Override
    public double getTotalPriceOfSummerHouses() {
        return getSummerHouseList().stream()
                .mapToDouble(BaseHouse::getPrice)
                .sum();
    }

    @Override
    public double getTotalPriceOfAllHouses() {
        return getTotalPriceOfHouses() +
                getTotalPriceOfVillas() +
                getTotalPriceOfSummerHouses();
    }

    @Override
    public double getAverageSquareMetersOfHouses() {
        List<House> houses = getHouseList();
        if (houses.isEmpty()) return 0;
        return houses.stream()
                .mapToDouble(BaseHouse::getSquareMeters)
                .average()
                .orElse(0);
    }

    @Override
    public double getAverageSquareMetersOfVillas() {
        List<Villa> villas = getVillaList();
        if (villas.isEmpty()) return 0;
        return villas.stream()
                .mapToDouble(BaseHouse::getSquareMeters)
                .average()
                .orElse(0);
    }

    @Override
    public double getAverageSquareMetersOfSummerHouses() {
        List<SummerHouse> summerHouses = getSummerHouseList();
        if (summerHouses.isEmpty()) return 0;
        return summerHouses.stream()
                .mapToDouble(BaseHouse::getSquareMeters)
                .average()
                .orElse(0);
    }

    @Override
    public double getAverageSquareMetersOfAllHouses() {
        List<BaseHouse> allHouses = new ArrayList<>();
        allHouses.addAll(getHouseList());
        allHouses.addAll(getVillaList());
        allHouses.addAll(getSummerHouseList());

        if (allHouses.isEmpty()) return 0;
        return allHouses.stream()
                .mapToDouble(BaseHouse::getSquareMeters)
                .average()
                .orElse(0);
    }

    /**
     * Filters houses based on the number of rooms and living rooms.
     *
     * @param roomCount        The number of rooms to filter by.
     * @param livingRoomCount  The number of living rooms to filter by.
     * @return A list of houses that match the specified criteria.
     */
    @Override
    public List<BaseHouse> filterHousesByRooms(int roomCount, int livingRoomCount) {
        List<BaseHouse> allHouses = new ArrayList<>();
        allHouses.addAll(getHouseList());
        allHouses.addAll(getVillaList());
        allHouses.addAll(getSummerHouseList());

        return allHouses.stream()
                .filter(house -> house.getRoomCount() == roomCount &&
                        house.getLivingRoomCount() == livingRoomCount)
                .collect(Collectors.toList());
    }
}