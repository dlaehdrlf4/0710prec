package format;

import java.util.Arrays;

public class Main4 {

	public static void main(String[] args) {
		//문자열 배열 생성
		String [] str = {"java", "android","pph", "ios","donggl"};
		// 안에있는 자료를 정렬한다.
		Arrays.sort(str);
		// 정렬된 데이터를 출력한다.
		for(String temp : str) {
			System.out.println(temp);
		}
		//pph 위치 검색
		int idx = Arrays.binarySearch(str, "pph");
		System.out.println(idx);
		//android 위치 검색
		idx = Arrays.binarySearch(str, "android");
		System.out.println(idx);
	}

}
