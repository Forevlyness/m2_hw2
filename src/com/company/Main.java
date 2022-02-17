package com.company;

public class Main {

    public static void main(String[] args) {
	createObject("Car").print();
        System.out.println("----------------------");
    createObject("Computer").print();
        System.out.println("----------------------");
    createObject("Phone").print();
    }
    public static Technics createObject(String calssName){
        switch (calssName){
            case "Car":
                return new Car(2004, "AUDI", "R8", 4, "Sedan");
            case "Computer":
                return new Computer(2022, "AOC", "ASUS", "intel core i5 9400f", "GTX 1660 super", 16);
            case "Phone":
                return new Phone(2022, "iPhone", "12 mini", "ios", 128);
            default:
                return null;
        }
    }
}
