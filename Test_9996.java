import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test_9996 {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 파일의 개수 N 입력받기
		int N = Integer.parseInt(br.readLine());
		
		// 패턴 입력받기
		String pat = br.readLine();
		
		// 파일 이름 입력받기
		String[] file = new String[N];
		for(int i = 0; i < N; i++) {
			file[i] = br.readLine();
		}
		
		// 패턴 분리
		String alp[] = pat.split("");
		
		// 패턴 일치하는지 확인
		

	}

}
