import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i = 0; i < n; i++) 
			if(check(br.readLine()) == true)
				count++;
		
		br.close();
		System.out.print(count);
	}
	
	static boolean check(String s) {
		boolean[] checkAlp = new boolean[26];
		int prev = -1;
		
		for(int i = 0; i < s.length(); i++) {
			int now = s.charAt(i);
			
			if(prev != now) {
				if(checkAlp[now - 97] == false) {
					checkAlp[now - 97] = true;
					prev = now;
				}
				else if(checkAlp[now - 97] == true) // 이미 앞에서 나온 알파벳
					return false;
			}
			else if(prev == now)
				continue;
		}
		return true;
	}

}
