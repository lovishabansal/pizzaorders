import java.sql.SQLOutput;
import java.util.*;
import order.pizzabill;
import order.pastabill;
public class MAIN {
    public static  int choicefunction(){
        System.out.println("welcome to  sab kitchen ");
        System.out.println("if u want to order pizza press 1");
        System.out.println("if u want to order pasta press 2");
        System.out.println("if u want to order both pasta and pizza press 3");
        System.out.println("if u want to exit  press 4");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        return ch;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=choicefunction();
        int totalamountofpizzas=0;
        int totalamountofpasta=0;
        int pizsd=0;
        int passd=0;
        while(choice!=4){
            switch(choice) {
                case 1:
                    System.out.println("enter no. of larger pizzas ");
                    int n=sc.nextInt();
                    pizsd=pizsd+n;
                    pizzabill o=new pizzabill();
                    int x=o.totalpizzabill(n);
                    System.out.println("you bill for pizza is "+x);
                    totalamountofpizzas=totalamountofpizzas+x;
                    break;
                case 2:
                    System.out.println("enter no. of larger pastas ");
                    int p=sc.nextInt();
                    passd=passd+p;
                    pastabill pb=new pastabill();
                    int y=pb.totalpastabill(p);
                    System.out.println("you bill for pasta is "+y);
                    totalamountofpasta=totalamountofpasta+y;
                    break;
                case 3:
                    System.out.println("enter no. of pizzas and pasta u want to enter");
                    int piz=sc.nextInt();
                    int pas=sc.nextInt();
                    passd=passd+piz;
                    pizsd=pizsd+pas;
                    pizzabill og=new pizzabill();
                    int v= og.totalpizandpasbill(piz,pas);
                    System.out.println("your bill is "+v);
                    totalamountofpizzas=totalamountofpizzas+ og.totalpizzabill(piz);
                    totalamountofpasta=totalamountofpasta+ og.totalpastabill(pas);
                    break;


            }

            choice=choicefunction();
        }
        System.out.println("thanks for ordering ");
        System.out.println("your total payment amount from pizzas is "+totalamountofpizzas);
        System.out.println("your total payment amount from pasta is "+totalamountofpasta);
        System.out.println("no. of pizzas sold "+pizsd+"no.of pastas sold "+passd);



    }
}
