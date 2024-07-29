import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two  integers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int max = (n1 > n2) ? n1 : n2;
        while (true) {
            if ((max % n1 == 0) && (max % n2 == 0)) {
                System.out.printf("The LCM of %d and %d is %d\n", n1, n2, max);
                break;
            }
            ++max;
        }
    }
}
