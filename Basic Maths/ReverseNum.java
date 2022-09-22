import java.io.*;

public class ReverseNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int x = n;

        int rev = 0;

        while(x!=0){
            int rem = x%10;
            rev = rev*10 + rem ;
            x = x/10;
        }

        System.out.println(rev);
    }
    
}
