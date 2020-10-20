import java.time.LocalDate;

public class DateOfProduction {
    private int yearOfProduction;
    private int monthOfProduction;
    private int dayOfProduction;

    public DateOfProduction(int yearOfProduction, int monthOfProduction) {
        this.yearOfProduction = yearOfProduction;
        this.monthOfProduction = monthOfProduction;
        this.dayOfProduction = 1;
    }

    public LocalDate getDateOfProduction() {
        LocalDate dateOfProduction = LocalDate.of(yearOfProduction,monthOfProduction,dayOfProduction);
        return dateOfProduction;
    }

    @Override
    public String toString() {
        return "{" + yearOfProduction +
                " - " + monthOfProduction +
                '}';
    }
}
