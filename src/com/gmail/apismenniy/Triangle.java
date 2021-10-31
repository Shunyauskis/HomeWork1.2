package com.gmail.apismenniy;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        super();
    }

    public Triangle(int sideA, int sideB, int sideC) {
        super();
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
    public double getArea(){
        double halfPerimetr = (sideA+sideB+sideC)/2;

        return Math.sqrt(halfPerimetr*(halfPerimetr-sideA)*(halfPerimetr-sideB)*(halfPerimetr-sideC));
    }
}
