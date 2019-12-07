package e_oop;

import java.util.Scanner;

public class Fishing {
	Scanner s = new Scanner(System.in);
	String[] fish = new String [] {"참치", "고등어", "고래", "상어", "삼치", "갈치", "멸치", "가오리", "가자미", "방어", "명태", "우럭", "광어","돔","아귀"};
	
	int[] lure = new int [15];
	int a;
	String b;
	
	void a(){
		System.out.println(" 낚시 게임 ");
		System.out.println(" 참치를 잡으면 승리, 상어를 잡으면 게임 오버 입니다 ");
		System.out.println("00000000000000000000000000");
		System.out.println("                ");
		System.out.println("                ");
		System.out.println("VVVVVVVVVVVVVVVVVVV VVVVVVVVVVVV");
		System.out.println("VVVVVVVVVVVVVVVV       VVVVVVVVVVVVV");
		System.out.println("VVVVVVVVVVVVVVVVVV  VVVVVV");
		System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVV    VVVVVVVV");
		
		for (int i = 0; i < 50; i++) {

			a = (int) (Math.random() * 15);

		}
		b();
	}

	void b() {
		System.out.println("게임의 방법은 던지기를 입력하시면 됩니다");
		c();

	}

	void c() {
		if (a == 0) {
			b = fish[0];
			d();

		}
		if (a == 1) {
			b = fish[1];
			d();

		}
		if (a == 2) {
			b = fish[2];
			d();

		}
		if (a == 3) {
			b = fish[3];
			d();

		}
		if (a == 4) {
			b = fish[4];
			d();

		}
		if (a == 5) {
			b = fish[5];
			d();

		}
		if (a == 6) {
			b = fish[6];
			d();

		}
		if (a == 7) {
			b = fish[7];
			d();

		}
		if (a == 8) {
			b = fish[8];
			d();

		}
		if (a == 9) {
			b = fish[9];
			d();

		}
		if (a == 10) {
			b = fish[10];
			d();

		}
		if (a == 11) {
			b = fish[11];
			d();

		}
		if (a == 12) {
			b = fish[12];
			d();

		}
		if (a == 13) {
			b = fish[13];
			d();

		}
		if (a == 14) {
			b = fish[14];
			d();

		}
		if (a == 15) {
			b = fish[15];
			d();

		}

	}

	void d() {
		System.out.println(b);
		String casting = s.nextLine();
		a();

	}

	public static void main(String[] args) {
		Fishing F = new Fishing();

		F.a();
		F.b();

	}

}
