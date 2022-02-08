import java.util.ArrayList;

public class Country {
    public String id;
    public String code;
    public String name;
    public String continent;
    public ArrayList<Airport> nationalAirports;

    public String toString() {
        return name;
    }
}


