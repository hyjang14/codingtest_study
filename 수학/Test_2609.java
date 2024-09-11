package 수학;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//문제설명: 두 수의 최소공배수와 최대공약수 구하기
//핵심개념: 수학 개념, 유클리드 호제법

public class Test_2609 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문자열 입력받기
		String input = br.readLine();
		
		String[] nums = input.split(" ");
		
		// 숫자 배열로 바꾸기
		int[] intNums = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			intNums[i] = Integer.parseInt(nums[i]);
		}
		
		System.out.println(gcd(intNums[0], intNums[1]));
		System.out.println(lcm(intNums[0], intNums[1]));
		
		
	}
	// 최대공약수: 유클리드 호제법
	// gcd = greatest common divisor
	public static int gcd(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp; // a에 이전 b값을 저장
		}
		return a; // b가 0일 때의 a가 최대공약수
	}
	
	// 최소공배수
	// lcm = least common multiple
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b); // 두 수의 곱을 두 수의 최대공약수로 나눈다.
	}

}
