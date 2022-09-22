import java.util.*;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 65 ;
        
        for(int i=0; i<n ; i++){
            
            for(int j=0 ; j<=i; j++){
                
                char ch = (char)(a+n-1-j);
                
                System.out.print(ch + " ");
                
            }
            System.out.println();
        }
    }
}
