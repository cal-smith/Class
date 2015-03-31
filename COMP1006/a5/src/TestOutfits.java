//import Wearable.*;
import Wearable.Accessories.*;
import Wearable.Outerwear.*;
import Wearable.Pants.*;
import Wearable.Shirts.*;
import Wearable.Shoes.*;

public class TestOutfits {
    public TestOutfits() {
    }
    private static boolean random(){
        return Math.floor(Math.random() * 2) == 0;
    }
    public static void main(String[] args) {
        System.out.println("Test Accessories: " + new Necklaces(random(), random()));
        System.out.println("Test Accessories: " + new Rings(random(), random()));
        System.out.println("Test Accessories: " + new Ties(random()));
        System.out.println("Test Accessories: " + new Watches(random(), random()));
        System.out.println("Test Outerwear: " + new SpringCoat());
        System.out.println("Test Outerwear: " + new SuitJacket());
        System.out.println("Test Outerwear: " + new WinterJacket());
        System.out.println("Test Pants: " + new Capris());
        System.out.println("Test Pants: " + new Jeans());
        System.out.println("Test Pants: " + new Khakis());
        System.out.println("Test Pants: " + new Shorts());
        System.out.println("Test Shirts: " + new Sweater(random()));
        System.out.println("Test Shirts: " + new TShirt(random()));
        System.out.println("Test Shirts: " + new TurtleNeck(random()));
        System.out.println("Test Shoes: " + new Boots(random()));
        System.out.println("Test Shoes: " + new DressShoes(random()));
        System.out.println("Test Shoes: " + new RunningShoes());
        GenerateOutfit outfit = new GenerateOutfit();
        System.out.println("Generator test: " + outfit.getOutfit());
        System.out.println("Generator test: " + outfit.getOutfit());
        System.out.println("Generator test: " + outfit.getOutfit());
    }
}
