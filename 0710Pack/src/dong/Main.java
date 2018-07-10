package dong;

import java.awt.font.TextLayout.CaretPolicy;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 인스턴스 배열 만들기
		Car[] car = new Car[5];
		// 인스턴스 생성
		car[0] = new Car();
		// 값을 채웁니다.
		car[0].setName("마티즈");
		car[0].setBrand("기아");
		car[0].setContents("호우");
		car[0].setPrice(1500);

		car[1] = new Car();
		// 값을 채웁니다.
		car[1].setName("베르나");
		car[1].setBrand("현대");
		car[1].setContents("호우주의보");
		car[1].setPrice(2000);

		car[2] = new Car();
		// 값을 채웁니다.
		car[2].setName("쏘나타");
		car[2].setBrand("기아");
		car[2].setContents("파이어");
		car[2].setPrice(1300);

		car[3] = new Car();
		// 값을 채웁니다.
		car[3].setName("스포티지");
		car[3].setBrand("르노삼성");
		car[3].setContents("멋져부러");
		car[3].setPrice(3000);

		car[4] = new Car();
		// 값을 채웁니다.
		car[4].setName("포르쉐");
		car[4].setBrand("쉐보레");
		car[4].setContents("키키키키");
		car[4].setPrice(2500);
		// 배열의 데이터를 정렬
		// 기본적으로 정렬을 하려면 각 데이터의 크기를 비교할 수 있어야 합니다.
		// java애서 크기 비교를 하는 메소드는
		// Comparable 인터페이스의 compare 메소드입니다.
		// 직접 만든 클래스의 경우는 클래스에 Comparable 인터페이스를
		// implements 하던가 Comparator 인터페이스를 implements 한
		// 인스턴스를 같이 대입해야 합니다.
		//Comaprator 인터페이스를 implements 한 인스턴스 만들기
		
		/*Comparator <Car> comp = new Comparator() {

			@Override // Object와 Car은 같음
			public int compare(Object o1, Object o2) {
				// 오브젝트가 왔으므로 원래의 자료형이 멀까 생각하고 형변환 한다. 데이터 형 변환
			Car first = (Car)o1;
			Car second = (Car)o2;
			return first.getPrice() - second.getPrice();
			}
		};
		Arrays.sort(car,comp);
*/	
		
	/*	Comparator <Car> comparator = new Comparator() { //<Car> 이것은 누구 크기 비교할꺼냐 해서 지금은 Car 크기를 비교하니까 쓴거임

			@Override
			public int compare(Object o1, Object o2) {
				//형변환 한것이다.
				Car first = (Car)o1;
				Car second = (Car)o2;
				
				//Name가지고 비교를 하는 것이다.
				return first.getName().compareTo(second.getName());
			} 
			
			
		};
		Arrays.sort(car,comparator);
*/
		Scanner sc = new Scanner(System.in);
		while(true) {
			//비교할 Comparator 변수 선언
			Comparator <Car> comparator = null;
			System.out.print("0:종료 1:이름오름차순 2.이름내림차순");
			int menu = sc.nextInt();
			if(menu == 0) {
				break;
			}
			else if(menu == 1) {
				comparator = new Comparator() {

					@Override
					public int compare(Object o1, Object o2) {
						Car first = (Car)o1;
						Car second = (Car)o2;
						return first.getName().compareTo(second.getName());
						//return second.getName().compareTo(first.getName());
					}
					
				};
				Arrays.sort(car,comparator); // 정수면 -
			}
			else if(menu == 2) {
				
			}
			// 배열의 데이터 전부 출력
			for (Car temp : car) {
				System.out.println(temp);
			}
			System.out.println("---------------------");
		}
		sc.close();

	}

}
