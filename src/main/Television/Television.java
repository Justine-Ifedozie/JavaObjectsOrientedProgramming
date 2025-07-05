package main.Television;

public class Television {

    private boolean IsOn = false;

    public boolean isOn() {
        return IsOn;
    }

    public void toggle() {
        IsOn = !IsOn;
    }
}
