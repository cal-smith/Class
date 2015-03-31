package Wearable.Accessories;

public class Necklaces extends Accessories {
    public Necklaces(boolean g, boolean f) {
        super(g, f);
    }

    @Override
    public boolean isFormal() {
        return this.formal;
    }

    @Override
    public boolean isGold() {
        return this.gold;
    }

    @Override
    public String toString(){
        return "A " + (this.formal?"formal ":"informal ") + (this.gold?"gold ":"silver ") + "Necklace";
    }
}
