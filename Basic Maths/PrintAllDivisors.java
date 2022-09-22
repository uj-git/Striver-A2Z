import java.io.*;

public class PrintAllDivisors {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
		
		printDivisorsOptimal(n);
		
	}

	public static void printDivisorsOptimal(int n){
		
		System.out.println("The divisors of "+n+" are:");
		for(int i = 1; i <= (int)Math.sqrt(n); i++)
			if(n % i == 0){
				System.out.print(i + " ");
				if(i != n/i) System.out.print(n/i + " ");
			}
			
		System.out.println();
	}
    
}
