import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private List<Car> carsList = new ArrayList<>();

    public List<Car> getCarsList() {
        return carsList;
    }

    public void addNewCar(Car carToAdd) {
        carsList.add(carToAdd);
    }

    public void removeCar(Integer index) {
        if(index != null) {
            carsList.remove((int) index);
        } else {
            System.out.println("Brak samochodu w bazie");
        }
    }

    private void loadCarsFromList(List<Car> carsToLoad) {
       carsList.addAll(carsToLoad);
    }

    public void loadCarsFromFile(String filePathname) {
        GetFileRepository newBase = new GetFileRepository();
        List<Car> carsList = newBase.load(filePathname);
        loadCarsFromList(carsList);
    }

    public Integer getCarIndex(Car car) {
        return carsList.contains(car) ? carsList.indexOf(car) : null;
    }

    @Override
    public String toString() {
        return "CarShop{" +
                carsList +
                '}';
    }
}
