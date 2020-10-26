import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private List<Car> carsList = new ArrayList<>();
    private LoadRepository newBase;

    public CarShop() {
        newBase = new LoadFileRepository();
    }

    public List<Car> getCarsList() {
        return carsList;
    }

    public void setNewBase(LoadRepository newBaseType) {
        this.newBase = newBaseType;
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
