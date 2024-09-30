/* Given a string of characters, find the length of the longest proper prefix which is also a proper suffix. */

import java.util.Scanner;

public class BCSE103E_ASSIGNMENT__30_9_24__PRG_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int n = str.length();
        if (n < 2) {
            System.out.println("Length of the longest proper prefix and suffix: 0");
            return;
        }
        
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        
        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        System.out.println("Length of the longest proper prefix and suffix: " + lps[n - 1]);
    }
}