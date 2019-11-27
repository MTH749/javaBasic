package c_statement;

 

import java.util.Scanner;

 

public class Baseball1 {

 

	public static void main(String[] args) {

		

		//숫자야구게임을 만들어주세요.

		Scanner s = new Scanner(System.in);

		int c1,c2,c3;		 

		int h1 = 0;

		int h2 = 0;

		int h3 = 0;		

		int ss = 0;

		int bb = 0;

		

		c1 = (int)(Math.random()*9)+1;

		do{

			c2 = (int)(Math.random()*9)+1;		 

		}while(c1 == c2);

		do{

			c3 = (int)(Math.random()*9)+1;

		}while(c3 == c1 || c3 == c2);

		do{			

			ss = 0;

			bb = 0;

			System.out.println("숫자 3개를 입력해주세요");

			

			int input = Integer.parseInt(s.nextLine());

			h3 = input % 10;		
			
			h2 = (input /10) % 10;			

			h1 = (input / 100) % 10;

			if(h1 == c1){

				ss += 1;

			}else if(h1 == c2 || h1 == c3){

				bb += 1;

			}

			if(h2 == c1 || h2 == c3){

				bb += 1;

			}else if(h2 == c2){

				ss += 1;

			}

			if(h3 == c1 || h3 == c2){

				bb += 1;

			}else if(h3 == c3){

				ss += 1;

			}

			System.out.println(ss + "S" + bb + "B");

		}while(ss < 3);

		System.out.println("정답입니다!!");

		

		

			

		

	}

 

}