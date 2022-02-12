import java.io.IOException;
import java.util.ArrayList;

public class Runway {
    private String id;
    private String airportReference;
    private String airportID;

    public String getId() {
        return id;
    }

    public String getAirportReference() {
        return airportReference;
    }

    public String getAirportID() {
        return airportID;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAirportReference(String airportReference) {
        this.airportReference = airportReference;
    }

    public void setAirportID(String airportID) {
        this.airportID = airportID;
    }
}
