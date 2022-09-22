import java.util.*;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int spaces = n-1;
        int stars = 1;
        
        for(int i=1; i<=n ; i++){
            
            for(int j=spaces ; j>=1 ; j--){
                System.out.print(" ");
            }
            
            for(int k=1 ; k<=stars ; k++){
                System.out.print("* ");
            }
            
            spaces--;
            stars+=1;
            System.out.println();
        }
        
        int spaces2 = 0;
        int stars2 = n;
        
        for(int i=1 ; i<=n ; i++){
            for(int j=1; j<=spaces2 ; j++){
                System.out.print(" ");
            }
            for(int k=stars2 ; k>=1 ; k--){
                System.out.print("* ");
            }
            
            spaces2+=1;
            stars2--;
            System.out.println();
        }
    }
}
