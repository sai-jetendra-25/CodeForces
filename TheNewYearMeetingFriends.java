import java.lang.reflect.Array;
import java.util.*;
public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x1=in.nextInt();
        int x2=in.nextInt();
        int x3=in.nextInt();
        int[] arr={x1,x2,x3};
        Arrays.sort(arr);
       
        System.out.println(arr[2]-arr[0]);
     
        
in.close();

        
    }
    
}
