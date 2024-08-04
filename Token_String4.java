import java.util.*;
public class Token_String4{
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("Demostating methods from String Tokenizer class"," ");
        while(st.hasMoreElements()){
            System.out.println(st.nextToken());
        }
    }
}
