import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //Pseudo code
        // Lees country file in;
        // Voor elke regel die je inleest creer je een country.
        // Vul elke country met de data in de regel







//        Scanner airportsData = new Scanner(new File("C:\\TechGrounds\\TG Web Development\\Java\\airport-opdracht-webdev4-Alfijah\\resources\\airports.csv"));
//
//        airportsData.useDelimiter("\bNA\b");
//        while (airportsData.hasNext()) {
//            System.out.println(airportsData.nextLine());
//        }
//        airportsData.close();

        ArrayList<String> countryCodes = new ArrayList<>();
        ArrayList<String> countryNames = new ArrayList<>();
        ArrayList<Country> countries = new ArrayList<>();

//        try {
//            BufferedReader countriesData = new BufferedReader(new FileReader("resources/countries.csv"));
//            while ((currentLineCountriesData = countriesData.readLine()) != null) {
//                String[] eachLineCountriesData = currentLineCountriesData.split(",");
//                System.out.println("Countrycode: " + eachLineCountriesData[1]);
//                countries.add(eachLineCountriesData[1]);
//            }
//        }
//        catch(IOException e) {
//            System.out.println("Error");
//        }


        String[] countriesData = CSVReader.readCountryFile();
        for (String line : countriesData) {
            Country country = new Country();
//            country.id = Integer.parseInt(eachLineCountriesData[0]);
//            country.code = line[1];
//            country.name = line[2];
//            country.continent = line[3];
            System.out.println(country.name + country.continent);
            System.out.println(countryCodes);
            System.out.println(countryNames);
        }




    }
}
