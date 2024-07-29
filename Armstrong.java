import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = n1; i < n2; i++) {
            int sum = 0;
            int x = i;

            while (x != 0) {
                int r = x % 10;
                x = x / 10;

                sum += (r* r * r);
            }
            if (i == sum) {
                System.out.println(i);
            }
        }
    }
}
