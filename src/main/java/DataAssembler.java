import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DataAssembler {
//    DataConverter dataConverter = new DataConverter();
//    ArrayList<Runway> runways = dataConverter.getRunwayData();
//    ArrayList<Airport> airports = dataConverter.getAirportData();
//    ArrayList<Country> countries = dataConverter.getCountryData();
//
//    ArrayList<Airport> matchedRunways = getMatchingRunways(airports, runways);
//    ArrayList<Country> matchedAirports = getMatchingAirports(countries, airports);
//
//    public DataAssembler() throws IOException {
//    }

//    public ArrayList<Airport> getMatchingRunways(ArrayList<Airport> airports, ArrayList<Runway> runways) throws IOException {
//        List<Runway> filteredRunways;
//        for (Airport a : dataConverter.getAirportData()) {
//            String airportID = a.getId();
//            filteredRunways = runways.stream().filter(r -> airportID.equals(r.getAirportReference())).collect(Collectors.toList());
//            a.setContainingRunways((ArrayList<Runway>) filteredRunways);
//        }
//        return airports;
//    }
//
//    public ArrayList<Country> getMatchingAirports(ArrayList<Country> countries, ArrayList<Airport> airports) throws IOException {
//        List<Airport> filteredAirports;
//
//        for (Country c : dataConverter.getCountryData()) {
//            String countryCode = c.getCode();
//            filteredAirports = airports.stream().filter(a -> countryCode.equals(a.getIsoCountry())).collect(Collectors.toList());
//            c.setNationalAirports((ArrayList<Airport>) filteredAirports);
//            System.out.println("MATCHED AIRPORTS "+ c.getName() + c.getNationalAirports().size() + filteredAirports);
//
//        }
//        return countries;
//    }
//
//
//    public ArrayList<Country> sortAirportsListByLength(ArrayList<Country> matchedAirports, ArrayList<Country> countries) {
//        ArrayList<Country> countriesWithLargestAirports = new ArrayList<>();
//        Collections.sort(matchedAirports, (o1, o2) -> Integer.compare(o2.getNationalAirports().size(), o1.getNationalAirports().size()));
//
//        for (Country c : countriesWithLargestAirports) {
//            System.out.println(c.getName() + " has " + c.getNationalAirports());
//        }
//        for ( int i = 0; i < 10; i++ ) {
//            System.out.println(i + 1 + ": " + countries.get(i).getName() + " has: " + countries.get(i).getNationalAirports().size() + " airports.");
//        }
//        System.out.println(" " + countriesWithLargestAirports);
//
//        return countriesWithLargestAirports;
//    }
}
