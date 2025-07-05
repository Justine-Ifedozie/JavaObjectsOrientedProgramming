package main.AutomaticBike;

public class AutomaticBike {

    private int speed;
    private int gear = 1;
    private boolean bikeIsOn = false;


    public int getGear() {
        if (speed >= 1 && speed < 20) this.gear = 1;
        else if (speed > 20 && speed <= 30) this.gear = 2;
        else if (speed >= 31 && speed <= 40) this.gear = 3;
        else if (speed > 41) this.gear = 4;
        return gear;
    }

    public void accelerate(int gear) {
            if (gear == 1 && bikeIsOn) this.speed += 1;
            else if (gear == 2 && bikeIsOn) this.speed += 2;
            else if (gear == 3 && bikeIsOn) this.speed += 3;
            else if (gear == 4 && bikeIsOn) this.speed += 4;
    }

    public boolean getStatus() {
        return bikeIsOn;
    }

    public void deccelerate() {
        speed--;
    }

    public int getSpeed() {
        return speed;
    }

    public void control(String control) {
        if(control.equals("on")) bikeIsOn = true;
        else if (control.equals("off")) bikeIsOn = false;
    }
}
