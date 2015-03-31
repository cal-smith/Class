package Wearable.Outerwear;

public class SpringCoat extends Outerwear {
    public SpringCoat() {
        super(false, false);
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
        return "A " + (this.formal?"formal ":"informal ") + (this.warm?"warm ":"") + "Spring Coat";
    }
}
