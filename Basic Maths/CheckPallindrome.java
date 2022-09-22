import java.io.*;

public class CheckPallindrome {

    public static String isPallindrome(int n){
        String s = Integer.toString(n);
        
        int i=0;
        int j=s.length() - 1;
        
        int flag =0;
        
        while(i<=j){
            
            if(s.charAt(i)==s.charAt(j)){
                flag = 1;
            }
            else{
                flag = 0;
                break;
            }
            
            i++;
            j--;
        }
        
        if(flag==1){
            return "Yes";
        }
        else return "No";

    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(isPallindrome(n));
    }
    
}
