import java.util.Scanner;

public class Subject {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("<심리테스트 입니다.>");
		
		System.out.println(" ");
		System.out.println("나는 금사빠다   <금방 사랑에 빠진다  >");
		System.out.println("<yes 나 no 로 대답해 주세요!>");
		String a = s.nextLine();

		if (a.equalsIgnoreCase("yes")) {
			System.out.println("<yes 나 no 로 대답해 주세요!>");
			System.out.println("연예할때 끌려다니는 타입이다");
			a = s.nextLine();

		} else if (a.equalsIgnoreCase("no")) {
			System.out.println("<yes 나 no 로 대답해 주세요!>");
			System.out.println("감정 기복이 크지 않다");
			a = s.nextLine();

			if (a.equalsIgnoreCase("yes")) {
				System.out.println("<yes 나 no 로 대답해 주세요!>");
				System.out.println("연락이 없어도 믿고 기다리는 편이다");
				a = s.nextLine();

				if (a.equalsIgnoreCase("yes")) {
					System.out.println("당신의 유형은  ' A ' 입니다 ");
					System.out.println("테스트를 종료합니다");
					a = s.nextLine();

				} else if (a.equalsIgnoreCase("no"))
					System.out.println("<yes 나 no 로 대답해 주세요!>");
				System.out.println("이성 친구는 존재 할 수 없다");
				a = s.nextLine();

				if (a.equalsIgnoreCase("yes")) {
					System.out.println("<yes 나 no 로 대답해 주세요!> ");
					System.out.println("아무 것도 아닌 일에 쉽게 섭섭함이 쌓인다");
					a = s.nextLine();

					if (a.equalsIgnoreCase("yes")) {
						System.out.println("당신의 유형은 ' D ' 입니다 ");
						System.out.println("테스트를 종료합니다");
						a = s.nextLine();

					} else if (a.equalsIgnoreCase("no"))
						System.out.println("당신의 유형은 ' C ' 입니다");
					System.out.println("테스트를 종료 합니다");
					a = s.nextLine();

				} else if (a.equalsIgnoreCase("no"))
					System.out.println("당신의 유형은 ' B ' 입니다");
				System.out.println("테스트를 종료 합니다");
				a = s.nextLine();

			} else if (a.equalsIgnoreCase("no"))
				System.out.println("<yes 나 no 로 대답해 주세요!>");
			System.out.println("감정에 솔직한 편이다");
			a = s.nextLine();

			if (a.equalsIgnoreCase("yes")) {
				System.out.println("<yes 나 no 로 대답해 주세요!");
				System.out.println("이성친구는 존재할 수 없다");
				a = s.nextLine();

				if (a.equalsIgnoreCase("yes")) {
					System.out.println("<yes 나 no 로 대답해 주세요!");
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
					a = s.nextLine();

					if (a.equalsIgnoreCase("yes")) {
						System.out.println("당신의 유형은 ' D ' 입니다");
						System.out.println("테스트를 종료합니다");
						a = s.nextLine();

					} else if (a.equalsIgnoreCase("no"))
						System.out.println("당신의 유형은 ' C ' 입니다>");
					System.out.println("테스트를 종료합니다");

				} else if (a.equalsIgnoreCase("no"))
					System.out.println("당신의 유형은 ' B ' 입니다>");
				System.out.println("테스트를 종료합니다");
				a = s.nextLine();

			} else if (a.equalsIgnoreCase("no"))
				System.out.println("<yes 나 no 로 대답해 주세요!>");
			System.out.println("활동적인 데이트가 좋다");
			a = s.nextLine();

			if (a.equalsIgnoreCase("yes")) {
				System.out.println("<yes 나 no 로 대답해 주세요!");
				System.out.println("이성 친구는 존재 할 수 없다");
				a = s.nextLine();

				if (a.equalsIgnoreCase("yes")) {
					System.out.println("<yes 나 no 로 대답해 주세요!");
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
					a = s.nextLine();

					if (a.equalsIgnoreCase("yes")) {
						System.out.println("당신의 유형은 ' D ' 입니다");
						System.out.println("테스트를 종료합니다");
						a = s.nextLine();

					} else if (a.equalsIgnoreCase("no"))
						System.out.println("당신의 유형은 ' C ' 입니다>");
					System.out.println("테스트를 종료합니다");
					a = s.nextLine();

				} else if (a.equalsIgnoreCase("no"))
					System.out.println("당신의 유형은 ' B ' 입니다>");
				System.out.println("테스트를 종료합니다");
				a = s.nextLine();

			} else if (a.equalsIgnoreCase("no"))
				System.out.println("<yes 나  no 로 대답해 주세요!");
			System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");

			if (a.equalsIgnoreCase("yes")) {
				System.out.println("당신의 유형은 ' D ' 입니다");
				System.out.println("테스트를 종료합니다");
				a = s.nextLine();

			} else if (a.equalsIgnoreCase("no"))
				System.out.println("당신의 유형은 ' C ' 입니다>");
			System.out.println("테스트를 종료합니다");
			a = s.nextLine();

		
		}if (a.equalsIgnoreCase("yes")) {
			System.out.println("<yes 나 no 로 대답해 주세요!>");
			System.out.println("감정 표현에 솔직한 편이다");
			a = s.nextLine();

			if (a.equalsIgnoreCase("yes")) {
				System.out.println("<yes 나 no 로 대답해 주세요!>");
				System.out.println("이성친구는 존재할 수 없다");
				a = s.nextLine();

				if (a.equalsIgnoreCase("yes")) {
					System.out.println("<yes 나 no 로 대답해 주세요!>");
					System.out.println("아무일도 아닌 일에 쉽게 섭섭함이 쌓인다");
					a = s.nextLine();

					if (a.equalsIgnoreCase("yes")) {
						System.out.println("당신의 유형은 ' D ' 입니다");
						System.out.println("테스트를 종료 합니다");
						a = s.nextLine();

					} else if (a.equalsIgnoreCase("no"))
						System.out.println("당신의 유형은 ' C ' 입니다");
					System.out.println("테스트를 종료합니다");
					a = s.nextLine();

				} else if (a.equalsIgnoreCase("no"))
					System.out.println("당신의 유형은 ' B' 입니다");
				System.out.println("테스트를 종료합니다");
				a = s.nextLine();

			} else if (a.equalsIgnoreCase("no"))
				System.out.println("<yes 나 no 로 대답해 주세요!");
			System.out.println("활동적인 데이트가 좋다");
			a = s.nextLine();

			if (a.equalsIgnoreCase("yes")) {
				System.out.println("<yes 나 no 로 대답해 주세요!>");
				System.out.println("이성친구는 존재할 수 없다");
				a = s.nextLine();

				if (a.equalsIgnoreCase("yes")) {
					System.out.println("<yes 나 no 로 대답해 주세요!>");
					System.out.println("아무것도 아닌 일에 섭섭함이 쌓인다");
					a = s.nextLine();

					if (a.equalsIgnoreCase("yes")) {
						System.out.println("당신의 유형은 ' D ' 입니다");
						System.out.println("테스트를 종료합니다");
						a = s.nextLine();

					} else if (a.equalsIgnoreCase("no"))
						System.out.println("당신의 유형은 ' C ' 입니다");
					System.out.println("테스트를 종료합니다");
					a = s.nextLine();

				} else if (a.equalsIgnoreCase("no"))
					System.out.println("당신의 유형은 ' B ' 입니다");
				System.out.println("테스트를 종료합니다");
				a = s.nextLine();

			} else if (a.equalsIgnoreCase("no"))
				System.out.println("<yes 나 no 로 대답해 주세요!");
			System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
			a = s.nextLine();

			if (a.equalsIgnoreCase("yes")) {
				System.out.println("당신의 유형은 ' D ' 입니다");
				System.out.println("테스트를 종료합니다");
				a = s.nextLine();

			} else if (a.equalsIgnoreCase("no"))
				System.out.println("당신의 유형은 ' C ' 입니다");
			System.out.println("테스트를 종료합니다");
			a = s.nextLine();

		} else if (a.equalsIgnoreCase("no")) {
			System.out.println("<yes 나 no 로 대답해 주세요!>");
			System.out.println("데이트 코스는 미리 짜는게 편하다");
			a = s.nextLine();
			
			if (a.equalsIgnoreCase("yes")) {
				System.out.println("<yes 나 no 로 대답해 주세요!>");
				System.out.println("감정 표현에 솔직한 편이다");
				a = s.nextLine();

			} else if (a.equalsIgnoreCase("no"))
				System.out.println("<yes 나 no 로 대답해 주세요!>");
			System.out.println("이성친구는 존재 할 수 없다");
			a = s.nextLine();


			if (a.equalsIgnoreCase("yes")) {
				System.out.println("yes 나 no 로 대답해 주세요");
				System.out.println("활동적인 데이트가 좋다");
				a = s.nextLine();

				if (a.equalsIgnoreCase("yes")) {
					System.out.println("yes 나 no 로 대답해 주세요");
					System.out.println("이성 친구는 존재 할 수 없다");
					a = s.nextLine();

					if (a.equalsIgnoreCase("yes")) {
						System.out.println("yes 나 no 로 대답해 주세요");
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
						a = s.nextLine();
						
						if (a.equalsIgnoreCase("yes")) {
							System.out.println("당신의 유형은 ' D ' 입니다");
							System.out.println("테스트를 종료합니다");
							a = s.nextLine();

						} else if (a.equalsIgnoreCase("no"))
							System.out.println("당신의 유형은 ' C ' 입니다");
						System.out.println("테스트를 종료합니다");		
						

					} else if (a.equalsIgnoreCase("no"))
						System.out.println("당신의 유형은 ' B ' 입니다");
					System.out.println("테스트를 종료합니다");
					a = s.nextLine();


				} else if (a.equalsIgnoreCase("no"))
					System.out.println("당신의 유형은 ' C ' 입니다");
				System.out.println("테스트를 종료합니다");

			} else if (a.equalsIgnoreCase("no"))
				System.out.println("yes 나 no 로 대답해 주세요");
			System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
			a = s.nextLine();

			if (a.equalsIgnoreCase("yes")) {
				System.out.println("당신의 유형은 ' D ' 입니다");
				System.out.println("테스트를 종료합니다");
				a = s.nextLine();

			} else if (a.equalsIgnoreCase("no"))
				System.out.println("당신의 유형은 ' C ' 입니다");
			System.out.println("테스트를 종료합니다");
			a = s.nextLine();

		} else if (a.equalsIgnoreCase("no"))
			System.out.println("yes 나 no 로 대답해 주세요");
		System.out.println("감정표현에 솔직한 편이다");
		a = s.nextLine();

