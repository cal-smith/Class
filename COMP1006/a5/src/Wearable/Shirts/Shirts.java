package Wearable.Shirts;

public abstract class Shirts extends Wearable.Wearable {
    protected Boolean colourful;
    protected Boolean warm;
    public Shirts(Boolean c, Boolean w, Boolean f) {
        this.colourful = c;
        this.warm = w;
        this.formal = f;
    }
    public abstract boolean isColourful();
    public abstract boolean isWarm();
}
