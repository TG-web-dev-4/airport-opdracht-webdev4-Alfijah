import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class UIManager {
    DataConverter dataConverter = new DataConverter();

//    public void getUserCountryRequest(String country, ArrayList<Country> countries, ArrayList<Airport> airports) throws IOException {
//        for (Country c : dataConverter.getCountryData()) {
//            if (country.equals(c.getName().replace("\"", "").toLowerCase(Locale.ROOT).trim())) {
//                System.out.println(c.getName().replace("\"", "") + " has " + c.getNationalAirports().size() + " airport(s):");
//                for (Airport airport: c.getNationalAirports()) {
//                    System.out.println("- " + airport.getName().replace("\"", "") + " with: " + airport.getContainingRunways().size() + " runway(s).");
//                }
//            }
//        }
//    }
//
//    public void interactWithUser(ArrayList<Country> countries, ArrayList<Airport> airports, ArrayList<Country> matchedAirports) throws IOException {
//        Scanner scan = new Scanner(System.in);
//        String userName = "";
//        String userInput = "";
//        String userChoice = "";
//
//        System.out.println("\nWelcome! What is your name?");
//        userName = scan.nextLine();
//        System.out.println("\nHi " + userName + "!");
//
//        while (!userInput.equals("exit")) {
//            System.out.println("\nWhat do you wish to see? " +
//                    "\nA: Airports with their runways." +
//                    "\nB: Top 10 countries with the highest number of airports." +
//                    "\nChoose A or B. Type \"exit\" to exit." );
//            userChoice = scan.next();
//            switch (userChoice) {
//                case "A":
//                    System.out.println("\nAwesome! You have chosen " + userChoice + ".");
//                    System.out.println("Type any country to see airports with their runways: ");
//                    userInput = scan.next();
//                    System.out.println("\n");
//                    getUserCountryRequest(userInput, dataConverter.getCountryData(), dataConverter.getAirportData());
//                    break;
//                case "B":
//                    System.out.println("\n");
//                    new DataAssembler().sortAirportsListByLength(matchedAirports, dataConverter.getCountryData());
//                    break;
//                case "exit":
//                    System.out.println("\nHope you were enjoying this. Goodbye " + userName + " :(");
//                    return;
//                default:
//                    System.out.println("Please choose A or B " + userName + " ;)");
//                    break;
//            }
//        }
//    }

}
