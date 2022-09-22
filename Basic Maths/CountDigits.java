import java.io.InputStreamReader;
import java.io.*;
public class CountDigits{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        int count = 0;
        int x = N;
        
        while(x!=0){
            int rem = x%10;
            if(rem!=0){
                count++;
            }
            x = x/10;
        }
        System.out.print(count);
    }
}