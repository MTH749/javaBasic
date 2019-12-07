package e_oop.e_oop;



import java.util.Scanner;

public class Fish {
	Scanner s = new Scanner(System.in);
	String[] fish = new String [] {"참치", "고등어", "고래", "상어", "삼치", "갈치", "멸치", "가오리", "가자미", "방어", "명태", "우럭", "광어","꽁치","아귀"};
	
	int[] lure = new int [15];
	int a;
	String b;
	int hp = 1;
	
	void a(){
		System.out.println(" 배가 난파된후 간신히 섬에 도착했다");
		System.out.println("  이곳을 탈출 하자  ");
		System.out.println("     O  ");
		System.out.println("   - ㅁ -  ----------|           ");
		System.out.println("    | |             | ");
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
		System.out.println();
		System.out.println("  ㅅ ");
		System.out.println(" ㅅㅅㅅㅅ");
		System.out.println("ㅅㅅㅅㅅㅅㅅ ");
		System.out.println(" ||");		
		System.out.println("옆에 나무가 보인다 힘을 기르면 나무로 배를 만들 수 있을거 같다 ");
		System.out.println();
		System.out.println("-엔터를 계속 입력해 주세요-");
		c();

	}

	void e() {
		String casting = s.nextLine();
		if (hp > 1) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("노릇노릇 하게 구워먹었다");
			System.out.println();
			System.out.println("힘이 조금 오른거 같다");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();

		} else {
			System.out.println();
			System.out.println("아직 고등어를 상대할 수 없다 ");
			System.out.println(" 체력을 키운 후 다시 도전하자");
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();
		}

	}

	void f() {
		String casting = s.nextLine();
		if (hp > 16) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("이걸로 몇일은 식량 걱정이 없을것 같다");
			System.out.println();
			System.out.println("어쩌면 몇주일거 같기도 하다");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();

		} else {
			System.out.println();
			System.out.println("아직 고래를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 힘을 키운 후 다시 도전하자");
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();
		}

	}

	void g() {
		String casting = s.nextLine();
		if (hp > 30) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("매번 낚시를 방해하던 녀석을 드디어 해치웠다");
			System.out.println();
			System.out.println("이제 마음 놓고 떠나도 될거 같다");

		} else {
			System.out.println();
			System.out.println("상어를 만났다 한번 물리면 끝이다 ");
			System.out.println();
			System.out.println(" 힘을 키운 후 다시 도전하자");
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();
		}

	}

	void h() {
		String casting = s.nextLine();
		if (hp > 8) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("구워서 맛있게 먹었다");
			System.out.println();
			System.out.println("힘이 조금 오른거 같다");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();

		} else {
			System.out.println();
			System.out.println("아직 삼치를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 힘을 키운 후 다시 도전하자");
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();
		}

	}

	void i() {
		String casting = s.nextLine();
		if (hp > 6) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("노릇노릇하게 구운 갈치는 밥도둑이다 하지만 밥이 없다");
			System.out.println();
			System.out.println("힘이 조금 오른거 같다");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();

		} else {
			System.out.println();
			System.out.println("아직 갈치를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 힘을 키운 후 다시 도전하자");
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();
		}

	}

	void j() {
		String casting = s.nextLine();
		if (hp > 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("고소하지만 양이 너무 적다");
			System.out.println();
			System.out.println("하나로는 성에 차지 않는다");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();

		} else {
			System.out.println();
			System.out.println("아직 멸치를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 힘을 키운 후 다시 도전하자");
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();
		}

	}

	void k() {
		String casting = s.nextLine();
		if (hp > 4) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("가오리는 역시 찜이 나은거 같다");
			System.out.println();
			System.out.println("힘이 조금 오른거 같다");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();

		} else {
			System.out.println();
			System.out.println("아직 가오리를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 힘을 키운 후 다시 도전하자");
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();
		}

	}

	void l() {
		String casting = s.nextLine();
		if (hp > 3) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("가자미 구이를 먹으니 맥주가 생각난다");
			System.out.println();
			System.out.println("힘이 조금 오른거 같다");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();

		} else {
			System.out.println();
			System.out.println("아직 가자미를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 힘을 키운 후 다시 도전하자");
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();
		}

	}

	void m() {
		String casting = s.nextLine();
		if (hp > 7) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("회를 떠먹었다 고소한 맛이 일품이다");
			System.out.println();
			System.out.println("힘이 조금 오른거 같다");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();

		} else {
			System.out.println();
			System.out.println("아직 방어를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 힘을 키운 후 다시 도전하자");
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();
		}

	}

	void n() {
		String casting = s.nextLine();
		if (hp > 2) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("말려서 예비식량으로 써야겠다");
			System.out.println();
			System.out.println("힘이 조금 오른거 같다");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();

		} else {
			System.out.println();
			System.out.println("아직 명태를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 힘을 키운 후 다시 도전하자");
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();
		}

	}

	void o() {
		String casting = s.nextLine();
		if (hp > 2) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("회로 먹었다");
			System.out.println();
			System.out.println("힘이 조금 오른거 같다");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();

		} else {
			System.out.println();
			System.out.println("아직 우럭을 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 힘을 키운 후 다시 도전하자");
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();
		}

	}

	void p() {
		String casting = s.nextLine();
		if (hp > 2) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("회로 먹었다 초장이 그리워 진다");
			System.out.println();
			System.out.println("힘이 조금 오른거 같다");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();

		} else {
			System.out.println();
			System.out.println("아직 광어를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 힘을 키운 후 다시 도전하자");
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();
		}

	}

	void q() {
		String casting = s.nextLine();
		if (hp > 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("나뭇가지에 꽂아 구웠다");
			System.out.println();
			System.out.println("힘이 조금 오른거 같다");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();

		} else {
			System.out.println();
			System.out.println("아직 꽁치를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 힘을 키운 후 다시 도전하자");
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();
		}

	}

	void r() {
		String casting = s.nextLine();
		if (hp > 9) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("수육으로 해먹었다 ");
			System.out.println();
			System.out.println("힘이 조금 오른거 같다");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();

		} else {
			System.out.println();
			System.out.println("아직 아귀를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 힘을 키운 후 다시 도전하자");
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			casting = s.nextLine();
			a();
		}

	}

	void c() {
		String casting = s.nextLine();
		if (a == 0) {
			b = fish[0];
			d();

		}
		if (a == 1) {
			b = fish[1];
			e();

		}
		if (a == 2) {
			b = fish[2];
			f();

		}
		if (a == 3) {
			b = fish[3];
			g();

		}
		if (a == 4) {
			b = fish[4];
			h();

		}
		if (a == 5) {
			b = fish[5];
			i();

		}
		if (a == 6) {
			b = fish[6];
			j();

		}
		if (a == 7) {
			b = fish[7];
			k();

		}
		if (a == 8) {
			b = fish[8];
			l();

		}
		if (a == 9) {
			b = fish[9];
			m();

		}
		if (a == 10) {
			b = fish[10];
			n();

		}
		if (a == 11) {
			b = fish[11];
			o();

		}
		if (a == 12) {
			b = fish[12];
			p();

		}
		if (a == 13) {
			b = fish[13];
			q();

		}
		if (a == 14) {
			b = fish[14];
			r();

		}

	}

	void d() {

		if (hp > 20) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("먹고 나니 힘이 솟아 오른다");
			System.out.println();
			System.out.println(" 배를 만들어 집에 돌아갈 수 있을것 같다 ");
			System.out.println("   ㅅㅅ ");
			System.out.println("  ㅅ ㅅ ㅅ ㅅ         ");
			System.out.println("   ||   ");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ    ");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ      ");
			System.out.println();
			System.out.println();
			System.out.println("근데 이곳에서 지내는 동안 매번 방해하던 그녀석을 그냥 두고 갈 수는 없다");
			System.out.println();
			String casting = s.nextLine();
			a();

		} else {
			System.out.println();
			System.out.println("아직 참치를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 체력을 키운 후 다시 도전하자");
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			String casting = s.nextLine();
			a();
		}

	}

	public static void main(String[] args) {
		Fish F = new Fish();

		F.a();

	}

}
