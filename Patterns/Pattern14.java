import java.util.*;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char ch;
        for(int i=1 ; i<=n ; i++){
            ch='A';
            for(int j=1 ; j<=i ; j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
        
    }
}
