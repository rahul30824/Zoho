import java.util.*;

public class Main {

    private static int distanceSquared(int x1, int y1, int x2, int y2) {
        return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
    }

    public static boolean isSquare(int x1, int y1, int x2, int y2, 
                                   int x3, int y3, int x4, int y4) {
        // Store all six distances in a list
        List<Integer> distances = new ArrayList<>();
        distances.add(distanceSquared(x1, y1, x2, y2));
        distances.add(distanceSquared(x1, y1, x3, y3));
        distances.add(distanceSquared(x1, y1, x4, y4));
        distances.add(distanceSquared(x2, y2, x3, y3));
        distances.add(distanceSquared(x2, y2, x4, y4));
        distances.add(distanceSquared(x3, y3, x4, y4));

        // Sort distances
        Collections.sort(distances);

        // Check if first four distances (sides) are equal and last two (diagonals) are equal
        return distances.get(0) > 0 && 
               distances.get(0).equals(distances.get(1)) &&
               distances.get(1).equals(distances.get(2)) &&
               distances.get(2).equals(distances.get(3)) &&
               distances.get(4).equals(distances.get(5)) &&
               (2 * distances.get(0) == distances.get(4));  // Diagonal should be √2 times side squared
    }

    public static void main(String[] args) {
        // Example Test Cases
        System.out.println(isSquare(20, 10, 10, 20, 20, 20, 10, 10) ? "Yes" : "No");  // Yes
        System.out.println(isSquare(2, 1, 10, 20, 5, 6, 10, 10) ? "Yes" : "No");      // No
    }
}
