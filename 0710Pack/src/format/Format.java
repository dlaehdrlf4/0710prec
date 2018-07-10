package format;

import java.util.ArrayList;
import java.util.HashMap;

enum GENDER{
	MAN,WOMAN;
}
public class Format {

	public static void main(String[] args) {
		int x = 200;
		int y = 100;
		//x:200 y:100형식의 문자열 만들기
		String str = String.format("x:%d y:%d", x, y);
		System.out.println(str);
				
		String msg = "l like Java";
		//위의 문자열에서 java 포함여부 확인 - 대소문자 구분없이
		int idx = msg.toLowerCase().indexOf("java");
		if(idx >=0) {
			System.out.println("java가 존재합니다.");
		} else {
			System.out.println("java가 존재하지 않습니다.");
		}
		
		//msg의 문자열을 공백을 기준으로 분할해서 하나씩 출력하기
		String [] ar = msg.split(" ");
		for(int i=0;i < ar.length;i=i+1) {
			System.out.println(ar[i]);
		}
		//msg의 3번째 부터 7번째까지 출력하기
		String d = msg.substring(3, 8); // sublstring은 하나를 더해주어야 한다.
		System.out.println(d);
		
		ArrayList <Integer> a1 = new ArrayList<>();
		HashMap <String, String> hm = new HashMap<>();
		//0이면 남자 1이면 여자
		int gender = 1;
		if(gender == 0) {
			
		}
		else {
			
		}
		final int MAN = 0;
		final int WOMAN = 1;
		if(gender == MAN) {
			
		}
		else {
			
		}
		
		
		
		
	}

}
