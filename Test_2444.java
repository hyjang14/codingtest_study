import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_2444 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int n = Integer.parseInt(input);
		
		for(int i = 1; i <= n; i++) {
			for(int j = n-i; j > 0; j--)
				System.out.print(" ");
			for(int p = 0; p < i*2-1 ; p++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i = n-1; i >= 0; i--) {
			for(int j = n-i; j > 0; j--)
				System.out.print(" ");
			for(int p = 0; p < i*2-1 ; p++)
				System.out.print("*");
			System.out.println();
		}
	}

}
