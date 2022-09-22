import java.io.*;
public class ArmstrongNumbers {

    static String armstrongNumber(int n){
        int x = n;
        int count =0;
        int Num = 0;
        
        while(x!=0){
            x=x/10;
            count++;
        }
        
        x=n;
        
        while(x!=0){
            int temp = x%10;
            Num += Math.pow(temp , count);
            x=x/10;
        }
        
        if(Num==n){
            return "Yes";
        }
        else return "No";
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(armstrongNumber(N));
    }
    
}
