package Wearable.Accessories;

public class Rings extends Accessories {
    public Rings(boolean g, boolean f) {
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
        return "A" + (this.formal?"formal":"informal") + (this.gold?"gold":"silver") + "Ring";
    }
}
