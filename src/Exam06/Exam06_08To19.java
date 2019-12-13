package Exam06;

public class Exam06_08To19 {
	//6-8
	/*class PlayingCard { 
		int kind; kind 인스턴스 변수
		int num;  num 인스턴스 변수
		static int width; width 클래스 변수
		static int height; height 클래수 변수
		PlayingCard(int k, int n) { k , n = 지역변수
		kind = k;
		num = n;
		}
		public static void main(String args[]) {
		PlayingCard card = new PlayingCard(1,1); card 지역 변수
		}
		}*/
	
	
	//6-9	
	/*class Marine {
		int x=0, y=0; // Marine의 위치좌표(x,y)
		int hp = 60; // 현재 체력
		int weapon = 6; // 공격력 static weapon
		int armor = 0; // 방어력 static armor
		static void weaponUp() { static weaponUp
		weapon++;
		}
		static void armorUp() {static armorUp
		armor++;
		}
		void move(int x, int y) {
		this.x = x; // this.x는 인스턴스 변수, x는 지역변수
		this.y = y; // this.y는 인스턴스 변수, y는 지역변수
		}
		}*/
	
	//6- 10
	/*	b,e
		객체 생성은 new , 생성자도 오버로딩 가능*/
	// 6-11
	//	b  this는 인스턴스 변수 내에서만 사용 가능
	//6-12
	// c,d 리턴타입은 오버로딩에 영향을 주지 않는다, 매개변수의 이름이 같은지 다른지 여부는 오버로딩에 영향을 주지 않는다.
	//6-13
	// b,c,d
	//6-14
	//c,e 생성자보다 초기화 블럭이 먼저 수행된다 , 인스턴스 변수보다 클래스 변수가 먼저 초기화 된다
	//6-15
	// a
	//6-16
	//a,e 지역변수는 자동으로 초기화 되지 않는다. 지역변수 생성은 콜스택에서 생성된다
	//6-17
	//b
	//6-18
	/*	class MemberCall { //A ,B ,D
	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
	static int cv2 = iv; // 라인 A static 변수 초기화에 인스턴스 변수를 사용할 수 없다
	static void staticMethod1() {
	System.out.println(cv);
	System.out.println(iv); // 라인 B static 메서드 안에서는 인스턴스 변수를 사용할 수 없다
	}
	void instanceMethod1() {
	System.out.println(cv);
	System.out.println(iv); //라인 C
	}
	
	static void staticMethod2() {
	staticMethod1();
	instanceMethod1(); // 라인 D static 메서드 안에서는 인스턴스 메서드를 사용할 수 없다
	}
	void instanceMethod2() {
	staticMethod1(); // 라인 E
	instanceMethod1();
	}
	}

}*/
	//6-19
	
	/*	public static void change(String str) {
	str += "456";
	}
	public static void main(String[] args)
	{
	String str = "ABC123";
	System.out.println(str);
	change(str);
	System.out.println("After change:"+str);
	} //실행결과 ABC123 . After change : ABC123
	}

*/
	
	
	
	
	public static void main(String[] args) {
		
	}

}
