import java.util.*;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int spaces =0;
        int stars = (2*n)-1;
        
        for(int i=1 ; i<=n ; i++){
            for(int j=0 ; j<spaces;j++){
                System.out.print(" ");
            }
            for(int k=0; k<stars; k++){
                System.out.print("*");
            }
            spaces+=1;
            stars-=2;
            
            System.out.println();
            
        }
    }
    
}
