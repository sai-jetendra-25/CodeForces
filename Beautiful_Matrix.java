import java.util.*;
public class Beautiful_Matrix {
    public static void main(String[] args) {
        int i;
        int j;
        int r=0;int c=0;
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[5][5];
        
        for( i=0;i<5;i++){
            for( j=0;j<5;j++){
              arr[i][j]=in.nextInt();
              if(arr[i][j]==1){
                r=i;
                c=j;

                }
             
                
            }
        }

        
         
        int moves=Math.abs(r-2)+(Math.abs(c-2));
        System.out.println(moves);
            

        
    
    }
}
