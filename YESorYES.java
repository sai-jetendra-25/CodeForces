import java.util.*;
public class YESorYES {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for (int i=0;i<n;i++){
            String s=in.nextLine().toLowerCase();
            
            if(s.equals("yes")){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            

        
    }
    in.close();
    
}
}
