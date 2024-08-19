package order;

public class pastabill {
    public int totalpastabill(int n){
        if(n==1)return 8;
        if(n==2)return 15;
        if(n>=3){

            System.out.println("Enjoy your "+n/3+" complimentory 1.25l of soft drinks ");
            return n*7;
        }
        return 0;
    }
}
