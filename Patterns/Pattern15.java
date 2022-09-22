import java.util.*;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char ch;
        for(int i=n ; i>0 ; i--){
            ch='A';
            for(int j=i ; j>0; j--){
                System.out.print(ch++);
            }
            
            System.out.println();
        }
    }
}
