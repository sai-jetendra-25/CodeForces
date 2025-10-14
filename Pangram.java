import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();    
        in.nextLine();             
        String s = in.nextLine().toLowerCase(); 

        Set<Character> letters = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }

        if (letters.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        in.close();
    }
}