package 문자열;

import java.io.*;
import java.util.*;

//문제설명: 문자열 뒤집기
//핵심개념: StringBuilder, stack, pop, push

public class Test_17413 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		String str = br.readLine();
		int len = str.length();
		
		// 태그 유무 검사
		boolean tag = false;
		
		for (int i = 0; i < len; i++) {
			
			// 태그 시작표시를 만났을 때
			if(str.charAt(i) == '<') {
				tag = true;
				
				// 태그 시작표시가 나오면, 스택에 넣어놨던 문자들을 꺼낸다.
				while( !stack.isEmpty() ) {
					sb.append(stack.pop());
				}
				
				// < 추가하기
				sb.append(str.charAt(i));
			}
			// 태그 끝 표시를 만났을 때
			else if(str.charAt(i) == '>') {
				// 태그 벗어남을 표시
				tag = false; 
				// > 추가하기
				sb.append(str.charAt(i));
			}
			// 태그 내부 문자열
			else if(tag == true) {
				// 그대로 넣기
				sb.append(str.charAt(i));
			}
			// 태그 외부 문자열
			else if(tag == false) {
				// 단어가 끝났을 경우
				if(str.charAt(i) == ' ') {
					while( !stack.isEmpty() ) {
						sb.append(stack.pop());
					}
					// 공백 문자 추가
					sb.append(str.charAt(i));
				}
				// 단어가 아직 안 끝났을 경우
				else {
					// 공백 만날 때까지 스택에 문자 넣기
					stack.push(str.charAt(i));
				}
			}
 		}
		
		// 남아있는 마지막 문자까지 다 넣기
		// (마지막 단어는 공백이나 태그 만나지 않고 끝나므로 반복문 나옴)
		while( !stack.isEmpty() ) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb);

	}

}
