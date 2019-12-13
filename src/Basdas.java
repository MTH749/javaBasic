import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import e_oop.SimLiTest;

public class Basdas {
	Battle b = new Battle();
	Scanner s = new Scanner(System.in);
		
	
	public class Battle{
		int hp;
		int str;
		int weapon;
		int damage;
		

		}
		static void mon(){
		String[] array = {"data1", "data2", "data3", "data4", "data5"};
		
		Collections.shuffle(Arrays.asList(array));
			
		for (String value : array) {
			System.out.print(value + " ");
			}
		}	
	public static void main(String[] args) {
		mon();
	}
}	
	
	
