import java.util.Scanner;
public class Secondques {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int moves = scanner.nextInt();
        System.out.println(weight);
        if (moves <= 6) {
            if (col < 8) {
                System.out.println(row + "," + (col + 1)); // Outputs (2, 3)
            }
        } else {
            int[][] directions = {{-1, 0},{1, 0},{0, -1},{0, 1},{-1, -1},{-1, 1},{1, -1},{1, 1}};
            String[] positions = new String[8];
            int count = 0;
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if (newRow >= 1 && newRow <= 8 && newCol >= 1 && newCol <= 8) {
                    positions[count++] = newRow + "," + newCol;
                }
            }
            for (int i = 0; i < count; i++) {
                System.out.println(positions[i]);
            }
        }
    }
}
