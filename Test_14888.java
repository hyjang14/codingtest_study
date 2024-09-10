import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Test_14888 {

	public static int n;
	public static int[] arr;
	public static int[] math;
	public static String[] op = {"+", "-", "*", "/"};
	public static int res_max, res_min;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1. 개수 입력 받기
		n = Integer.parseInt(br.readLine());
		
		// 2. 숫자 배열 입력 받기
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		// 3. 연산자 배열 입력 받기
		String input2 = br.readLine();
		StringTokenizer st2 = new StringTokenizer(input2);
		math = new int[4];
		for(int i = 0; i < 4; i++)
			math[i] = Integer.parseInt(st2.nextToken());
		
		res_max = 
		solve
	}
	
	public static void solve() {
		for(int i = 0; i < 4; i++) {
			
		}
	}

}
