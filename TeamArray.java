import java.util.*;;
public class TeamArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int totalSum=0;
        int [][] arr=new int[n][3];
        for (int i=0;i<n;i++) {
            arr[i][0]=in.nextInt();
            arr[i][1]=in.nextInt();
            arr[i][2]=in.nextInt();
            int sum= arr[i][0]+arr[i][1]+arr[i][2];
            if(sum>=2){
                totalSum++;
            }
        }
        System.out.println(totalSum);
        
    }
    
}
