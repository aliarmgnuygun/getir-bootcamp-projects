package com.getir.week1project.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@SuperBuilder
public class House extends BaseHouse{
    public House(int id , double price, double squareMeters, int roomCount, int livingRoomCount) {
        super(id, price, squareMeters, roomCount, livingRoomCount);
    }

    @Override
    public String toString() {
        return "House{" + super.toString() + '}';
    }
}