import java.util.*;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int c=1;
        
        for(int i=0 ; i<n ; i++){
            
            for(int j=0 ; j<=i ; j++){
                
                System.out.print(c + " ");
                
                c=1-c;
            }
            
            c = i % 2;
            
            System.out.println();
        }
    }
}
