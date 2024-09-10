import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test_11720 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		String[] num = input.split("");

		int[] nums = new int[n];
		
		for(int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(num[i]);
		}
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += nums[i];
		}
		
		System.out.println(sum);
		
	}

}
