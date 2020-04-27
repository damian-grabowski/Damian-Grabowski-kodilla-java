package com.kodilla.good.patterns.challenges.foodToDoor;

import java.util.Objects;

public class MeatProduct extends Product {

    private String typeOfSteak;

    public MeatProduct(String productName, String typeOfSteak) {
        super(productName);
        this.typeOfSteak = typeOfSteak;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MeatProduct)) return false;
        if (!super.equals(o)) return false;
        MeatProduct that = (MeatProduct) o;
        return Objects.equals(typeOfSteak, that.typeOfSteak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfSteak);
    }
}
