package z_exam;

import java.util.Scanner;

public class subject4 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);

		System.out.println("<심리테스트 입니다. yes 나 no 로 대답해 주세요!>");
		System.out.println("나는 금사빠다 (금방 사랑에 빠진다)");
		System.out.println(" ");
		System.out.println("<yes or no>");
		String a = s.nextLine();
		
		
		
	
	if (a.equalsIgnoreCase("yes")) {
		System.out.println("<yes 나 no 로 대답해 주세요!>");
		System.out.println("연애할때 끌려다니는 타입이다");
		a = s.nextLine();
		
	}if (a.equalsIgnoreCase("yes")) {
		System.out.println("<yes 나 no 로 대답해 주세요!>");
		System.out.println("연애할때 끌려다니는 타입이다");
		a = s.nextLine();
		
	} else if (a.equalsIgnoreCase("no")) {
		System.out.println("<yes 나 no 로 대답해 주세요!>");
		System.out.println("감정 기복이 심한 편이다");
		a = s.nextLine();
		

		

	} else if (a.equalsIgnoreCase("no")) {
		System.out.println("<yes 나 no 로 대답해 주세요!>");
		System.out.println("감정 기복이 심한 편이다");
		a = s.nextLine();
		
		
		}

	}

}
