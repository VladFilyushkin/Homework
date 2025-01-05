package Homework6;


public class Airline {
    private final AirTransport[] airTransports;

    public Airline(AirTransport[] airTransports) {
        this.airTransports = airTransports;
    }

    public AirTransport[] getAirTransports() {
        return airTransports;
    }

    public void calculateTotalSeatingCapacity() {
        int totalCapacity = 0;
        for (int i = 0; i < airTransports.length; i++) {
            totalCapacity += airTransports[i].getSeatingCapacity();

        }
        System.out.println("Total capacity: " + totalCapacity);
    }
    public void calculateTotalLiftingCapacity(){
        int totalLiftingCapacity = 0;
        for (int i = 0; i < airTransports.length; i++) {
            totalLiftingCapacity += airTransports[i].getLiftingCapacity();
        }
        System.out.println("Total lifting capacity: " + totalLiftingCapacity);
    }



}
