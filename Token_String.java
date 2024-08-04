import java.util.StringTokenizer;
public class Token_String{
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("my name is Gokul");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
