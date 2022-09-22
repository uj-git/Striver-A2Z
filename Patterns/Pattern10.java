import java.util.*;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int k=n-1;k>0;k--){
            for(int l=0;l<k;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
