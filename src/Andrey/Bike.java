package Andrey;
public class Bike implements VehicleControls {
    public int speed = 0;
    public Bike(){}
    public void move(int i){
        this.speed +=i;
    }

    public void applyBreaks(int i){
        this.speed -=i;
    }

}