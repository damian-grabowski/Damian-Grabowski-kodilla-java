package java.com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private final static String name = "Square";
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.pow(edge, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.edge, edge) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edge);
    }
}
