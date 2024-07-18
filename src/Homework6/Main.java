package Homework6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AirTransportSorter airTransportSorter = new AirTransportSorter();

        AirTransport[] airTransports = new AirTransport[]{new AirbusAch130(),new DJIMini4Pro(), new Boeing747()};
        Airline airline = new Airline(airTransports);
        System.out.println(Arrays.toString(airline.getAirTransports()));
        airTransportSorter.sort(airline.getAirTransports());
        System.out.println(Arrays.toString(airline.getAirTransports()));


        airline.calculateTotalLiftingCapacity();
        airline.calculateTotalSeatingCapacity();

    }

}
