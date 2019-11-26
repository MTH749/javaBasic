package c_statement;

import java.util.Scanner;



public class Asdasdasdd {

	public static void main(String[] args) {
	
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
