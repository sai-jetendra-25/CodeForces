import java.util.*;
public class Bi_Land {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        int x=0;
        for(int i=0;i<n;i++){
            String s=in.nextLine();
            if(s.contains("++")){
                x++;
            }
            else x--;

            

        }
        System.out.println(x);
        
        in.close();
    }
    
}
