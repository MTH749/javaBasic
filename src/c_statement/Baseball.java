package c_statement;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Baseball {

	public static void main(String[] args) {

		int a1, a2, a3;

		

		a1 = (int)(Math.random() * 9) + 1;

		

		do{

			a2 = (int)(Math.random() * 9) + 1;

		}while(a1 == a2); //a1의 숫자와 a2의 숫자가 같을때!

		

		do{

			a3 = (int)(Math.random() * 9) + 1;

		}while(a1 == a3 || a2 == a3);

		System.out.println( a1+ "," + a2 + ","+ a3);

		Scanner s = new Scanner(System.in);

		int count = 0;

		while(true){

			System.out.println("3자리 숫자를 입력해주세요");

			int input = Integer.parseInt(s.nextLine());

			int i3 = input % 10;

			input /= 10;

			int i2 = input % 10;

			input /= 10;

			int i1 = input % 10;

			

			int strike = 0;

			int ball = 0;

			int out = 0;

			

			if(a1 == i1) strike ++;

			if(a2 == i2) strike ++;

			if(a3 == i3) strike ++;

			

			if(a1 == i2 || a1 == i3) ball++;

			if(a2 == i1 || a2 == i3) ball++;

			if(a3 == i1 || a3 == i2) ball++;

			

//			if(a1 != i1 && a1 != i2 && a1 != i3) out++;

//			if(a2 != i2 && a2 != i3 && a3 != i3) out++;

//			if(a3 != i3 && a3 != i3 && a3 != i3) out++;

			

			out = 3 - strike - ball;

			

			System.out.println(++count + " 차 시도(" + i1 + i2 + i3 + ")"

				+ strike + "S " + ball + "B " + out + "0");

			if(strike == 3){

				System.out.println("정답입니다!!");

				break;

			}

			
		}
	}
}	