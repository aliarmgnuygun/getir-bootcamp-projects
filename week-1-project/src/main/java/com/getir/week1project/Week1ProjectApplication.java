package com.getir.week1project;

import com.getir.week1project.service.IHouseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Week1ProjectApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Week1ProjectApplication.class, args);

		IHouseService houseService = context.getBean(IHouseService.class);
		System.out.println("\n--- HOUSE LISTS ---");
		System.out.println("Houses: " + houseService.getHouseList());
		System.out.println("Villas: " + houseService.getVillaList());
		System.out.println("Summer Houses: " + houseService.getSummerHouseList());

		System.out.println("\n--- TOTAL PRICES ---");
		System.out.println("Total Price of Houses: " + houseService.getTotalPriceOfHouses());
		System.out.println("Total Price of Villas: " + houseService.getTotalPriceOfVillas());
		System.out.println("Total Price of Summer Houses: " + houseService.getTotalPriceOfSummerHouses());
		System.out.println("Total Price of All Houses: " + houseService.getTotalPriceOfAllHouses());

		System.out.println("\n--- AVERAGE SQUARE METERS ---");
		System.out.println("Average Square Meters of Houses: " + houseService.getAverageSquareMetersOfHouses());
		System.out.println("Average Square Meters of Villas: " + houseService.getAverageSquareMetersOfVillas());
		System.out.println("Average Square Meters of Summer Houses: " + houseService.getAverageSquareMetersOfSummerHouses());
		System.out.println("Average Square Meters of All Houses: " + houseService.getAverageSquareMetersOfAllHouses());

		System.out.println("\n--- FILTERED HOUSES ---");
		System.out.println("Houses with 3 rooms and 1 living room: " + houseService.filterHousesByRooms(3, 1));
	}
}