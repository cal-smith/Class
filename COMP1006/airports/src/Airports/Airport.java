package Airports; /**
 * Created by cal on 3/3/15.
 */
import LinkedList.LinkedList;
import LinkedList.Node;

public class Airport {
    private String city;
    private String airport;
    private LinkedList destinations;

    public Airport(String c, String a){
        this.city = c;
        this.airport = a;
        this.destinations = new LinkedList();
    }

    public String getCity() { return this.city; };
    public String getAirport() { return this.airport; };
    //public Object[] getDestinations() { return  this.destinations.toArray(); };
    public Airport getDestination(int i) {
        return (Airport) this.destinations.get(i);
    }
    public void addDestination(Airport a) {
        this.destinations.addNodeToEnd(new Node(a));
    }

    public int destinationCount() { return this.destinations.length(); }
}
