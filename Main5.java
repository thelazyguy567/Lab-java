public class Main5 {
    int x=5;
    public static void main(String []args){
        Main5 myObj1=new Main5();
        Main5 myObj2=new Main5();
        myObj2.x=25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
