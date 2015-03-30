import Airports.Airport;
import Airports.AirportNetwork;

import java.util.Scanner;

/**
 * Created by cal on 3/5/15.
 */
public class UI {
    private AirportNetwork network;
    public UI(AirportNetwork n){
        this.network = n;
    }

    public void display() {
        System.out.println("ayy");
        System.out.println(
        this.network.getTraveller().getOrigin().getCity()
        + " " + this.network.getTraveller().getDestination().getCity()
        );
        Scanner input = new Scanner(System.in);
        while (true) {
            Airport current = this.network.getTraveller().getCurrent();
            if (current.destinationCount() > 0) {
                for (int i = 0; i < current.destinationCount(); i++) {
                    System.out.println(current.getDestination(i));
                }
            }
            System.out.println("0");
            System.out.print(": ");
            input.nextInt();
        }
    }

    public static void main(String[] args){
        UI ui = new UI(AirportNetwork.test());
    }
}
