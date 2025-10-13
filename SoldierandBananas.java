import java.util.*;
public class SoldierandBananas {
    public static void main(String[] args) {
        
    
    Scanner in=new Scanner(System.in);
    int k=in.nextInt();
    int n=in.nextInt();
    int w=in.nextInt();
    int TotalAmount=0;
    for (int i=1;i<=w;i++){
        
        TotalAmount+=i*k;
        

        
    }
    int b=TotalAmount-n;
    System.out.println(Math.max(b,0));
    in.close();

    }

    
}
