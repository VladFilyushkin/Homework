package Homework6;

public class AirTransportSorter {
    public void sort(AirTransport[] airTransports) {
        for (int i = 0; i < airTransports.length - 1; i++) {
            for (int j = 0; j < airTransports.length - 1 - i; j++) {
                if (airTransports[j].getFlyingDistance() > airTransports[j + 1].getFlyingDistance()) {
                    AirTransport temp = airTransports[j];
                    airTransports[j] = airTransports[j + 1];
                    airTransports[j + 1] = temp;
                }

            }

        }

    }

}
