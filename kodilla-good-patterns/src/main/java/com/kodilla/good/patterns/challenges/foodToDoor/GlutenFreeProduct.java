package com.kodilla.good.patterns.challenges.foodToDoor;

import java.util.Objects;

public class GlutenFreeProduct extends Product {

    private String productDescription;

    public GlutenFreeProduct(String productName, String productDescription) {
        super(productName);
        this.productDescription = productDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GlutenFreeProduct)) return false;
        GlutenFreeProduct that = (GlutenFreeProduct) o;
        return Objects.equals(productDescription, that.productDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productDescription);
    }

//    @Override
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + productDescription.hashCode();
//        return result;
//    }
}
