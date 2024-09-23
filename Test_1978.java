import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test_1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] prime = new int[N];
		int count = 0;
		
		String[] num = br.readLine().split(" ");
		int N = 100;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i= 2; i <= 100; i++) {
			temp.add(i);
		}

		
		
		int[] prime_num = new int[0];
		for(int i = 0; i < Math.sqrt(N); i++) {
			
		}
				
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(num[i]);
		}
		
		for(int i = 0; i < N; i++) {
			if(arr[i] != 1 && arr[i] != 2) {
				for(int j = 2; j < N; j++) {
					if(arr[i] % j == 0) {
						prime[i] = 0;
						break;
					}
					else
						prime[i] = 1;
				}
			}
		}
		for(int i = 0; i < N; i++) {
			if(arr[i] == 1)
				count++;
			if(prime[i] == 1)
				count++;
		}
		
		System.out.print(count);
		
	}

}
