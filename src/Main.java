import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner airportsData = new Scanner(new File("C:\\TechGrounds\\TG Web Development\\Java\\airport-opdracht-webdev4-Alfijah\\resources\\airports.csv"));
        airportsData.useDelimiter(",");
        while (airportsData.hasNext()) {
            System.out.println(airportsData.next());
        }
        airportsData.close();
    }
}
