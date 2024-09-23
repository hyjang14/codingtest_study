package silver;

import java.util.*;
import java.io.*;
import java.math.*;

// 문제 요약: 에라토스테네스의 체(살짝 변형)

public class Test_2960 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];

        // 배열 초기화
        for(int i = 2; i <= N; i++) {
            arr[i] = i;
        }
        for(int i = 2; i <= N; i++) {
            // 이미 지운 수는 건너뛰기
            if(arr[i] == 0)
                continue;

            // 원래 기본 에라토스테네스의 체 - 이건 2, 3과 같은 작은 소수들 보존
            // 이미 지워진 숫자가 아니라면, 그 배수부터 출발하여, 가능한 모든 숫자 지우기
            /*
            for(int j=2*i;j<=N; j+=i) {
                arr[j] = 0;
            }
            */

            // 배수들 지우기(0으로 만들기) -> 2, 3과 같은 소수들까지 지움
            /* 아래 조건 때문!!
            아직 지우지 않은 수 중 가장 작은 수를 찾는다. 이것을 P라고 하고, 이 수는 소수이다. */
            for(int j = i; j <= N; j += i) {
                if(arr[j] != 0) {
                    arr[j] = 0;
                    K--;

                    // K번째로 지우는 값 출력하기
                    if(K == 0) {
                        System.out.print(j);
                    }
                }

            }
        }
    }
}
