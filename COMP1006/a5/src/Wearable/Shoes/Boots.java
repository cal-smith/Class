package Wearable.Shoes;

public class Boots extends Shoes {
    public Boots(boolean f) {
        super(true, false);
    }

    @Override
    public boolean isFormal() {
        return this.formal;
    }

    @Override
    public boolean isTough() {
        return this.tough;
    }

    @Override
    public String toString() {
        return null;
    }
}
