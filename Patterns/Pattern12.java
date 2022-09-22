import java.util.*;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int space = 4*n - 4;
        int n2 = n;
        
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            for(int k=space ; k>0 ; k--){
                System.out.print(" ");
            }
            for(int j=i ; j>0 ; j--){
                System.out.print(j+" ");
            }
            space-=4;
            System.out.println();
            
        }
    }
}
