/*You are given the heights of consecutive buildings. You can move from the roof of a
building to the roof of the next adjacent building. You need to find the maximum number
of consecutive steps you can put forward such that you gain an increase in altitude with
each step. */

import java.util.Scanner;

public class BCSE103E_ASSIGNMENT__30_9_24__PRG_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of buildings: ");
        int n = sc.nextInt();
        
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the height of building #%d: ", i + 1);
            heights[i] = sc.nextInt();
        }
        
        int maxSteps = 0;
        int currentSteps = 0;
        
        for (int i = 1; i < n; i++) {
            if (heights[i] > heights[i-1]) {
                currentSteps++;
                if (currentSteps > maxSteps){
                    maxSteps = currentSteps;
                }
            } else {
                currentSteps = 0;
            }
        }
        
        System.out.println("Maximum number of consecutive steps: " + maxSteps);
    }
}