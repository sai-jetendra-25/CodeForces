import java.util.*;
public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String n=in.nextLine();
        int LuckyCount=0;
        
        
        
        for (int i=0;i<n.length();i++){
            char c=n.charAt(i);
            if(c=='4'|| c=='7'){
                LuckyCount++;
                
            }
        }
        String count = Integer.toString(LuckyCount);
        
        boolean islucky=true;
            for(int i=0;i<count.length();i++){
                char c=count.charAt(i);
                if(c!='4'&& c!='7'){
                    islucky=false;
                }
                
            }
        
            
            if(islucky && (LuckyCount>0)){
                System.out.println("YES");
            }
            else  System.out.println("NO");
            
     in.close();   
    }
    
    
}
