package e_oop;//현재 클래스의 위치를 알려준다

import java.util.*; // (import)다른 패키지에 있는 클래스의 위치를 알려준다. <util.*> 모든 기능 사용

public class SamplecCass {
	
	int field = 10; // 전역변수 : 클래스 전체 영역에서 공유하는 변수
	/*
	 * -- 메서드 : 코드를 분리해서 더 효율적인 프로그램을 만들기 위한 도구
	 * -- 리턴타입 메서드명 (파라미터) { }
	 * -- 리턴타입(반환타입) : 실행 후 돌려줘야 하는 결과물
	 * -- 파라미터 (매개변수) : 실행에 필요한 정보
	 * 
	 * 
	 */
	
	void method1(){ 
		System.out.println("파라미터도 리턴타입도 없는 메서드");
	}
	
	void method2(int parameter){ 
		System.out.println(parameter + "를 사용해 명령을 수행하는 메서드");
	}
	
	String method3(){
		return " 명령 수행후 결과물을 돌려주는 메서드";
		//return : 메서드를 종료시키고 결과물을 돌려준다.
		//리턴타입이 없는 메서드에서는 메서드를 종료시킨다.
	}
	
	int method4 (int a, int b){
		System.out.println(a/2);
		System.out.println(a*2);
		System.out.println(a + " ,"+ b +"를 사용해 명령을 수행하고 결과물을 돌려주는 메서드");
		return a + b;
		//메서드를 만들때에는 파라미터를 어떤 타입을 사용할 것인지 리턴 타입을 어떤것을 돌려줘야할 것인지 고려해야 한다.
	}
	
	void test1(){
		System.out.println("test1 시작"); //1
		test3(); 
		System.out.println("test1 종료");//
	}	
	void test2(){
		System.out.println("test2 시작");//3
		System.out.println("test2 종료");//4
	}
	void test3(){
		System.out.println("test3 시작");//2
		test2();
		System.out.println("test3 종료");//5
	}


	}
	
	
