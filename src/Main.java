public class Main {

    public static void main(String[] args) {

        Car car1 = Car.buildCar("Ford", "S-Max")
                .buildEngine("DIESEL",1.8,"MANUAL")
                .madeIn(2003,3)
                .setLink("cosik")
                .setPrice(11_000)
                .build();
        Car car2 = Car.buildCar("Ford", "S-Max")
                .buildEngine("DIESEL",2.0,"MANUAL")
                .madeIn(2006,9)
                .setLink("cosik")
                .setPrice(16_000)
                .build();
        Car car3 = Car.buildCar("Ford", "S-Max")
                .buildEngine("DIESEL",3.0,"MANUAL")
                .madeIn(2006,9)
                .setLink("cosik")
                .setPrice(16_000)
                .build();
        CarShop newShop = new CarShop();

        newShop.addNewCar(car1);
        newShop.addNewCar(car2);
        System.out.println(newShop);

        newShop.removeCar(newShop.getCarIndex(car2));
        System.out.println(newShop);

        newShop.removeCar(newShop.getCarIndex(car3));
        System.out.println(newShop);

        String file = "files/cars.txt";
        newShop.loadCarsFromRepo(file);
        System.out.println(newShop.getCarsList());

        Car carFromBuilder = Car.buildCar("Polonez","Borewicz")
                .buildEngine("DIESEL",1.8,"MANUAL")
                .madeIn(1970,11)
                .setLink("link_do_Poldka")
                .setPrice(30000)
                .build();

        newShop.addNewCar(carFromBuilder);
        System.out.println(newShop.getCarsList());
    }
}