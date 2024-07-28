
import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            System.out.println("1.Addition\n2.subtraction\n3.multiplication\n4.division\n5.power\n6.Exit");
            Scanner myobj = new Scanner(System.in);
            int num = myobj.nextInt();

            if (num == 1) {
                System.out.println("Enter the first and second no");
                int num1 = myobj.nextInt();
                int num2 = myobj.nextInt();
                System.out.println(num1 + num2);
                break;
            } else if (num == 2) {
                System.out.println("Enter the first and second no");
                int num1 = myobj.nextInt();
                int num2 = myobj.nextInt();
                System.out.println(num1 - num2);
                break;
            } else if (num == 3) {
                System.out.println("Enter the first and second no");
                int num1 = myobj.nextInt();
                int num2 = myobj.nextInt();
                System.out.println(num1 * num2);
                break;
            } else if (num == 4) {
                System.out.println("Enter the first and second no");
                float num1 = myobj.nextFloat();
                float num2 = myobj.nextFloat();
                System.out.println(num1 / num2);
                break;
            } else if(num==5){
                System.out.println("Enter the first and second no");
                int num1=myobj.nextInt();
                int num2=myobj.nextInt();
                System.out.println(Math.pow(num1,num2));
                break;
            }else if (num==6){
                System.out.println("Invalid input");
                break;
            }
        }
    }
}

    

