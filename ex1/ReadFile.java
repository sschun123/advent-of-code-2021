import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static ArrayList<Integer> getIntArray(String filename) throws FileNotFoundException {
        File txtData = new File(filename);
        Scanner fileScan = new Scanner(txtData);
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        while(fileScan.hasNextLine()) {
            intArray.add(fileScan.nextInt());
        }
        fileScan.close();
        return intArray;
    }
}
