package com.getir.week1project.config;

import com.getir.week1project.model.House;
import com.getir.week1project.model.SummerHouse;
import com.getir.week1project.model.Villa;
import com.getir.week1project.repository.HouseRepository;
import com.getir.week1project.repository.SummerHouseRepository;
import com.getir.week1project.repository.VillaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    private final HouseRepository houseRepository;
    private final VillaRepository villaRepository;
    private final SummerHouseRepository summerHouseRepository;

    public DataInitializer(HouseRepository houseRepository, VillaRepository villaRepository, SummerHouseRepository summerHouseRepository) {
        this.houseRepository = houseRepository;
        this.villaRepository = villaRepository;
        this.summerHouseRepository = summerHouseRepository;
    }

    @Override
    public void run(String... args) {
        House house1 = new House(0, 200000, 120, 3, 1);
        House house2 = new House(0, 250000, 150, 3, 1);
        House house3 = new House(0, 300000, 180, 4, 1);

        Villa villa1 = new Villa(0, 500000, 250, 5, 2, true, true);
        Villa villa2 = new Villa(0, 750000, 350, 6, 2, true, true);
        Villa villa3 = new Villa(0, 1000000, 450, 7, 2, true, true);

        SummerHouse summerHouse1 = new SummerHouse(0, 300000, 100, 2, 1, true);
        SummerHouse summerHouse2 = new SummerHouse(0, 400000, 130, 3, 1, true);
        SummerHouse summerHouse3 = new SummerHouse(0, 500000, 160, 4, 2, true);

        houseRepository.saveAll(Arrays.asList(house1, house2, house3));
        villaRepository.saveAll(Arrays.asList(villa1, villa2, villa3));
        summerHouseRepository.saveAll(Arrays.asList(summerHouse1, summerHouse2, summerHouse3));
    }
}