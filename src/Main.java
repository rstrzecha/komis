public class Main {

    public static void main(String[] args) {

        Engine diesel1_8 = new Engine(FuelType.DIESEL,1.8,TransmisionType.MANUAL);
        Engine diesel2_0 = new Engine("DIESEL",2.0,"MANUAL");
        Car car1 = new Car("Ford", "S-Max",diesel1_8,2003,3,"cosik",11_000);
        Car car2 = new Car("Ford", "S-Max",diesel2_0,2006,9,"cosik",16_000);

        System.out.println(car1);
        System.out.println(car2);
    }
}
