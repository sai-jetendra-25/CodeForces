import java.util.*;
public class BearandBigBrother {
    public static void main(String[] args) {
        
    
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    int year=0;
    while(a<=b){
        a*=3;
        b*=2;
        year++;
    }
    System.out.println(year);


    
    in.close();


}
    
}
