public class Car {
    private String make;
    private String model;

    private Engine engine;
    private DateOfProduction dateOfProduction;
    private String picture_link;
    private float price;

    private Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", dateOfProduction=" + dateOfProduction +
                ", picture_link='" + picture_link + '\'' +
                ", price=" + price +
                '}';
    }

    public static CarBuilder buildCar(String make, String model) {
        return new CarBuilder(make, model);
    }

    static class CarBuilder {
        private Car car;

        public CarBuilder(String make, String model) {
            car = new Car(make, model);
        }

        public Car build() {
            return car;
        }

        public CarBuilder buildEngine(String fuelType, double capacity, String transmitionType) {
            car.engine = new Engine(fuelType, capacity, transmitionType);
            return this;
        }

        public CarBuilder madeIn(int yearOfProduction, int monthOfProduction) {
            car.dateOfProduction = new DateOfProduction(yearOfProduction, monthOfProduction);
            return this;
        }

        public CarBuilder setLink(String picture_link) {
            car.picture_link = picture_link;
            return this;
        }

        public CarBuilder setPrice(float price) {
            car.price = price;
            return this;
        }
    }
}