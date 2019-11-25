package c_statement;

import java.util.Scanner;



public class Asdasdasdd {

	public static void main(String[] args) {
	
		/*[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프
		로그램을 작성하시오.
*/	
 		int sum = 0, a = 0;
		while(true){
			a++;
			if(a % 2 == 0){ 
				sum -= a;
			}else{
				sum += a;
			if(sum >= 100)
				break;
			}
		}
		System.out.println(a);
	}
	
}
