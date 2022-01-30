import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

    public static ArrayList<String> readRunwayFile() throws IOException {
        BufferedReader runwaysData = new BufferedReader(new FileReader("resources/runways.csv"));
        String currentLineRunwaysData;
        ArrayList<String> eachLineRunwaysData = new ArrayList<>();
        while ((currentLineRunwaysData = runwaysData.readLine()) != null) {
            eachLineRunwaysData.add(currentLineRunwaysData);
        }
        return eachLineRunwaysData;
    }

    public static ArrayList<String> readAirportFIle() throws IOException {
        BufferedReader airportsData = new BufferedReader(new FileReader("resources/airports.csv"));
        String currentLineAirportsData;
        ArrayList<String> eachLineAirportsData = new ArrayList<>();
        while ((currentLineAirportsData = airportsData.readLine()) != null) {
            eachLineAirportsData.add(currentLineAirportsData);
        }
        return eachLineAirportsData;
    }

    public static ArrayList<String> readCountryFile() throws IOException {
        BufferedReader countriesData = new BufferedReader(new FileReader("resources/countries.csv"));
        String currentLineCountriesData;
        ArrayList<String> eachLineCountriesData = new ArrayList<String>();
        while ((currentLineCountriesData = countriesData.readLine()) != null) {
            eachLineCountriesData.add(currentLineCountriesData);
        }
        return eachLineCountriesData;
    }
}
