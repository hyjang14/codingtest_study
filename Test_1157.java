import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_1157 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26]; // 영문자의 개수 26개
		
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') 
				arr[s.charAt(i) - 'A']++;
			else
				arr[s.charAt(i) - 'a']++;
		}
		
		int max = -1;
		char alp = '?';
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				alp = (char)(i + 'A');
			}
			else if(arr[i] == max)
				alp = '?';
		}
		
		System.out.println(alp);
	}

}
