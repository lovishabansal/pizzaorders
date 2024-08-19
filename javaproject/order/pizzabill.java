package order;

public class pizzabill {
    public int totalpizzabill(int n){
        if(n==1)return 12;
        if(n==2)return 22;
        if(n>=3){

            System.out.println("Enjoy your "+n/3+" complimentory garlic breads ");
            return n*10;
        }
        return 0;
    }
    public int totalpastabill(int n){
        if(n==1)return 8;
        if(n==2)return 15;
        if(n>=3){

            System.out.println("Enjoy your "+n/3+" complimentory 1.25l of soft drinks ");
            return n*7;
        }
        return 0;
    }
    public int totalpizandpasbill(int n,int m) {
        if (n < 3 && m < 3) {
//            System.out.println("your toatal bill is ");
            int j = (totalpizzabill(n) + totalpastabill(m));
            return j;
        }
        if (n >= 3 && m >= 3) {
            int min = Math.min(n, m);
            System.out.println("Enjoy you free " + min / 3 + " baklava ,1.5l cold drinks in addition to garlic bread ");
//            System.out.println("your bill is ");
            return (n * 10 + m * 7);
        }
    return 0;
    }
}
