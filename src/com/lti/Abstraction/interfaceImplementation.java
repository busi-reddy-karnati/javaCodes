package com.lti.Abstraction;

interface IVehicle{
    void drive();
    void turnLeft();
    void brake();
}
interface IPublicTransport{
    int getNumberOfPeople();
}
class MotorisedVehicle{
    void checkMotor(){
        System.out.println("The motor of the vehicle is in good condition");
    }

}

class Car extends MotorisedVehicle implements IVehicle{

    @Override
    public void drive() {
        System.out.println("The vehicle is in drive mode");
    }

    @Override
    public void turnLeft() {
        System.out.println("The vehicle is in turnLeft mode");

    }

    @Override
    public void brake() {
        System.out.println("The vehicle is in brake mode");

    }
}

class Train implements IVehicle,IPublicTransport{
    private int numberOfPeople;
    @Override
    public void drive(){
        System.out.println("The Train is driving");
    }

    @Override
    public void turnLeft() {
        System.out.println("The Train is turingLeft");

    }

    @Override
    public void brake() {
        System.out.println("The Train's braked");

    }


    @Override
    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
}
public class interfaceImplementation {
}
