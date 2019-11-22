import java.util.Scanner;

public class Subject {

		
	
	private static final Object A3 = null;

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		

		System.out.println("심리테스트 입니다. yes 나 no 로 대답해 주세요");
		System.out.println("나는 금사빠다 (금방 사랑에 빠진다)");
	
		System.out.println("<yes or no>");
		String A1 = s.nextLine();
		
		String a = "나는 금사빠다";
		String b = "연예할때 끌려다니는 타입이다";
		String c = "데이터 코스는 미리 짜는게 편하다";
		String d = "활동적인 데이트가 좋다";
		String e = "감정 표현에 솔직한 편이다";
		String f = "감정 기복이 크지 않다";
		String g = "연락이 없어도 믿고 기다리는 편이다";
		String h = "이성친구는 존재 할 수 없다";
		String i = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다";
		String j = "당신의 유형은 A 입니다";
		String k = "당신의 유형은 B 입니다";
		String l= "당신의 유형은 C 입니다";
		String m = "당신의 유형은 D 입니다";
		
		
		if (A1.equals ("yes")){
			System.out.println("연예할떄 끌려다니는 타입이다");					
			System.out.println("<yes or no>");
			String yes1 = s.nextLine();
			if (A1.equals ("yes"))
				System.out.println(e + A1);					
				System.out.println("<yes or no>");
				if (A1.equals ("yes"))
					System.out.println(h + A1);					
					System.out.println("<yes or no>");
					if (A1.equals ("yes"))
						System.out.println(i + A1);					
						System.out.println("<yes or no>");
						if (A1.equals ("yes"))
							System.out.println(f + A1);					
							System.out.println("<yes or no>");
			
		
		 }
		
		
	   }

}
