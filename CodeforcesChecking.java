import java.sql.ResultSet;
import java.util.*;
public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String t="codeforces";
        in.nextLine();
        for(int i=0;i<n;i++){
            String s=in.nextLine().toLowerCase();
            boolean r=Result(s,t);
            if(r){
                System.out.println("YES");
            }
            else System.out.println("NO");
            
        
        }
        in.close();
        
        
        
    }
    public static  boolean Result(String s,String t){
        char ch=s.charAt(0);
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==ch){
                return true;
            }


        }
        return false;

  
            

        }

    }

    

