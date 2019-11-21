package a_variable;
//변수는 하나의 데이터를 ram에 저장하는 공간
public class Variable {
	
	public static void main(String[] args) {
		 /*<< 사용 가능한 기본형 데이터의 종류 >>
		  * -정수 : byte, short, int, long 
		  * -실수 : float, double 소수점을 정확하게 하기 위해 쓰임 double이 더 정확함
		  * -문자 : char 
		  * -논리 : boolean 참과 거짓을 말함 참과 거짓 표현
		  * 
		  * -byte는 8개의 bit로 이루어져 있다. bit는 0과 1을 나타낸다
		  * -데이터를 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지,
		  *  그것의 이름이 무엇인지 알려줘야 한다.
		  * -명명규칙은 자바의 정석 25~26 참조		 
		  */
		
		//변수 선언 방법 : 데이터 타입 + 변수 이름
		byte abc;
		char moonja;
		
		
		//모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요.
		byte a;
		boolean b;
		char c ;
		short d;
		float e;
		int f;
		double g;
		long h;
		
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한
		//System.out.println(a);
		//변수의 값을 저장하지 않으면 변수의값을 참조할 수 없다.
		
		// =(대입연산자) : 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.
		a = 127;//타입에 맞는 값을 저장해야 한다. byte의 표현 범위는 127+-
		d = 30000;//short의 범위는 약 3만
		f = 20;//int의 범위는 약 20억
		h = 900L;//long 접미사 : L 반드시 대문자
		e = 3.14f;//float의 접미사 : f 대소문자 상관 x
		g = 3.14;//double의 접미사 : d 생략 가능
		c = '가';// char의 문자타입은 "" x ''o 문자열이 아닌 하나의 문자만 가능
		b = true; //boolean의 타입은 true, false만 가능
		//초기화 : 변수에 처음으로 값을 저장하는 것.
		System.out.println(f);
		//crtl + F11 : 프로그램 실행
		//F11 : 디버그 모드 실행
		
		f = 30;
		System.out.println(f);
		f = 30 + 40;
		System.out.println(f);
		f = d;
		System.out.println(f);
		f = d;
		
		//위에서 초기화한 변수에새로운 값을 저장하고 출력해주세요.
		a = 100;
		b = false;
		c = '나';
		d = 20000;
		e = 3.22f;
		g = 2.77;
		h = 800L;
		f = 30422;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스
		//문자열 : ""(큰따움표)로 감싸진 글자 
		String _str = new String("abcd") ;
		System.out.println(_str);
		_str = "1234";
		System.out.println(_str);
		
		/*
		 *<<리터럴의 종류>> 
		 * 숫자 : 0,10, -5, 3.14
		 * 문자 : '가'. 'a', '0'
		 * 문자 : "가나다", "abc", "123", "", " " 공백 유무 상관없이  문자열
		 * 그외 : true, false, null(값이 없다)
		 * 
		 * <<참조형 타입>>
		 * -기본형 타입을 제외한 모든 데이터 타입(배열,클래스)
		 * -ex) String, ABC, Variable
		 * -값이 변수에 직접 저장되지 않고 따로 저장 되며, 그 주소가 변수에 저장된다.
		 * -변수의 크기는 4byte 다.
		 */
		
		//기본값 : 전역변수에 아무것도 저장하지 않았을때 저장되어 있는 값, 기본값  = 0
		//전역변수 : 메소드 밖에 선언 된 변수 따로 초기화를 하지 않아도 기본값으로 초기화됨 cf)안에 있는 변수는 지역변수
		/*_byte 0;
		_boolean null;
		_char = '/u0000';// 유니코드 0 = ' '
		_short 0;
		_float 0.0f;
		_int 0;
		_double 0.0;
		_long 0L;
		*/
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
		a = 127;
		f = 128;
		a = (byte) f; // 형변환 : 데이터를 변환하는 것 
		
		System.out.println(a); //128 -> -128 (오버플로우)
		
		a = -128;
		f = -129;
		a = (byte) f;
		System.out.println(a); //-129 -> 127 (언더플로우)
		//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될 수 있다.
		
		f = 40;
		g = 3.44;
		f = (int) g;
		System.out.println(f); //int는 소수점을 표현할 수 없으므로 소수점이 손실된다.
		
		g = 4.55;
		f = 20;
		g = (double)f;
		System.out.println(g);//표현범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가없다.
		//그러므로 형변환을 생락할 수 있다.
		
		/*
		 * <<상수>>
		 * -값을한번 저장하면 변경할 수 없는 저장공간
		 * -final in Max_NUMBER;
		 * -리터럴에 의미를 부여하기 위해 사용한다.  
		 */
		final int MAX_NUMBER =10;// 상수의 이름을 정할때에는 전부다 대문자로 만들어 준다
		//MAX_NUMBER = 100;  컴파일 에러 발생
		
		char aff = '1';
			System.out.println(aff+0);	
		char afd = '2';
			System.out.println(afd+0);	
		
		
		
		
		
		
		
		
		
	}

}