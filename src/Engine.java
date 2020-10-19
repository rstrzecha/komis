public class Engine {

    private FuelType fuelType;
    private double capacity;
    private TransmisionType transmisionType;

    public Engine(FuelType fuelType, double capacity, TransmisionType transmisionType) {
        this.fuelType = fuelType;
        this.capacity = capacity;
        this.transmisionType = transmisionType;
    }

    public Engine(String fuelType, double capacity, String transmisionType) {
        this.fuelType = FuelType.valueOf(fuelType);
        this.capacity = capacity;
        this.transmisionType = TransmisionType.valueOf(transmisionType);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType=" + fuelType +
                ", capacity=" + capacity +
                ", transmisionType=" + transmisionType +
                '}';
    }
}
