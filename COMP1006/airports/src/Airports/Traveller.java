package Airports;

/**
 * Created by cal on 3/3/15.
 */
public class Traveller {
    private String name;
    private Airport origin;
    private Airport destination;
    private Airport current;

    private Traveller(String n, Airport o, Airport d, Airport c) {
        this.name = n;
        this.origin = o;
        this.destination = d;
        this.current = c;
    }

    public Traveller(String n, Airport o, Airport d){
        this(n, o, d, o);
    }

    public Traveller changeDestination(Airport d) {
        return new Traveller(this.name, this.origin, d, this.current);
    }

    public String getName() { return this.name; };
    public Airport getOrigin() { return this.origin; };
    public Airport getDestination() { return this.destination; };
    public Airport getCurrent() { return  this.current; };
    public void setCurrent(Airport a) { this.current = a; };
}
