import java.util.*;
public class StonesontheTable {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        int count=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }

        }
        System.out.println(count);
        in.close();
        
    }
    
}
