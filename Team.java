import java.util.*;;
public class Team {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int totalsums=0;
        while(n-- >0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int sum=a+b+c;
            if(sum>=2){
                totalsums++;
            }

        }
        System.out.println(totalsums);
            
            
        }


 

      
        

        
    }
    
