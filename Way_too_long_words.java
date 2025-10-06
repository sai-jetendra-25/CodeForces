import java.util.*;
public class Way_too_long_words {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++){

            String w=in.nextLine();
            int l=w.length();
            if(l>10){
                char first=w.charAt(0);
                int  middle=w.length() - 2;
                char last=w.charAt(l-1);
              
               String ab=first+String.valueOf(middle)+last;

               

               System.out.println(ab);
            }
            else {
            System.out.println(w);
            }

        }
        in.close();
        
        
    }
    
}