		if (a.equalsIgnoreCase("yes")) {
			System.out.println("yes 나 no 로 대답해 주세요");
			System.out.println("이성 친구는 존재 할 수 없다");
			a = s.nextLine();

			if (a.equalsIgnoreCase("yes")) {
				System.out.println("당신의 유형은  ' B ' 입니다");
				System.out.println("테스트를 종료합니다");
				a = s.nextLine();

			} else if (a.equalsIgnoreCase("no"))
				System.out.println("yes 나 no 로 대답해 주세요");
			System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
			a = s.nextLine();

			if (a.equalsIgnoreCase("yes")) {
				System.out.println("당신의 유형은 ' D ' 입니다");
				System.out.println("테스트를 종료합니다");
				a = s.nextLine();

			} else if (a.equalsIgnoreCase("no"))
				System.out.println("당신의 유형은 ' C ' 입니다");
			System.out.println("테스트를 종료합니다");

		} else if (a.equalsIgnoreCase("no"))
			System.out.println("yes 나 no 로 대답해 주세요");
		System.out.println("활동적인 데이트가 좋다");
		a = s.nextLine();

		if (a.equalsIgnoreCase("yes")) {
			System.out.println("yes 나 no 로 대답해 주세요");
			System.out.println("이성 친구는 존재할 수 없다");
			a = s.nextLine();

			if (a.equalsIgnoreCase("yes")) {
				System.out.println("yes 나 no 로 대답해 주세요");
				System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
				a = s.nextLine();

				if (a.equalsIgnoreCase("yes")) {
					System.out.println("당신의 유형은 ' D ' 입니다");
					System.out.println("테스트를 종료합니다");
					a = s.nextLine();

				} else if (a.equalsIgnoreCase("no"))
					System.out.println("당신의 유형은 ' C ' 입니다");
				System.out.println("테스트를 종료합니다");

			} else if (a.equalsIgnoreCase("no"))
				System.out.println("당신의 유형은 ' B ' 입니다");
			System.out.println("테스트를 종료합니다");
			a = s.nextLine();

		} else if (a.equalsIgnoreCase("no"))
			System.out.println("yes 나 no 로 대답해 주세요");
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
		a = s.nextLine();

		if (a.equalsIgnoreCase("yes")) {
			System.out.println("당신의 유형은 ' D ' 입니다");
			System.out.println("테스트를 종료합니다");
			a = s.nextLine();

		} else if (a.equalsIgnoreCase("no"))
			System.out.println("당신의 유형은 ' C ' 입니다");
		System.out.println("테스트를 종료합니다");

	}
}	

