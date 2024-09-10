package 문자열;


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
	
		// 패턴 분리하기
		String[] arr = pat.split("\\*");
		
		// 패턴 일치하는지 확인
		String result = "NE";
		for(int i = 0; i < N; i++) {
			if( file[i].length() >= arr[0].length() + arr[1].length() && // 길이 확인하기
					arr[0].equals(file[i].substring(0, arr[0].length())) && 
					arr[1].equals(file[i].substring(file[i].length()-arr[1].length())) )
				result = "DA";
			else
				result = "NE";
			
			System.out.println(result);
		}

	}
}
