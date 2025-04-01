package com.getir.week1project.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class BaseHouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double price;
    private double squareMeters;
    private int roomCount;
    private int livingRoomCount;


    @Override
    public String toString() {
        return "BaseHouse{" +
                "id=" + id +
                ", price=" + price +
                ", squareMeters=" + squareMeters +
                ", roomCount=" + roomCount +
                ", livingRoomCount=" + livingRoomCount +
                '}';
    }
}