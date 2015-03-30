package Airports;

import LinkedList.*;

/**
 * Created by cal on 3/5/15.
 */
public class AirportNetwork {
    private LinkedList airports;
    private Traveller traveller;

    public AirportNetwork(Traveller t) {
        this.traveller = t;
        this.airports = new LinkedList();
    }

    public Traveller getTraveller() { return this.traveller; };
    public void moveTraveller(int i) {
        this.traveller.setCurrent(this.traveller.getCurrent().getDestination(i));
    }

    public Airport getAirport(int i) { return (Airport) this.airports.get(i); };
    public void addAirports(Airport a) {
        this.airports.addNode(new Node(a));
    }

    public static void test(){
        Airport yow = new Airport("a", "YOW");
        Airport yyc = new Airport("a", "YYC");
        Airport yvr = new Airport("a", "YVR");
        Airport yul = new Airport("a", "YUL");
        Airport nrt = new Airport("a", "NRT");
        Airport fra = new Airport("a", "FRA");
        Airport cdg = new Airport("a", "CDG");

        yow.addDestination(yvr);
        yow.addDestination(yyc);
        yow.addDestination(cdg);
        yow.addDestination(fra);

        yul.addDestination(yow);

        yyc.addDestination(yvr);
        yyc.addDestination(yow);
        yyc.addDestination(yul);

        yvr.addDestination(yow);
        yvr.addDestination(yyc);
        yvr.addDestination(nrt);

        nrt.addDestination(yvr);

        fra.addDestination(yow);

        cdg.addDestination(yul);

        Traveller t = new Traveller("a", yow, fra);
    }
}
