package e_oop;

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
		
		sc.method2(5);
		
		String returnString = sc.method3();
		System.out.println(returnString);
		
		int returnInt = sc.method4(8, 15);
		System.out.println(returnInt);
		
		//test1() 호출시 출력되는 문장에 번호를 붙여주세요.
		sc.test1();
		
		Fun sc1 = new Fun();
		
		sc1.method(returnInt);
		System.out.print(" ");
		
	}

}
