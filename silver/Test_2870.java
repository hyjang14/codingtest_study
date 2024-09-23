package silver;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

// 문제 설명: 수학(문자열, 숫자)

public class Test_2870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N 입력받기
        int N = Integer.parseInt(br.readLine());

        // 숫자 배열
        ArrayList<BigInteger> nums = new ArrayList<>();

        // 숫자 판별하기
        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < str.length(); j++) {
                if(Character.isDigit(str.charAt(j))) {
                    sb.append(str.charAt(j));
                }
                else { // 중간에 알파벳을 만났을 경우
                    if(sb.length() > 0) {
                        // 숫자는 숫자로 변형하고 ArrayList에 넣는다
                        nums.add(new BigInteger(sb.toString()));
                        // sb 초기화
                        sb = new StringBuilder();
                    }
                }
            }

            // 만약 마지막이 숫자로 끝날경우 -> sb에 숫자가 남아있을 것
            if(sb.length() > 0) {
                nums.add(new BigInteger(sb.toString()));
            }
        }

        // 숫자 크기대로 정렬
        Collections.sort(nums);

//        System.out.println(nums);
        for(BigInteger i : nums) {
            System.out.println(i);
        }
    }
}
