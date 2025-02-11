import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        int sum = 0;

        // Input the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                if (i == j) { // Main diagonal condition
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Sum of main diagonal: " + sum);
        sc.close();
    }
}
