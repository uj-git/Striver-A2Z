import java.util.*;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int spaces=n-1;
        int stars = 1;
        for(int i=1 ; i<=n ; i++){
            for(int j=spaces ; j>=1 ;j--){
                System.out.print(" ");
            }
            for(int k=1 ; k<=stars ; k++){
                System.out.print("*");
            }
            spaces--;
            stars+=2;
            System.out.println();
            
        }
    }
}
