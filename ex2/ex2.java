import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Pair<String, Integer>> map = ReadFile.getData("./ex2/Data.txt");
        int answer1 = ex2.part1(map);
        System.out.printf("part 1 solution: %d\n", answer1);
        int answer2 = ex2.part2(map);
        System.out.printf("part 2 solution: %d\n", answer2);
    }

    public static int part2(ArrayList<Pair<String, Integer>> map) {
        int x = 0;
        int y = 0;
        int aim = 0;

        for (Pair<String,Integer> pair : map) {
            switch (pair.getLeft()) {
                case "forward":
                    x += pair.getRight();
                    y += (pair.getRight() * aim);
                    break;
                case "up":
                    aim -= pair.getRight();
                    break;
                case "down":
                    aim += pair.getRight();
                    break;
            }
        }

        return x * y;
    }
    
    public static int part1(ArrayList<Pair<String, Integer>> map) {
        int x = 0;
        int y = 0;

        for (Pair<String,Integer> pair : map) {
            switch (pair.getLeft()) {
                case "forward":
                    x += pair.getRight();
                    break;
                case "up":
                    y -= pair.getRight();
                    break;
                case "down":
                    y += pair.getRight();
                    break;
            }
        }

        return x * y;
    }
}
