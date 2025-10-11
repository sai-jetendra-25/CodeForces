import java.util.*;
public class Words_UpperOrLower1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int H=countUpper(s);
        int L=countLower(s);
        if(H>L){
            System.out.println(s.toUpperCase());

        }
        else {
            System.out.println(s.toLowerCase());
        }
        in.close();
        
    }
    public static int countUpper(String s){
        int c=0;
        for (int i=0; i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                c++;

            }

        }
        return c;

    }
    public static int  countLower(String s) {
        int c=0;
         for (int i=0; i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                c++;

            }

        }
        return c;

        
    }
    
        
    }
    

