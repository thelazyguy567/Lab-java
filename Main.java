import java.util.Scanner;
class AreaCalculator {
    public static double ComputeArea(double h, double b) {
        return h * b;
    }
    public static double ComputeArea(double t, double b, double h) {
        return h * (t + b) / 2;
    }
    public static double ComputeArea(double r) {
        return Math.PI * r * r;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rectHeight = scanner.nextDouble();
        double rectBase = scanner.nextDouble();
        double rectArea = ComputeArea(rectHeight, rectBase);
        rectArea = Math.round(rectArea * 100.0) / 100.0;
        double trapTop = scanner.nextDouble();
        double trapBottom = scanner.nextDouble();
        double trapHeight = scanner.nextDouble();
        double trapArea = ComputeArea(trapTop, trapBottom, trapHeight);
        trapArea = Math.round(trapArea * 100.0) / 100.0;
        double circRadius = scanner.nextDouble();
        double circArea = ComputeArea(circRadius);
        circArea = Math.round(circArea * 100.0) / 100.0;
        System.out.println(rectArea);
        System.out.println(trapArea);
        System.out.println(circArea);
    }
}