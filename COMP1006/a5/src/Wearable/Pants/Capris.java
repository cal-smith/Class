package Wearable.Pants;

public class Capris extends Pants {
    public Capris() {
        super(true, false);
    }

    @Override
    public boolean forSummer(){
        return this.summer;
    }

    @Override
    public boolean isFormal() {
        return this.formal;
    }

    @Override
    public String toString() {
        return "A " + (this.formal?"formal ":"informal ") + (this.summer?"summery ":"wintery ") + "Capris";
    }
}
