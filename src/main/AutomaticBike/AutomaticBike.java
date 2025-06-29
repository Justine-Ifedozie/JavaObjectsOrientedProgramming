package main.AutomaticBike;

public class AutomaticBike {
    private int gear;
    private String currentStatus;
    private int speed;


    public AutomaticBike(String currentStatus, int gear) {
        this.currentStatus = currentStatus;
        this.gear = gear;
    }


    public String getBikeStatus() {
        return currentStatus;
    }

    public void setStatus(String status) {
        currentStatus = status;
    }

    public int getAccelerationSpeed() {
        return speed;
    }

    public void setGear(int gear) {
        speed = gear;
    }
}