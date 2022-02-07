import java.util.ArrayList;

public class Airport {
    public String id;
    public String name;
    public String isoCountry;
    public ArrayList<Runway> containingRunways;

    public String toString() {
        return name;
    }
}
