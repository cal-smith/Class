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
        return Math.floor(Math.random() * 2) == 0;
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

        shoeses.add(new Boots(this.random()));
        shoeses.add(new DressShoes(this.random()));
        shoeses.add(new RunningShoes());

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
    }

    public void getOutfit(){
        /*
        * ties should only go with things that isGoodWithTie() == true
        * isWarm() only goes with other isWarm() items
        * isColorfull() == true shirts go with isFormal() == false items
        * isTough() == true shoes dont go with isFormal() items
        * forWinter() == true pants go with isWarm() == true items
        *
        * */
    }
}
