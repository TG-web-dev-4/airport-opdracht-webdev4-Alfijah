import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static String[] readRunwayFile() throws IOException {
        BufferedReader runwaysData = new BufferedReader(new FileReader("resources/runways.csv"));
        String currentLineRunwaysData;
        String[] eachLineRunwaysData = new String[]{};
        while ((currentLineRunwaysData = runwaysData.readLine()) != null) {
            eachLineRunwaysData = currentLineRunwaysData.split(",");
        }
        return eachLineRunwaysData;
    }

    public static String[] readAirportFIle() throws IOException {
        BufferedReader airportsData = new BufferedReader(new FileReader("resources/airports.csv"));
        String currentLineAirportsData;
        String[] eachLineAirportsData = new String[]{};
        while ((currentLineAirportsData = airportsData.readLine()) != null) {
            eachLineAirportsData = currentLineAirportsData.split(",");
        }
        return eachLineAirportsData;
    }

    public static String[] readCountryFile() throws IOException {
        BufferedReader countriesData = new BufferedReader(new FileReader("resources/countries.csv"));
        String currentLineCountriesData;
        String[] eachLineCountriesData = new String[]{};
        while ((currentLineCountriesData = countriesData.readLine()) != null) {
            eachLineCountriesData = currentLineCountriesData.split(",");
        }
        return eachLineCountriesData;
    }

}
