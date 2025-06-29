package main.AirConditioner;

public class AirConditioner {

    private String status;
    private int temperature;

    public AirConditioner(String status, int temperature) {
        this.status = status;
        this.temperature = temperature;
    }

    public String getStatus() {
        if (status.equals("on")) return "on";
        else
            return "off";
    }

    public void setStatus(String status1) {
        status = status1;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temp) {
        if (temp <= 16) temperature = 16;
        else if (temp >= 30) temperature = 30;

        else {
            temperature = temp;
        }
    }

}
