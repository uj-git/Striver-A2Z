import java.util.*;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int spaces = 0 ;
        
        
        for(int i=0 ; i<n ; i++){
            for(int j=n-i ; j>0 ; j--){
                System.out.print("*");
            }
            for(int k=spaces ; k>0 ; k--){
                System.out.print(" ");
            }
            for(int j=n-i ; j>0 ; j--){
                System.out.print("*");
            }
            
            spaces+=2;
            System.out.println();
        }
        
        int spaces2 = 2*n - 2;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            for(int k=spaces2 ; k>0 ; k--){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            
            spaces2-=2;
            System.out.println();
            
        }
    }
}
