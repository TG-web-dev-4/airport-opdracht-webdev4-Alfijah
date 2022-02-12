import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static ArrayList<Country> countries;
    private static ArrayList<Airport> airports;
    private static ArrayList<Country> matchedAirports;

    public static void main(String[] args) throws IOException {
//        DataConverter dataConverter = new DataConverter();
//        ArrayList<Runway> runways = dataConverter.getRunwayData();
//        ArrayList<Airport> airports = dataConverter.getAirportData();
//        ArrayList<Country> countries = dataConverter.getCountryData();
//
//        DataAssembler dataMatchFinder = new DataAssembler();
//        ArrayList<Airport> matchedRunways = dataMatchFinder.getMatchingRunways(airports, runways);
//        ArrayList<Country> matchedAirports = dataMatchFinder.getMatchingAirports(countries, airports);

        new UI().interactWithUser(countries, airports, matchedAirports);
    }
}
