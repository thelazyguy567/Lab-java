/* Given an unsorted array arr of of positive integers. One number 'A' from set {1, 2,....,n}
is missing and one number 'B' occurs twice in array. Find numbers A and B. */

import java.util.Scanner;

public class BCSE103E_ASSIGNMENT__30_9_24__PRG_4 {
    private static int[] missrepeat(int[] arr) {
        int n = arr.length;
        boolean[] seen = new boolean[n + 1];
        int repeating = -1, missing = -1;

        for (int num : arr) {
            if (seen[num]) {
                repeating = num;
            } else {
                seen[num] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                missing = i;
                break;
            }
        }

        return new int[]{repeating, missing};
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element #%d: ", i);
            arr[i] = sc.nextInt();
        }
        
        int[] result = missrepeat(arr);
        System.out.printf("Repeating number: %d ; Missing number: %d", result[0], result[1]);
    }
}