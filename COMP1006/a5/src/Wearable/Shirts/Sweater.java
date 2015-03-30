package Wearable.Shirts;

public class Sweater extends Shirts {
    public Sweater(boolean c){
        super(c, true, false);
    }

    @Override
    public boolean isColourful() {
        return this.colourful;
    }

    @Override
    public boolean isFormal() {
        return this.formal;
    }

    @Override
    public boolean isWarm() {
        return this.warm;
    }

    @Override
    public String toString() {
        return null;
    }
}
