import java.util.Scanner;
class Ingredient{
    String name;
    int quantity;
    double cost;
}
public class Thirdques{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        char choice=scanner.nextLine().charAt(0);
        int radius=scanner.nextInt();
        double area=3.14*radius*radius;
        double totalcost=0;
        int norequireditems=scanner.nextInt();
        Ingredient requireditems[] = new Ingredient[norequireditems];
        for(int i=0;i<norequireditems;i++){
            requireditems[i]=new Ingredient();
            scanner.nextLine();
            requireditems[i].name=scanner.nextLine();
            requireditems[i].quantity=scanner.nextInt();
        }
        int noavailitems=scanner.nextInt();
        Ingredient[] availitems= new Ingredient[noavailitems];
        for(int i=0;i<noavailitems;i++){
            availitems[i]=new Ingredient();
            scanner.nextLine();
            availitems[i].name=scanner.nextLine();
            availitems[i].cost=scanner.nextDouble();
        }
        for(int i=0;i<norequireditems;i++){
            for(int j=0;j<noavailitems;j++){
                if(requireditems[i].name.equals(availitems[j].name)){
                    totalcost+=(requireditems[i].quantity/100.00)*availitems[j].cost;
                }
            }
        }
        totalcost=totalcost*area;
        totalcost+=(choice=='0')?50:100;
        System.out.printf("%.2f",totalcost);
    }
}