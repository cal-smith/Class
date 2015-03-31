package Wearable.Accessories;

public class Ties extends Accessories {
    public Ties(boolean g) {
        super(g, true);
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
        return "A " + (this.formal?"formal ":"informal ") + (this.gold?"gold" :"silver ") + "Tie";
    }
}
