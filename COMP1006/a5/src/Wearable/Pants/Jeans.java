package Wearable.Pants;

public class Jeans extends Pants {
    public Jeans() {
        super(false, false);
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
