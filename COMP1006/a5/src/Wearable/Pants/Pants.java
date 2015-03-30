package Wearable.Pants;

public abstract class Pants extends Wearable.Wearable {
    Boolean summer;
    public Pants(boolean s, boolean f) {
        this.summer = s;
        this.formal = f;
    }

    public abstract boolean forSummer();
}
