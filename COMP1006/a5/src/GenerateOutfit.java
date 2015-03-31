import Wearable.Shirts.*;
import Wearable.Shoes.*;
import Wearable.Pants.*;
import Wearable.Outerwear.*;
import Wearable.Accessories.*;

import java.util.ArrayList;

public class GenerateOutfit {
    private ArrayList<Shirts> shirtses;
    private ArrayList<Shoes> shoeses;
    private ArrayList<Pants> pantses;
    private ArrayList<Outerwear> outerwears;
    private ArrayList<Accessories> accessorieses;
    private boolean random(){
        return this.random(2) == 0;
    }
    private int random(int i){
        return (int)Math.floor(Math.random()*i);
    }
    public GenerateOutfit() {
        this.shirtses = new ArrayList<Shirts>();
        this.shoeses = new ArrayList<Shoes>();
        this.pantses = new ArrayList<Pants>();
        this.outerwears = new ArrayList<Outerwear>();
        this.accessorieses = new ArrayList<Accessories>();

        shirtses.add(new TShirt(this.random()));
        shirtses.add(new Sweater(this.random()));
        shirtses.add(new TurtleNeck(this.random()));
        shirtses.add(new TShirt(this.random()));
        shirtses.add(new Sweater(this.random()));
        shirtses.add(new TurtleNeck(this.random()));

        shoeses.add(new Boots(this.random()));
        shoeses.add(new DressShoes(this.random()));
        shoeses.add(new RunningShoes());
        shoeses.add(new Boots(this.random()));
        shoeses.add(new DressShoes(this.random()));

        pantses.add(new Jeans());
        pantses.add(new Khakis());
        pantses.add(new Capris());
        pantses.add(new Shorts());

        outerwears.add(new WinterJacket());
        outerwears.add(new SuitJacket());
        outerwears.add(new SpringCoat());

        accessorieses.add(new Necklaces(this.random(), this.random()));
        accessorieses.add(new Rings(this.random(), this.random()));
        accessorieses.add(new Ties(this.random()));
        accessorieses.add(new Watches(this.random(), this.random()));
        accessorieses.add(new Necklaces(this.random(), this.random()));
        accessorieses.add(new Rings(this.random(), this.random()));
        accessorieses.add(new Ties(this.random()));
        accessorieses.add(new Watches(this.random(), this.random()));
    }

    public boolean goodOutfit(Shirts s, Pants p, Shoes sh, Outerwear o, Accessories a){
        if (s.isFormal()){
            if (p.isFormal() && sh.isFormal() && o.isFormal() && a.isFormal()){
                if (s.isWarm() && a.isGold()){
                    return true;
                } else if (!a.isGold()) {
                    return true;
                }
            }
        } else {
            if (!p.isFormal() && !sh.isFormal() && !o.isFormal() && !a.isFormal()) {
                if (p.forSummer() && !s.isWarm() && !o.isWarm()) {
                    return true;
                } else if (!p.forSummer() && s.isWarm() && sh.isTough() && o.isWarm()) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getOutfit(){
        return getOutfitHelper();
    }
    private String getOutfitHelper(){
        Shirts shirt = shirtses.get(this.random(shirtses.size()));
        Pants pant = pantses.get(this.random(pantses.size()));
        Shoes shoe = shoeses.get(this.random(shoeses.size()));
        Outerwear outer = outerwears.get(this.random(outerwears.size()));
        Accessories acc = accessorieses.get(this.random(accessorieses.size()));
        if (this.goodOutfit(shirt, pant, shoe, outer, acc)){
            return shirt.toString() + " with " + pant.toString() + " with " + shoe.toString() + " with " + outer.toString() + " with " + acc.toString();
        } else {
            return getOutfitHelper();
        }
    }
}
