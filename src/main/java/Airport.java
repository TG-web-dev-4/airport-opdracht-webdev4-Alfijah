import java.util.ArrayList;

public class Airport {
    private String id;
    private String name;
    private String isoCountry;
    private ArrayList<Runway> containingRunways;

    public String toString() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIsoCountry() {
        return isoCountry;
    }

    public ArrayList<Runway> getContainingRunways() {
        return containingRunways;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsoCountry(String isoCountry) {
        this.isoCountry = isoCountry;
    }

    public void setContainingRunways(ArrayList<Runway> containingRunways) {
        this.containingRunways = containingRunways;
    }
}

