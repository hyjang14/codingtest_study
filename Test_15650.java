// 백트래킹

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_15650 {

	public static int[] arr;
	public static int N, M;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		StringTokenizer st = new StringTokenizer(input);
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		
		back(1, 0);
		// 값은 1부터 시작하기 때문에 1을 넣는다.
	} 
	public static void back(int next_index, int index) {
		// Base Condition
		if(index == M) {
			for(int i = 0; i < M; i++)
				System.out.print(arr[i] + " ");
			System.out.println();
			return;
		}
		
		// vis배열 필요없다. -> 반복문이 next_i부터 시작하기 때문
		for(int i = next_index; i <= N; i++) {
			arr[index] = i;
			back(i + 1, index + 1);
		}
	}

}
