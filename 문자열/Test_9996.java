package 문자열;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//문제설명: 문자열 함수들을 이용한 문자열 비교 문제
//핵심개념: 문자열 함수(split, substring, equals)

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
	
		// 패턴 분리하기(split 함수 사용)
		String[] arr = pat.split("\\*");
		
		// 패턴 일치하는지 확인(substring 함수, equals 함수 사용)
		// arr.substring(0, 4)면 0부터 3까지
		// arr.substring(3)이면 3부터 끝까지
		// equals 함수는 문자열만 가능!(char-문자 비교는 == 로 한다.)
		
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
