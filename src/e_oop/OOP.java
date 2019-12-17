package e_oop;

import java.util.Scanner;

public class OOP {

	public static void main(String[] args) {
		/*
		 * <<OOP(Object Oriented Programming) : 객체지향 프로그래밍>>
		 * --프로그램을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는것.
		 * -코드의 잿용성이 높고 유지보수가 용이하다.
		 * 
		 * <<객체생성(인스턴스화)>>
		 * -클래스를 사용하기 위해 메모리(heap영역)에 올려 놓은 것.
		 * -new 클래스명(); - > 객체가 저장된 메모리 주소 반환.
		 * -객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메소드에 접근할 수 있다.
		 * -객체는 생성될때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		 * 
		 */
		
		SamplecCass sc = new SamplecCass();
		
		sc.method1();
		
		sc.method2(3);
		
		String returnString = sc.method3();
		System.out.println(returnString);
		
		int returnInt = sc.method4(8, 15);
		System.out.println(returnInt);
		
		//test1() 호출시 출력되는 문장에 번호를 붙여주세요.
		sc.test1();
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해 주세요.
		
		ClassMaker cm = new ClassMaker();
		
		//객체가 저장된 변수를 통해 메서드들을 호출해주세요.
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고
		//리턴타입이 있는 메서드는 리턴받은 값을 출력해주세요.
		
		cm.method1();
		
		
		int method2 = cm.method2();
		System.out.println(method2);
		
		cm.method3(10);
		
		int method4 = cm.method4(4, 2);
		System.out.println(method4);
		
		cm.method5();
		int ff = 1;
		if(ff == 0){
			
			System.out.println();
		}
		//다음을 한줄씩  계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번결과값 * 123456
		//3. 2번 결과값 / 123456
		//4. 3번 결과값 - 654321
		//5. 4번 결과값 % 123456
		
		Calculator cl = new Calculator();
		
		
		double a = cl.plus(123456, 654321);
		 	   a = cl.multiply (a, 123456);
		 	   a = cl.division (a, 123456);
		 	   a = cl.minus    (a, 654321);
		 	   a = cl.remainder(a, 123456);
		System.out.println(a);
		
		
		
	}

}
