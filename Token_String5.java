import java.util.*;
public class Token_String5{
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("Demostating methods from String Tokenizer class"," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextElement());
        }
    }
}
