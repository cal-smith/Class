package Wearable.Pants;

public class Khakis extends Pants {
    public Khakis() {
        super(false, true);
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
