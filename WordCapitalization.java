import java.util.*;
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        if(s.length()<1000){
            System.out.println(Character.toUpperCase(s.charAt(0))+s.substring(1));
            
            
        }
        
        in.close();
    }
    
}
