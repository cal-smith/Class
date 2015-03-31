package Wearable.Shoes;

public class RunningShoes extends Shoes {
    public RunningShoes() {
        super(false, false);
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
        return "A " + (this.formal?"formal ":"informal ") + (this.tough?"tough ":"") + "running shoes";
    }
}
