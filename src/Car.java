public class Car {
    private String make;
    private String model;
    private Engine engine;
    private DateOfProduction dateOfProduction;
    private String picture_link;
    private float price;

    public Car(String make, String model, Engine engine,int yearOfProduction, int monthOfProduction, String picture_link, float price) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.dateOfProduction = new DateOfProduction(yearOfProduction, monthOfProduction);
        this.picture_link = picture_link;
        this.price = price;
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
}


