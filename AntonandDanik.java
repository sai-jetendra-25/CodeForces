import java.util.*;
public class AntonandDanik {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s=in.next().toUpperCase();
        int AC=Acount(s);
        int DC=Dcount(s);
       
        if(AC>DC){
            System.out.println("Anton");
        }
        else if(AC==DC){
            System.out.println("Friendship");
        }
        else {
            System.out.println("Danik");
        }
        
        
    }
    public static int Acount(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                count++;
            }
        }
        return count;

    }
    public static int Dcount(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='D'){
                count++;
            }
        }
        return count++;

    }

    
}
