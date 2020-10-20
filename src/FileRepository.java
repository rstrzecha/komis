import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRepository implements Repository {
    public List<Car> load(String pathName){

        List<Car> carsToLoad = new ArrayList<>();

        File file = new File(pathName);
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String content =scanner.nextLine();
                String [] carDetails = content.split(",");
                Car car = new Car(carDetails[0],carDetails[1],carDetails[2], Double.parseDouble(carDetails[3])
                        ,carDetails[4], Integer.parseInt(carDetails[5]), Integer.parseInt(carDetails[6])
                        ,carDetails[7], Float.parseFloat(carDetails[8]));
                 carsToLoad.add(car);
            }
        }
        catch (FileNotFoundException exception) {
            System.out.println(exception);
        }
        return carsToLoad;
    }

    public void save() {

    }

}
