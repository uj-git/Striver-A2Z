import java.io.*;
public class GCD {

    public static Long gcd (Long A , Long B){
        if(B==0) return A;
        return (gcd(B , A%B));
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long A = Long.parseLong(br.readLine());
        Long B = Long.parseLong(br.readLine());

        System.out.println(gcd(A,B));
    }
    
}
