import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> depths = ReadFile.getIntArray("./ex1/SonarSweep.txt");
        int sweeps1 = ex1.sweep1(depths);
        int sweeps2 = ex1.sweep2(depths);
        System.out.println(sweeps1);
        System.out.println(sweeps2);
    }

    public static int sweep1(ArrayList<Integer> depths) {
        int lastDepth = depths.get(0);
        int incCount = 0;
        for (int i = 1; i < depths.size(); i++) {
            int depth = depths.get(i);
            if (depth > lastDepth) {
                incCount++;
            }

            lastDepth = depth;
        }
        return incCount;
    }

    public static int sweep2(ArrayList<Integer> depths) {
        int incCount = 0;
        
        int previousStartIdx = 0;
        int newIdx = 3;
        boolean sweep = true;
        int previousSum = depths.get(previousStartIdx) + depths.get(1) + depths.get(2);

        while (sweep) {
            int curSum = (previousSum - depths.get(previousStartIdx)) + depths.get(newIdx);

            if (curSum > previousSum) {
                incCount++;
            }

            previousStartIdx++;    
            newIdx = previousStartIdx + 3;        
            previousSum = curSum;

            if (newIdx >= depths.size()) {
                sweep = false;
            }
        }

        return incCount;
    }
}