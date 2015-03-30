package Wearable.Shirts;

public class TurtleNeck extends Shirts {
    public TurtleNeck(boolean c){
        super(c, true, true);
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
