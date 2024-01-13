import java.util.Scanner;

public class Test_1789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextLong();
		long sum = 0;
		int i;
		
		sc.close();
		
		for(i = 1; ; i++) {
			if(sum > num) // 주어진 값보다 합이 커질시 break
				break;
			sum += i;
		}
		
		System.out.println(i - 2);
	}

}
