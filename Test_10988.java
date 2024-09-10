import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.StringTokenizer;

public class Test_10988 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		String input = br.readLine();
		int result = 1;

		for(int i = 0; i < input.length() / 2; i++) {
			char A = input.charAt(i);
			char B = input.charAt(input.length() - 1 - i);
			
			if(A != B) {
				result = 0;
				break;
			}
		}
		if(result == 0)
			bw.write("0");
		else
			bw.write("1");
		
		bw.flush();
		bw.close();
	}
}
