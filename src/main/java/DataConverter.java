import java.io.IOException;
import java.util.ArrayList;

public class DataConverter {

    public ArrayList<Runway> getRunwayData() throws IOException {
        ArrayList<Runway> runways = new ArrayList<>();
        ArrayList<String> runwaysData = CSVReader.readRunwayFile();

        for (String line : runwaysData) {
            String[] splitEachRunwayLine = line.split(",");
            Runway runway = new Runway();
            runway.setId(splitEachRunwayLine[0]);
            runway.setAirportReference(splitEachRunwayLine[1]);
            runway.setAirportID(splitEachRunwayLine[2]);
            runways.add(runway);
        }
        return runways;
    }

    public ArrayList<Airport> getAirportData() throws IOException {
        ArrayList<Airport> airports = new ArrayList<>();
        ArrayList<String> airportsData = CSVReader.readAirportFile();

        for (String line : airportsData) {
            String[] splitEachAirportLine = line.split(",");
            Airport airport = new Airport();
            airport.setId(splitEachAirportLine[0]);
            airport.setName(splitEachAirportLine[3]);
            airport.setIsoCountry(splitEachAirportLine[8]);
            airports.add(airport);
        }
        return airports;
    }

    public ArrayList<Country> getCountryData() throws IOException {
        ArrayList<Country> countries = new ArrayList<>();
        ArrayList<String> countriesData = CSVReader.readCountryFile();

        for (String line : countriesData) {
            String[] splitEachCountryLine = line.split(",");
            Country country = new Country();
            country.setId(splitEachCountryLine[0]);
            country.setCode(splitEachCountryLine[1]);
            country.setName(splitEachCountryLine[2]);
            country.setContinent(splitEachCountryLine[3]);
            countries.add(country);
        }
        return countries;
    }
}
