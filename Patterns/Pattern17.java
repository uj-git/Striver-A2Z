import java.util.*;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = n-1;
        int a = 65;
        
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=space ; j++){
                System.out.print(" ");
            }
            for(int j=65 ; j<=a ; j++){
                System.out.print((char)j);
            }
            for(int j=a-1; j>=65 ; j--){
                System.out.print((char)j);
            }
            space--;
            a++;
            System.out.println();
        }
    }
    
}
