import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public ArrayList<Airport> getMatchingRunways(ArrayList<Airport> airports, ArrayList<Runway> runways) throws IOException {
        List<Runway> filteredRunways;
        for (Airport a : dataConverter.getAirportData()) {
            String airportID = a.getId();
            filteredRunways = runways.stream().filter(r -> airportID.equals(r.getAirportReference())).collect(Collectors.toList());
            a.setContainingRunways((ArrayList<Runway>) filteredRunways);
        }
        return airports;
    }

    public ArrayList<Country> getMatchingAirports(ArrayList<Country> countries, ArrayList<Airport> airports) throws IOException {
        List<Airport> filteredAirports;

        for (Country c : dataConverter.getCountryData()) {
            String countryCode = c.getCode();
            filteredAirports = airports.stream().filter(a -> countryCode.equals(a.getIsoCountry())).collect(Collectors.toList());
            c.setNationalAirports((ArrayList<Airport>) filteredAirports);
            System.out.println("MATCHED AIRPORTS "+ c.getName() + c.getNationalAirports().size() + filteredAirports);

        }
        return countries;
    }


    public ArrayList<Country> sortAirportsListByLength(ArrayList<Country> matchedAirports, ArrayList<Country> countries) {
        ArrayList<Country> countriesWithLargestAirports = new ArrayList<>();
        Collections.sort(matchedAirports, (o1, o2) -> Integer.compare(o2.getNationalAirports().size(), o1.getNationalAirports().size()));

        for (Country c : countriesWithLargestAirports) {
            System.out.println(c.getName() + " has " + c.getNationalAirports());
        }
        for ( int i = 0; i < 10; i++ ) {
            System.out.println(i + 1 + ": " + countries.get(i).getName() + " has: " + countries.get(i).getNationalAirports().size() + " airports.");
        }
        System.out.println(" " + countriesWithLargestAirports);

        return countriesWithLargestAirports;
    }

    public void getUserCountryRequest(String country, ArrayList<Country> countries, ArrayList<Airport> airports) throws IOException {
        for (Country c : dataConverter.getCountryData()) {
            if (country.equals(c.getName().replace("\"", "").toLowerCase(Locale.ROOT).trim())) {
                System.out.println(c.getName().replace("\"", "") + " has " + c.getNationalAirports().size() + " airport(s):");
                for (Airport airport: c.getNationalAirports()) {
                    System.out.println("- " + airport.getName().replace("\"", "") + " with: " + airport.getContainingRunways().size() + " runway(s).");
                }
            }
        }
    }

    public void interactWithUser(ArrayList<Country> countries, ArrayList<Airport> airports, ArrayList<Country> matchedAirports) throws IOException {
        Scanner scan = new Scanner(System.in);
        String userName = "";
        String userInput = "";
        String userChoice = "";

        System.out.println("\nWelcome! What is your name?");
        userName = scan.nextLine();
        System.out.println("\nHi " + userName + "!");

        while (!userInput.equals("exit")) {
            System.out.println("\nWhat do you wish to see? " +
                    "\nA: Airports with their runways." +
                    "\nB: Top 10 countries with the highest number of airports." +
                    "\nChoose A or B. Type \"exit\" to exit." );
            userChoice = scan.next();
            switch (userChoice) {
                case "A":
                    System.out.println("\nAwesome! You have chosen " + userChoice + ".");
                    System.out.println("Type any country to see airports with their runways: ");
                    userInput = scan.next();
                    System.out.println("\n");
                    getUserCountryRequest(userInput, dataConverter.getCountryData(), dataConverter.getAirportData());
                    break;
                case "B":
                    System.out.println("\n");
                    new DataAssembler().sortAirportsListByLength(matchedAirports, dataConverter.getCountryData());
                    break;
                case "exit":
                    System.out.println("\nHope you were enjoying this. Goodbye " + userName + " :(");
                    return;
                default:
                    System.out.println("Please choose A or B " + userName + " ;)");
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        DataConverter dataConverter = new DataConverter();
        ArrayList<Runway> runways = dataConverter.getRunwayData();
        ArrayList<Airport> airports = dataConverter.getAirportData();
        ArrayList<Country> countries = dataConverter.getCountryData();

        DataAssembler dataAssembler = new DataAssembler();
        ArrayList<Airport> matchedRunways = dataAssembler.getMatchingRunways(airports, runways);
        ArrayList<Country> matchedAirports = dataAssembler.getMatchingAirports(countries, airports);
        dataAssembler.sortAirportsListByLength(matchedAirports, countries);

//        new UIManager().interactWithUser(countries, airports, matchedAirports);
//        new UIManager().getUserCountryRequest();


    }
}
