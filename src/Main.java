import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Runway> runways = new ArrayList<>();
        ArrayList<String> runwaysData = CSVReader.readRunwayFile();
        for (String line : runwaysData) {
            System.out.println("test2");
            String[] splitEachRunwayLine = line.split(",");
            Runway runway = new Runway();
            runway.id = splitEachRunwayLine[0];
            runway.airportReference = splitEachRunwayLine[1];
            runway.airportID = splitEachRunwayLine[2];
            runways.add(runway);
        }
        System.out.println(runways.size());
        System.out.println(runways.get(2).airportID);

        ArrayList<Airport> airports = new ArrayList<>();
        ArrayList<String> airportsData = CSVReader.readAirportFIle();
        for (String line : airportsData) {
            String[] splitEachAirportLine = line.split(",");
            Airport airport = new Airport();
            airport.id = splitEachAirportLine[0];
            airport.name = splitEachAirportLine[3];
            airport.countryName = splitEachAirportLine[8];
            airport.containingRunways.addAll(runways); //nog filteren en koppelen
            airports.add(airport);

        }
        System.out.println(airports.size());
        System.out.println(airports.get(2).name);

        ArrayList<Country> countries = new ArrayList<>();
        ArrayList<String> countriesData = CSVReader.readCountryFile();
        for (String line : countriesData) {
            String[] splitEachCountryLine = line.split(",");
            Country country = new Country();
            country.id = splitEachCountryLine[0];
            country.code = splitEachCountryLine[1];
            country.name = splitEachCountryLine[2];
            country.continent = splitEachCountryLine[3];
            country.nationalAirports.addAll(airports); //nog filteren en koppelen
            countries.add(country);
        }
        System.out.println(countries.size());
        System.out.println(countries.get(1).name);


    }
}
