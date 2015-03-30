package Wearable.Shoes;

public abstract class Shoes extends Wearable.Wearable {
    protected boolean tough;
    public Shoes(boolean t, boolean f) {
        this.tough = t;
        this.formal = f;
    }
    public abstract boolean isTough();
}
