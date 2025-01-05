package Homework6;

public abstract class AirTransport {
    private AirTransportType type;
    private int seatingCapacity;
    private int liftingCapacity;
    private int flyingDistance;

    public AirTransport(AirTransportType type, int seatingCapacity, int liftingCapacity, int flyingDistance) {
        this.type = type;
        this.seatingCapacity = seatingCapacity;
        this.liftingCapacity = liftingCapacity;
        this.flyingDistance = flyingDistance;
    }

    public AirTransportType getType() {
        return type;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public int getFlyingDistance() {
        return flyingDistance;
    }

    @Override
    public String toString() {
        return "AirTransport{" +
                "type=" + type +
                ", seatingCapacity=" + seatingCapacity +
                ", liftingCapacity=" + liftingCapacity +
                ", flyingDistance=" + flyingDistance +
                '}';
    }
}
