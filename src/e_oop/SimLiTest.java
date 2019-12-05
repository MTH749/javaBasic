package e_oop;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		new SimLiTest().question1();
	}

	Scanner s = new Scanner(System.in);

	void question1() {
		System.out.println("심리 테스트 입니다");
		System.out.println(" 'yes' 나 'no' 로 대답해 주세요");
		System.out.println("나는 금방 사랑에 빠진다");
		String input = s.nextLine();
		if (input.equals("yes")) {

			question2();

		} else if (input.equals("no")) {

			question4();
		}

	}

	void question2() {
		System.out.println(" 'yes' 나 'no' 로 대답해 주세요");
		System.out.println("연예할때 끌려다니는 타입이다");
		String input = s.nextLine();
		if (input.equals("yes")) {

			question5();

		} else if (input.equals("no")) {

			question3();
		}
	}

	void question3() {
		System.out.println(" 'yes' 나 'no' 로 대답해 주세요");
		System.out.println("데이터 코스는 미리 짜는게 편하다");
		String input = s.nextLine();
		if (input.equals("yes")) {

			question6();

		} else if (input.equals("no")) {

			question5();
		}
	}

	void question4() {
		System.out.println(" 'yes' 나 'no' 로 대답해 주세요");
		System.out.println("감정기복이 크지 않다");
		String input = s.nextLine();
		if (input.equals("yes")) {

			question5();

		} else if (input.equals("no")) {

			question7();
		}
	}

	void question5() {
		System.out.println(" 'yes' 나 'no' 로 대답해 주세요");
		System.out.println("감정표현에 솔직한 편이다");
		String input = s.nextLine();
		if (input.equals("yes")) {

			question8();

		} else if (input.equals("no")) {

			question6();
		}
	}

	void question6() {
		System.out.println(" 'yes' 나 'no' 로 대답해 주세요");
		System.out.println("활동적인 데이트가 좋다");
		String input = s.nextLine();
		if (input.equals("yes")) {

			question8();

		} else if (input.equals("no")) {

			question9();
		}
	}

	void question7() {
		System.out.println(" 'yes' 나 'no' 로 대답해 주세요");
		System.out.println("연락이 없어도 믿고 기다리는 편이다");
		String input = s.nextLine();
		if (input.equals("yes")) {

			System.out.println(" 결과는 A ");
			System.out.println("서로에 대한 신뢰감이 깊고, 존중해 주는 타입 어른스러운 연애를 하는 타입");

		} else if (input.equals("no")) {

			question8();
		}
	}

	void question8() {
		System.out.println(" 'yes' 나 'no' 로 대답해 주세요");
		System.out.println("이성친구는 존재할 수 없다");
		String input = s.nextLine();
		if (input.equals("yes")) {

			question9();

		} else if (input.equals("no")) {

			System.out.println(" 결과는 B ");
			System.out.println(" 구속을 하는것도 받는 것도 싫은 자유로운 연애를 하는 타입");
		}
	}

	void question9() {
		System.out.println(" 'yes' 나 'no' 로 대답해 주세요");
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
		String input = s.nextLine();
		if (input.equals("yes")) {

			System.out.println(" 결과는 D ");
			System.out.println(" 무조건 잘해주고 맞춰주는 다 퍼주는 연애를 하는 타입");

		} else if (input.equals("no")) {

			System.out.println(" 결과는 C ");
			System.out.println(" 이것은 의리인가 사랑인가 친구같이 편안한 연애를 하는 타입");
		}
	}

}
