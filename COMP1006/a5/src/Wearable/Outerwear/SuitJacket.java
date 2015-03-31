package Wearable.Outerwear;

public class SuitJacket extends Outerwear {
    public SuitJacket() {
        super(false, true);
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
        return "A " + (this.formal?"formal ":"informal ") + (this.warm?"warm ":"") + "Suit Jacket";
    }
}
