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
public class Villa extends BaseHouse {
    private boolean hasPool;
    private boolean hasGarden;

    public Villa(int id, double price, double squareMeters, int roomCount, int livingRoomCount, boolean hasPool, boolean hasGarden) {
        super(id, price, squareMeters, roomCount, livingRoomCount);
        this.hasPool = hasPool;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                ", hasPool: " + hasPool +
                ", hasGarden: " + hasGarden +
                '}';
    }
}