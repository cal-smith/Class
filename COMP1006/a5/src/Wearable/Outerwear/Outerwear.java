package Wearable.Outerwear;

public abstract class Outerwear extends Wearable.Wearable {
    protected boolean warm;
    public Outerwear(boolean w, boolean f) {
        this.warm = w;
        this.formal = f;
    }
    public abstract boolean isWarm();
}
