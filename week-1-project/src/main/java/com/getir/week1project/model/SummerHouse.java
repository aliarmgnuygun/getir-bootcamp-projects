package com.getir.week1project.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder
public class SummerHouse extends BaseHouse{
    private boolean isBeachFront;

    public SummerHouse(int id, double price, double squareMeters, int roomCount, int livingRoomCount, boolean isBeachFront) {
        super(id, price, squareMeters, roomCount, livingRoomCount);
        this.isBeachFront = isBeachFront;
    }

    @Override
    public String toString() {
        return "SummerHouse{" +
                super.toString() +
                ", isBeachFront: " + isBeachFront +
                '}';
    }
}