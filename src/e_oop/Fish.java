package e_oop;



import java.util.Scanner;

public class Fish {
	Scanner s = new Scanner(System.in);
	String[] fish = new String [] {"참치", "고등어", "고래", "상어", "삼치", "갈치", "멸치", "가오리", "가자미", "방어", "명태", "우럭", "광어","꽁치","아귀"};
	
	int[] lure = new int [15];
	int a;
	String b;
	int hp = 0;
	int str = 0;
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
		
		a1();
	}

	void a1() {
		System.out.println();
		System.out.println(" 할 일을 입력해 주세요.<낚시,운동,탈출,게임방법>");
		String casting = s.nextLine();

		if (casting.equals("낚시")) {
			for (int i = 0; i < 50; i++) {

				a = (int) (Math.random() * 15);

			}
			c();
		} else if (casting.equals("운동")) {
			a3();

		} else if (casting.equals("게임방법")) {
			b();
		} else if (casting.equals("탈출")) {
			a2();
		} else {
			a1();
		}
	}

	void b() {
		System.out.println();
		System.out.println("  ㅅ ");
		System.out.println(" ㅅㅅㅅㅅ");
		System.out.println("ㅅㅅㅅㅅㅅㅅ ");
		System.out.println("  ||");
		System.out.println("옆에 나무가 보인다 힘을 기르면 나무로 배를 만들 수 있을거 같다 ");
		System.out.println();
		System.out.println("게임 방법");
		System.out.println("낚시를 해서 체력을 보충한다");
		System.out.println();
		System.out.println("체력을 올린후 운동을 통해 힘을 기른다");
		System.out.println();
		System.out.println("일정한 힘이 되면 섬을 탈출 할 수 있다");
		System.out.println();
		System.out.println("엔터를 신중히 쳐주세요. 오타는 처음으로 돌아가지만  잘못친 엔터는 다시 실행해야 합니다");
		a1();

	}

	void a2() {
		if (str >= 30) {
			System.out.println(" 나무를 뽑아 배를 만들었다  ");
			System.out.println("   ㅅㅅ");
			System.out.println("  ㅅ ㅅ ㅅ ㅅ         ");
			System.out.println("    ||   ");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ    ");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ      ");
			System.out.println();
			System.out.println("이제 이곳에서 탈출을 시도한다");

		} else if (str < 30) {
			System.out.println();
			System.out.println("나무가 꿈쩍도 하지 않는다");
			System.out.println();
			System.out.println("힘을 더 길러야 할거 같다");
			System.out.println();
			System.out.println("현재 체력 :" + hp);
			System.out.println("현재 힘 : " + str);
			a1();
		}

	}

	void a3() {
		if (hp > 0) {
			hp--;
			str++;
			System.out.println("탈출하려면 힘이 필요하다");
			System.out.println();
			System.out.println("열심히 움직여 볼까?");
			System.out.println("현재 체력 :" + hp);
			System.out.println("현재 힘 :" + str);
			a1();
		} else if (hp <= 0) {
			System.out.println("체력이 모자라다 ");
			System.out.println("낚시로 체력을 보충하자");
			a1();
		}
	}

	void e() {

		if (str >= 0 && hp >= 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("노릇노릇 하게 구워먹었다");
			System.out.println();
			System.out.println("hp + 1");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);

			a1();

		} else {
			System.out.println();
			System.out.println("아직 고등어를 상대할 수 없다 ");
			System.out.println(" 고등어는 힘이  0 이상 필요하다");
			System.out.println("현재 힘 :" + str);

			a1();
		}

	}

	void f() {

		if (str >= 24 && hp >= 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("이걸로 당분간은 식량 걱정이 없을것 같다");
			System.out.println();
			System.out.println("hp + 7");
			for (int i = 0; i < 7; i++) {
				hp++;

			}
			System.out.println();
			System.out.println("현재 체력 :" + hp);

			a1();

		} else {
			System.out.println();
			System.out.println("아직 고래를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 힘이 10을 넘겨야 한다");
			System.out.println();
			System.out.println("현재 힘 :" + str);

			a1();
		}

	}

	void g() {

		if (str > 30 && hp >= 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("매번 낚시를 방해하던 녀석을 드디어 해치웠다");
			System.out.println();
			System.out.println("이제 마음 놓고 떠나도 될거 같다");
			System.out.println();
			System.out.println("hp + 2");
			hp++;
			hp++;
			System.out.println("현재 체력" + hp);
			a1();

		} else {
			System.out.println();
			System.out.println("상어를 만났다 한번 물리면 끝이다 ");
			System.out.println();
			System.out.println(" 힘을 키운 후 다시 도전하자 상어를 잡는데는 힘이 얼마나 필요할까?");
			System.out.println();
			System.out.println("현재 힘 :" + str);

			a1();
		}

	}

	void h() {

		if (str > 5 && hp >= 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("구워서 맛있게 먹었다");
			System.out.println();
			System.out.println("hp + 2");
			hp++;
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);

			a1();

		} else {
			System.out.println();
			System.out.println("아직 삼치를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 삼치는 힘이 5를 넘겨야 할거 같다");
			System.out.println();
			System.out.println("현재 힘 :" + str);

			a1();
		}

	}

	void i() {

		if (str > 4 && hp >= 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("노릇노릇하게 구운 갈치는 밥도둑이다 하지만 밥이 없다");
			System.out.println();
			System.out.println("hp +2");
			hp++;
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);

			a1();

		} else {
			System.out.println();
			System.out.println("아직 갈치를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 갈치는 힘이 4를 넘겨야 잡을수 있을거 같다");
			System.out.println();
			System.out.println("현재  힘:" + str);

			a1();
		}

	}

	void j() {

		if (str >= 0 && hp >= 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("고소하지만 양이 너무 적다");
			System.out.println();
			System.out.println("hp + 1");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);

			a1();

		} else {
			System.out.println();
			System.out.println("아직 멸치를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 멸치를 잡는데는 힘이 0이상 필요하다");
			System.out.println();
			System.out.println("현재 힘 :" + str);

			a1();
		}

	}

	void k() {

		if (str > 3 && hp >= 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("가오리는 역시 찜이 나은거 같다");
			System.out.println();
			System.out.println("hp + 2");
			hp++;
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);

			a1();

		} else {
			System.out.println();
			System.out.println("아직 가오리를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 가오리를 잡으려면 힘이 3을 넘겨야 한다");
			System.out.println();
			System.out.println("현재 힘 :" + str);

			a1();
		}

	}

	void l() {

		if (str > 2 && hp >= 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("가자미 구이를 먹으니 맥주가 생각난다");
			System.out.println();
			System.out.println("hp + 1");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);

			a1();

		} else {
			System.out.println();
			System.out.println("아직 가자미를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 가자미를 잡으려면 힘이 2를 넘겨야 한다");
			System.out.println();
			System.out.println("현재 힘 :" + str);

			a1();
		}

	}

	void m() {

		if (str > 6 && hp >= 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("회를 떠먹었다 고소한 맛이 일품이다");
			System.out.println();
			System.out.println("hp + 3");
			for (int i = 0; i < 3; i++) {
				hp++;
			}
			System.out.println();
			System.out.println("현재 체력 :" + hp);

			a1();

		} else {
			System.out.println();
			System.out.println("아직 방어를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 방어를 잡으려면 힘이 6을 넘겨야 한다 ");
			System.out.println();
			System.out.println("현재 힘 :" + str);

			a1();
		}

	}

	void n() {

		if (str >= 0 && hp >= 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("말려서 예비식량으로 써야겠다");
			System.out.println();
			System.out.println("hp + 1");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);

			a1();

		} else {
			System.out.println();
			System.out.println("아직 명태를 상대할 수 없다 ");
			System.out.println();
			System.out.println("명태를 잡으려면 힘이 0 이상 필요하다");
			System.out.println();
			System.out.println("현재 힘 :" + str);

			a1();
		}

	}

	void o() {

		if (str > 2 && hp >= 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("회로 먹었다");
			System.out.println();
			System.out.println("hp + 1");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);

			a1();

		} else {
			System.out.println();
			System.out.println("아직 우럭을 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 우럭을 잡으려면 힘이 2를 넘겨야 한다");
			System.out.println();
			System.out.println("현재 힘 :" + str);

			a1();
		}

	}

	void p() {

		if (str > 2 && hp >= 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("회로 먹었다 초장이 그리워 진다");
			System.out.println();
			System.out.println("hp + 1");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);

			a1();

		} else {
			System.out.println();
			System.out.println("아직 광어를 상대할 수 없다 ");
			System.out.println();
			System.out.println("광어를 잡으려면 힘이 2를 넘겨야 한다");
			System.out.println();
			System.out.println("현재 힘 :" + str);

			a1();
		}

	}

	void q() {

		if (str >= 0 && hp >= 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("나뭇가지에 꽂아 구웠다");
			System.out.println();
			System.out.println("hp + 1");
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);

			a1();

		} else {
			System.out.println();
			System.out.println("아직 꽁치를 상대할 수 없다 ");
			System.out.println();
			System.out.println("꽁치를 상대하려면 힘이 0이상 필요하다");
			System.out.println();
			System.out.println("현재 힘 :" + str);

			a1();
		}

	}

	void r() {

		if (str > 6 && hp >= 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("수육으로 해먹었다 ");
			System.out.println();
			System.out.println("hp + 2");
			hp++;
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);

			a1();

		} else {
			System.out.println();
			System.out.println("아직 아귀를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 아귀를 잡으려면 힘이 6을 넘겨야 한다");
			System.out.println();
			System.out.println("현재 힘 :" + str);

			a1();
		}

	}

	void c() {

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

		if (str > 20 && hp >= 0) {
			System.out.println();
			System.out.println(b + "를 잡았다");
			System.out.println("먹고 나니 힘이 솟아 오른다 참치 개꿀맛 ㅇㅈ");
			System.out.println();
			System.out.println(hp + 6);
			for (int i = 0; i < 6; i++) {
				hp++;
			}
			hp++;
			System.out.println();
			System.out.println("현재 체력 :" + hp);

			a1();

		} else {
			System.out.println();
			System.out.println("아직 참치를 상대할 수 없다 ");
			System.out.println();
			System.out.println(" 참치를 잡으려면 힘이 얼마나 필요할까?");
			System.out.println();
			System.out.println("현재 힘 :" + str);

			a1();
		}

	}

	public static void main(String[] args) {
		Fish F = new Fish();

		F.a();

	}

}
