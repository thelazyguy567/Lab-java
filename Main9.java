public class Main9 {
    public void fullThrottle(){
        System.out.println("The car is going as fast it can");
    }
    public void speed(int maxSpeed){
        System.out.println("Max speed is:"+maxSpeed);
    }
    public static void main(String[]args){
        Main9 myCar=new Main9();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
