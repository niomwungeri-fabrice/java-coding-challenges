package edu.miu.technicalInterview.OneOOP.abst;

abstract class Car {

    public static void main(String[] args) {
        Car car = new Tesla();
        car.drive();
        car.gearChange();
    }

    public Car() {
        System.out.println("Car is built");
    }

    abstract void drive();

    void gearChange() {
        System.out.println("Gear changed!!");
    }

}

class Tesla extends Car {

    @Override
    void drive() {
        System.out.println("Drive Safely");

    }

    @Override
    void gearChange() {
        System.out.println("Gear changed from tesla!!");
    }
}