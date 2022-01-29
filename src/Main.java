import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //Pseudo code
        // Lees country file in;
        // Voor elke regel die je inleest creer je een country.
        // Vul elke country met de data in de regel

        ArrayList<String> countryCodes = new ArrayList<>();
        ArrayList<String> countryNames = new ArrayList<>();
        ArrayList<Country> countries = new ArrayList<>();

        ArrayList<String> countriesData = CSVReader.readCountryFile();
//        for (String line : countriesData) {
//
//        }
        Country country = new Country();
//            country.id = Integer.parseInt(eachLineCountriesData[0]);
//        country.code = countriesData.get(1);
//        country.name = countriesData.get(2);
//        country.continent = countriesData.get(3);
//        System.out.println(country.name + country.continent);
        System.out.println(countriesData.get(1l));
//        for (String element : countriesData) {
//        System.out.println(element);
//
//
//        }

    }
}
