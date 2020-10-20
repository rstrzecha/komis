import java.util.List;

public interface Repository {
    List<Car> load(String s);
    void save();
}
