package com.gmail.apismenniy;

public class Main {

    public static void main(String[] args) {

        Triangle triangleOne = new Triangle(3,3,3);
        Triangle triangleTwo = new Triangle(3,4,5);

        System.out.println(triangleOne.getArea());
        System.out.println(triangleTwo.getArea());


    }
}
