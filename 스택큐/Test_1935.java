package 스택큐;

import java.util.*;
import java.io.*;

public class Test_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N 입력받기
        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];

        // 후위표기식 입력받기
        String str = br.readLine();

        // 숫자 N개 입력받기
        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        // 스택 선언
        Stack<Double> s = new Stack<>();

        double result = 0;

        // str 분리하기
        for(int i = 0; i < str.length(); i++) {
            if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                s.push(arr[str.charAt(i) - 'A']);
            }
            else {
                if (!s.isEmpty()) {
                    double num1 = s.pop();
                    double num2 = s.pop();

                    if (str.charAt(i) == '+') {
                        result = num2 + num1;
                        s.push(result);
                    } else if (str.charAt(i) == '-') {
                        result = num2 - num1;
                        s.push(result);
                    } else if (str.charAt(i) == '/') {
                        result = num2 / num1;
                        s.push(result);
                    } else if (str.charAt(i) == '*') {
                        result = num2 * num1;
                        s.push(result);
                    }
                }
            }
        }
        System.out.printf("%.2f", s.pop());

        br.close();
    }
}
