package com.getir.week1project.controller;

import com.getir.week1project.model.BaseHouse;
import com.getir.week1project.model.House;
import com.getir.week1project.model.SummerHouse;
import com.getir.week1project.model.Villa;
import com.getir.week1project.service.IHouseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/houses")
public class HouseController {
    private final IHouseService houseService;

    public HouseController(IHouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping("/houses")
    public List<House> getAllHouses() {
        return houseService.getHouseList();
    }

    @GetMapping("/villas")
    public List<Villa> getAllVillas() {
        return houseService.getVillaList();
    }

    @GetMapping("/summerhouses")
    public List<SummerHouse> getAllSummerHouses() {
        return houseService.getSummerHouseList();
    }

    @GetMapping("/total-price/houses")
    public double getTotalPriceOfHouses() {
        return houseService.getTotalPriceOfHouses();
    }

    @GetMapping("/total-price/villas")
    public double getTotalPriceOfVillas() {
        return houseService.getTotalPriceOfVillas();
    }

    @GetMapping("/total-price/summer-houses")
    public double getTotalPriceOfSummerHouses() {
        return houseService.getTotalPriceOfSummerHouses();
    }

    @GetMapping("/total-price/all")
    public double getTotalPriceOfAllHouses() {
        return houseService.getTotalPriceOfAllHouses();
    }

    @GetMapping("/average-square-meters/houses")
    public double getAverageSquareMetersOfHouses() {
        return houseService.getAverageSquareMetersOfHouses();
    }

    @GetMapping("/average-square-meters/villas")
    public double getAverageSquareMetersOfVillas() {
        return houseService.getAverageSquareMetersOfVillas();
    }

    @GetMapping("/average-square-meters/summer-houses")
    public double getAverageSquareMetersOfSummerHouses() {
        return houseService.getAverageSquareMetersOfSummerHouses();
    }

    @GetMapping("/average-square-meters/all")
    public double getAverageSquareMetersOfAllHouses() {
        return houseService.getAverageSquareMetersOfAllHouses();
    }

    @GetMapping("/filter")
    public List<BaseHouse> filterHousesByRooms(@RequestParam int roomCount,
                                               @RequestParam int livingRoomCount) {
        return houseService.filterHousesByRooms(roomCount, livingRoomCount);
    }
}