package z_exam;

public class Exam07 {

	public static void main(String[] args) {
		/*Tv t = new Tv();
		Child c = new Child();
		System.out.println("x="+c.getX());*/
		
		/*MyTv2 t = new MyTv2();		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());*/
		
		
		
		/*MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());*/
		
		
	}

}
	/*[7-3] 오버라이딩의 정의와 필요성에 대해 설명하시오
		정의. 오버라이딩이란 부모 클래스부터 상속받은 메서드를 자식 클래스에 맞게 해주는 것
		필요성 . 상속받은 메서드를 그대로 쓸수가 없는 경우에 필요하다
	  [7-4]	
		정답 c, d 조상의 메서드보다 더 많은 예외를 선언 할 수 없다.

/*[7-5] 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기
위해서는 코드를 어떻게 바꾸어야 하는가?
[연습문제]/ch7/Exercise7_5.java*/
/*class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수

	Product() {
	}

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	Tv() {
	}

	public String toString() {
		return "Tv";
	}*/

/*[7-6]
 * 조상 클래스에 선언된 변수들은 초기화 하기 위해서
 */
//[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
/*class Parent {
	int x = 100;

	Parent() {
		this(200);
	}

	Parent(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000);
	}

	Child(int x) {
		this.x = x;
	}
}*/
//순서: Child() → Child(int x) → Parent() → Parent(int x) → Object()의 순서로 호출된다.
//실행 결과 x =200


// [7-8] 답 a
//[7-9] 답 c 오버로딩이 아니라 오버라이딩을 할 수 없다.

/*[7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
getter와 setter메서드를 추가하라.*/

/*class MyTv2 {
	boolean isPowerOn;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;
		
			this.volume = volume;		
	}
	public int getVolume(){
		return volume;
		}
	
	public void setChannel(int channel){
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
			
			this.channel = channel;
	}
	
	public int getChannel(){
			return channel;
	}
	
	*/
// [7-11]
 /*	class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int PrevChannel;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public void setVolume(int volume) {
		if (volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;

		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setChannel(int channel) {
		if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		PrevChannel = this.channel;
		this.channel = channel;
		
	}

	public int getChannel() {
		return channel;
	}
	public void gotoPrevChannel(){
		
		setChannel(PrevChannel);
	}*/


// [7-12] c, 접근 제어자가 사용될 수 있는 곳 - 클래스, 멤버변수, 메서드, 생성자
// [7-13] Math클래스의 모든 메서드가 static메서드이고 인스턴스변수가 존재하지 않기 때문에 객체를 생성할 필요가 없기 때문
// [7-15] e, t = (Tank)u; ← 조상타입의 인스턴스를 자손타입으로 형변환 할 수 없다.
// [7-16] e	
// [7-17]아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이클래스를 상속받도록 코드를 변경하시오.
/*abstract class Unit {
	int x, y;

	abstract void move(int x, int y); // 추상클래스

	void stop() {  현재 위치에 정지 
	}
}

class Marine { // 보병
	int x, y; // 현재 위치

	void move(int x, int y) {  지정된 위치로 이동 
	}

	void stop() {  현재 위치에 정지 
	}

	void stimPack() {  스팀팩을 사용한다. 
	}
}

class Tank { // 탱크
	int x, y; // 현재 위치

	void move(int x, int y) {  지정된 위치로 이동 
	}

	void stop() {  현재 위치에 정지 
	}

	void changeMode() {  공격모드를 변환한다. 
	}

	void unload() {  선택된 대상을 내린다. 
	}
}

class Dropship { // 수송선
	int x, y; // 현재 위치

	void move(int x, int y) {  지정된 위치로 이동 
	}

	void stop() {  현재 위치에 정지 
	}

	void load() {  선택된 대상을 태운다. 
	}
*/
// [7-20] 실행 결과
	/*p.x = 100
	Child Method
	c.x = 200
	Child Method	
	 */
// [7-24] e 


//안푸는 문제
/*
 * 7-1~2 
 * 7-14
 * 7-18 ~19
 * 7-21 ~23
 * 7-25~
*/