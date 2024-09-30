/* Given two strings s and p. Find the smallest window in the string s consisting of all the
characters(including duplicates) of the string p. Return "-1" in case there is no such
window present. In case there are multiple such windows of same length, return the one
with the least starting index.
Note : All characters are in Lowercase alphabets */

import java.util.Scanner;

public class BCSE103E_ASSIGNMENT__30_9_24__PRG_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s: ");
        String s = sc.nextLine();
        System.out.print("Enter p: ");
        String p = sc.nextLine();

        int[] pFreq = new int[256];
        int[] sFreq = new int[256];
        int start = 0, minStart = -1, minLength = Integer.MAX_VALUE;
        int count = 0, targetCount = 0;
        
        //counting the frequency of characters in p
        for (char c : p.toCharArray()) {
            if (pFreq[c] == 0) targetCount++;
            pFreq[c]++;
        }
        
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            sFreq[c]++;
            
            if (sFreq[c] == pFreq[c]) {
                count++;
            }
            
            if (count == targetCount) {
                while (start <= end && count == targetCount) {
                    if (end - start + 1 < minLength) {
                        minLength = end - start + 1;
                        minStart = start;
                    }
                    
                    char startChar = s.charAt(start);
                    sFreq[startChar]--;
                    if (sFreq[startChar] < pFreq[startChar]) {
                        count--;
                    }
                    start++;
                }
            }
        }
        
        String result;
        if (minStart != -1){
            System.out.println("Smallest substring: " + s.substring(minStart, minStart + minLength));
        }
    }
}