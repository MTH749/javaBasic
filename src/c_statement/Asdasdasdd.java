package c_statement;

import java.util.Scanner;



public class Asdasdasdd {

	public static void main(String[] args) {
	
<<<<<<< HEAD
		/*[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프
		로그램을 작성하시오.
*/	
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {

				sum += str.charAt(i) - '0';

		}
		System.out.println("sum="+sum);
		}
	
}
=======
		/*[4-9] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코
		드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되
		어야 한다. (1)에 알맞은 코드를 넣으시오.

		[Hint] String클래스의 charAt(int i)을 사용
		[연습문제]/ch4/Exercise4_9.java
		class Exercise4_9 {
		public static void main(String[] args) */
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
				
			sum += str.charAt(i) - '0';
			
	
		}
			System.out.println("sum="+sum);
		
		
		/*[실행결과]
		15
*/


		
		
		}
	}


>>>>>>> master
