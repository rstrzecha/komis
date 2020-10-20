import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Ford", "S-Max","DIESEL",1.8,"MANUAL",2003,3,"cosik",11_000);
        Car car2 = new Car("Ford", "S-Max","DIESEL",2.0,"MANUAL",2006,9,"cosik",16_000);
        Car car3 = new Car("Ford", "S-Max","DIESEL",3.0,"MANUAL",2006,9,"cosik",16_000);

        CarShop newShop = new CarShop();

        newShop.addNewCar(car1);
        newShop.addNewCar(car2);
        System.out.println(newShop);

        newShop.removeCar(newShop.getCarIndex(car2));
        System.out.println(newShop);

        newShop.removeCar(newShop.getCarIndex(car3));
        System.out.println(newShop);

        String file = "files/cars.txt";
        newShop.loadCarsFromFile(file);
        System.out.println(newShop);


    }
}
