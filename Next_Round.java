import java.util.*;
public class Next_Round {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int total=0;
        for (int i=0;i<n;i++){
            int l=in.nextInt();
            if(l>k  && l>0){
                total++;
            }
        }
        System.out.println(total);
        
        in.close();
    }
    
}
