package Wearable.Pants;

public class Shorts extends Pants {
    public Shorts() {
        super(true, false);
    }

    @Override
    public boolean forSummer(){
        return this.summer;
    }

    @Override
    public boolean isFormal() {
        return this.formal;
    }

    @Override
    public String toString() {
        return null;
    }
}
