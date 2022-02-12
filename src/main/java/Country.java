import java.util.ArrayList;

public class Country {
    private String id;
    private String code;
    private String name;
    private String continent;
    private ArrayList<Airport> nationalAirports;

    public String toString() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public ArrayList<Airport> getNationalAirports() {
        return nationalAirports;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setNationalAirports(ArrayList<Airport> nationalAirports) {
        this.nationalAirports = nationalAirports;
    }
}


