package Homework07.geometry;

import java.util.Scanner;

public class Point {
    private double Abscissa=0;
    private double Ordinate=0;

    @Override
    public String toString() {
        return "Point{" +
                "Abscissa=" + Abscissa +
                ", Ordinate=" + Ordinate +
                '}';
    }

    public double getAbscissa() {
        return Abscissa;
    }

    public void setAbscissa(double abscissa) {
        Abscissa = abscissa;
    }

    public double getOrdinate() {
        return Ordinate;
    }

    public void setOrdinate(double ordinate) {
        Ordinate = ordinate;
    }
}
