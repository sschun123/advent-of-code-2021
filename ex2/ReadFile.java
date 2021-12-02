import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static ArrayList<Pair<String, Integer>> getData(String filename) throws FileNotFoundException {
        File txtData = new File(filename);
        Scanner fileScan = new Scanner(txtData);
        ArrayList<Pair<String, Integer>> pairs = new ArrayList<Pair<String, Integer>>();
        while(fileScan.hasNextLine()) {
            String direction = fileScan.next();
            int magnitude = fileScan.nextInt();
            pairs.add(new Pair(direction, magnitude));
        }
        fileScan.close();
        return pairs;
    }
}
