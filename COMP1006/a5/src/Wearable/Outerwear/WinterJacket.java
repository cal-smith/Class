package Wearable.Outerwear;

public class WinterJacket extends Outerwear {
    public WinterJacket() {
        super(true, false);
    }

    @Override
    public boolean isWarm() {
        return this.warm;
    }

    @Override
    public boolean isFormal() {
        return this.formal;
    }

    @Override
    public String toString() {
        return "A " + (this.formal?"formal ":"informal ") + (this.warm?"warm ":"") + "Winter Jacket";
    }
}
