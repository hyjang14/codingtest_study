import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_25206 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double result = 0;
		double sum = 0;
		
		
		for(int i = 0; i < 20; i++) {
			double credit = 0; // 학점
			double grade = 0; // 점수(등급, 평점)
			char alp;
			
			String arr[] = br.readLine().split(" ");
			credit = Double.parseDouble(arr[1]); // 몇 학점짜리 수업인지
			alp = arr[2].charAt(0); // 등급의 알파벳 부분
			
			switch(alp) {
				case 'A':
					if(arr[2].charAt(1) == '+')
						grade = 4.5;
					else
						grade = 4.0;
					break;
				
				case 'B':
					if(arr[2].charAt(1) == '+')
						grade = 3.5;
					else
						grade = 3.0;
					break;
				case 'C':
					if(arr[2].charAt(1) == '+')
						grade = 2.5;
					else
						grade = 2.0;
					break;
				case 'D':
					if(arr[2].charAt(1) == '+')
						grade = 1.5;
					else
						grade = 1.0;
					break;
				case 'F':
					grade = 0;
					break;
				case 'P':
					grade = 0;
					credit = 0; // P는 학점 계산에 포함되지 않으므로
					break;
			}
			
			sum += credit; // 지금까지 총 몇 학점 수강했는지
			result += credit * grade; // (학점*평점)들의 합
		}
		
		br.close();
		System.out.println(result/sum);
	}

}
