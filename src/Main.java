import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static ArrayList<Runway> getRunwayData() throws IOException {
        ArrayList<Runway> runways = new ArrayList<>();
        ArrayList<String> runwaysData = CSVReader.readRunwayFile();

        for (String line : runwaysData) {
            String[] splitEachRunwayLine = line.split(",");
            Runway runway = new Runway();
            runway.id = splitEachRunwayLine[0];
            runway.airportReference = splitEachRunwayLine[1];
            runway.airportID = splitEachRunwayLine[2];
            runways.add(runway);
        }
        return runways;
    }

    public static ArrayList<Airport> getAirportData() throws IOException {
        ArrayList<Airport> airports = new ArrayList<>();
        ArrayList<String> airportsData = CSVReader.readAirportFile();

        for (String line : airportsData) {
            String[] splitEachAirportLine = line.split(",");
            Airport airport = new Airport();
            airport.id = splitEachAirportLine[0];
            airport.name = splitEachAirportLine[3];
            airport.isoCountry = splitEachAirportLine[8];
            airports.add(airport);
        }
        return airports;
    }

    public static ArrayList<Country> getCountryData() throws IOException {
        ArrayList<Country> countries = new ArrayList<>();
        ArrayList<String> countriesData = CSVReader.readCountryFile();

        for (String line : countriesData) {
            String[] splitEachCountryLine = line.split(",");
            Country country = new Country();
            country.id = splitEachCountryLine[0];
            country.code = splitEachCountryLine[1];
            country.name = splitEachCountryLine[2];
            country.continent = splitEachCountryLine[3];
//            country.nationalAirports.addAll(airports); //nog filteren en koppelen
            countries.add(country);
        }
        return countries;
    }

    public static ArrayList<Airport> getMatchingRunways(ArrayList<Airport> airports, ArrayList<Runway> runways) {
        List<Runway> filteredRunways = new ArrayList<>();

        for (Airport a : airports) {
            String airportID = a.id;
            filteredRunways = runways.stream().filter(r -> airportID.equals(r.airportReference)).collect(Collectors.toList());
            a.containingRunways = (ArrayList<Runway>) filteredRunways;
        }

        ListIterator<Airport> iteratedAirports = airports.listIterator();
        while (iteratedAirports.hasNext()){
            Airport a = iteratedAirports.next();
            System.out.println(a.name + " has: " + a.containingRunways.size() + " runway(s).");
        }
        return airports;
    }

    public static ArrayList<Country> getMatchingAirports(ArrayList<Country> countries, ArrayList<Airport> airports) {
        List<Airport> filteredAirports = new ArrayList<>();

        for (Country c : countries) {
            String countryCode = c.code;
            filteredAirports = airports.stream().filter(a -> countryCode.equals(a.isoCountry)).collect(Collectors.toList());
            c.nationalAirports = (ArrayList<Airport>) filteredAirports;
        }

        ListIterator<Country> iteratedCountries = countries.listIterator();
        while (iteratedCountries.hasNext()) {
            Country c = iteratedCountries.next();
            System.out.println(c.name + " has: " + c.nationalAirports.size() + " airports.");
        }
        return countries;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Runway> runways = getRunwayData();
        ArrayList<Airport> airports = getAirportData();
        ArrayList<Country> countries = getCountryData();
//        getMatchingRunways(airports, runways);
        getMatchingAirports(countries, airports);
    }
}
