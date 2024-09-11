package 문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test_1157 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 단어 입력받기
		String str = br.readLine();
		
		// 알파벳 개수만큼 배열 생성
		int[] alp = new int[26];
		
		// 알파벳 개수 세기
		for(int i = 0; i < str.length(); i++) {
			if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') 
				alp[str.charAt(i) - 'A']++;
			else
				alp[str.charAt(i) - 'a']++;
		}
		
		// 빈도수가 가장 높은 알파벳 찾기
		int max = -1;
		char result = '?';
		
		for(int i = 0; i < 26; i++) {
			if(alp[i] > max) {
				max = alp[i];
				result = (char)(i + 'A');
			}
			else if(alp[i] == max) {
				result = '?';
			}
		}
		
		System.out.println(result);
	}

}
