package Andrey;

public class Bycicle implements VehicleControls {
    public int speed = 0;

    public void move(int i){
        this.speed +=10;
    }
    public void applyBreaks(int i){
        this.speed -= 10;
    }



}
