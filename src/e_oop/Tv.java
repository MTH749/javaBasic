package e_oop;

import java.util.Scanner;

public class Tv {
	public static void main(String[] args) {
		Tv t = new Tv();

		t.power();
		
		t.remotecontrolerCha();
		t.remotecontrolerVol();
		
		System.out.println(t.power);
		System.out.println("음량 : " +  t.chanal);
		System.out.println("채널 : " + t.volume);

	}
	Scanner s = new Scanner(System.in);
	
	boolean power; // 전원
	int chanal = 0; // 채널
	int volume = 0; // 음량
	int[] remotecontroler = new int[51];

	void power() {

			power = !false;
		}


	void ChanalUp() {

		if (power && chanal < 50) {

			chanal++;

		}

	}

	void Chanaldown() {

		if (power && 0 < chanal) {

			chanal--;

		}

	}

	void volumeUp() {

		if (power && volume < 50) {

			volume++;

		}

	}

	void volumeDown() {

		if (power && 0 < volume) {

			volume--;

		}

	}

	void remotecontrolerCha() {
		System.out.println("채널을 입력해 주세요");
		int con = Integer.parseInt(s.nextLine());
			if(power == true ){
				chanal = con;
			}
		}
	

	void remotecontrolerVol() {
		System.out.println("음량을 입력해 주세요");
		int con = Integer.parseInt(s.nextLine());
			if(power == true ){
				volume = con;
			}
		}	
		
	}

//다음주 과제
//발표 : 프로그램 주제 , 기능, 메서드 구성, 시연


