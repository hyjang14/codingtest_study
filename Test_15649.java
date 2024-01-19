// 백트래킹
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_15649 {

	public static int N, M;
	public static boolean[] vis;
	public static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		vis = new boolean[N + 1];
		
		for(int i = 1; i <= N; i++)
			vis[i] = false;
		
		back(0);
	}
	
	public static void back(int index) {
		if(index == M) {
			for(int i = 0; i < M; i++)
				System.out.print(arr[i] + " ");
			
			System.out.println();
			return;
		}
		
		for(int i = 1; i <= N; i++) {
			if(vis[i]) // vis가 false이면 밑에 그대로 계속
				continue;
			
			// i가 방문 가능 할 때(vis[i] == false일 때)
			vis[i] = true; // 다음에는 i를 사용하지 못하도록 표시(중복 방지)
			arr[index] = i; 
			back(index + 1);
			vis[i] = false; // 방문한 배열을 false 처리한다.(그래야 index 0애서 사용할 수 있다.)
			// res에는 0을 안 넣어도 괜찮다.(어차피 덮어씌우면 되므로)
		}
	}

}
