package Wearable.Shoes;

public class DressShoes extends Shoes {
    public DressShoes(boolean f) {
        super(false, true);
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
        return "A " + (this.formal?"formal ":"informal ") + (this.tough?"tough ":"") + "dress shoes";
    }
}
