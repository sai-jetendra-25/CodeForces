import java.util.*;
public class Domino_piling {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int m=in.nextInt();
        int n= in.nextInt();
        int s=2*1;
        int DP=(m*n)/s;
        System.out.println(DP);
        in.close();

    }
    
}
