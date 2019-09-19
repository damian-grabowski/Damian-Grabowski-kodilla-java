package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private final static String name = "Triangle";
    private double edgeA;
    private double edgeB;
    private double edgeC;

    @Override
    public String getShapeName() {
        return name;
    }

    private boolean checkTriangleCondition() {
        return (edgeA + edgeB > edgeC &&
                edgeA + edgeC > edgeB &&
                edgeB + edgeC > edgeA);
    }

    private double getHalfCircuit() {
        return (edgeA + edgeB + edgeC) / 2;
    }

    //wzor Herona
    private double heronsPattern(double halfCircuit) {
        return Math.sqrt(halfCircuit * (halfCircuit - edgeA) * (halfCircuit - edgeB) * (halfCircuit - edgeC));
    }

    @Override
    public double getField() {
        if (checkTriangleCondition()) {
            double halfOfCircuit = getHalfCircuit();
            return heronsPattern(halfOfCircuit);
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.edgeA, edgeA) == 0 &&
                Double.compare(triangle.edgeB, edgeB) == 0 &&
                Double.compare(triangle.edgeC, edgeC) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeA, edgeB, edgeC);
    }
}



