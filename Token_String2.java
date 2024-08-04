import java.util.*;
public class Token_String2{
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("my,name,is,Gokul");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken(","));
        }
    }
}

