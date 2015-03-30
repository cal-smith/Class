package Wearable.Accessories;

public abstract class Accessories extends Wearable.Wearable {
    protected boolean gold;
    public Accessories(boolean g, boolean f) {
        this.gold = g;
        this.formal = f;
    }
    public abstract boolean isGold();
}
