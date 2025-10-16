import java.util.*;
public class AntonandPolyhedrons {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int Total=0;
    
        int n=in.nextInt();
        in.nextLine();
        for(int i=1;i<=n;i++){
            String s=in.nextLine().toLowerCase();
        
            int TetraFaces=tetrahedron(s);
            int cubeFaces=cube(s);
              int octaFaces= octahedron(s);
            int DodeFaces=dodecahedron(s);
            int IcosFaces=icosahedron(s);
            Total+=TetraFaces+cubeFaces+octaFaces+DodeFaces+IcosFaces;
        }
        out(Total);
        in.close();
    }
    public static void out(int Total){

   System.out.println(Total);
    }
        
    
    public static int  tetrahedron(String s){
         int count=0;
         if(s.equals("tetrahedron")){
            count+=4;
         }
         return count;
    }
    public static int cube(String s){
           int count=0;
         if(s.equals("cube")){
            count+=6;
         }
         return count;
    }
    public static int octahedron(String s){
           int count=0;
         if(s.equals("octahedron")){
            count+=8;
         }
         return count;
    }
    public static int dodecahedron(String s){
           int count=0;
         if(s.equals("dodecahedron")){
            count+=12;
         }
         return count;
    }
     public static int icosahedron(String s){
           int count=0;
         if(s.equals("icosahedron")){
            count+=20;
         }
         return count;
         
    }
}
    
    

