package c_statement;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Baseball {

	public static void main(String[] args) {

		int a, a1, a2 = 0;
		int b, b1, b2 = 0;

		int st = 0;
		int ball = 0;
		int out = 0;
		Scanner s = new Scanner(System.in);

		do {

			a = (int) (Math.random() * 9) + 1;
			a1 = (int) (Math.random() * 9) + 1;
			a2 = (int) (Math.random() * 9) + 1;

		} while (a == a1 || a1 == a2 || a2 == a);


		System.out.println(" 숫자 3개를 입력해 주세요");
		b = s.nextInt();
		

		if (a == b)
		{
			System.out.println(" 1구 ");
			System.out.println(" s ");
			
		}
			else if(a1 == b)
			{
				System.out.println(" 1구 ");
				System.out.println(" b ");
				
			}
			else if(a2 == b)
			{
				System.out.println(" 1구 ");
				System.out.println(" b ");	
			}
		else 
		{
			System.out.println("1구 \n O");
		}
		b1 = s.nextInt();
		
		if ( a== b1)
		{
			System.out.println(" 2구 ");
			System.out.println(" b ");			
		}
			else if(a1 == b1)
			{
				System.out.println(" 2구 ");
				System.out.println(" s ");
			}
			else if(a2 == b1)
			{
				System.out.println(" 2구 ");
				System.out.println(" b ");
				
			}
		else 
		{
				System.out.println("2구 \n O");
		}
		b2 = s.nextInt();
		if (a == b2)
		{
			System.out.println(" 3구 ");
			System.out.println(" b ");

		}
			else if(a1 == b2)
			{
				System.out.println(" 3구 ");
				System.out.println(" b ");
			}
			else if(a2 == b2)
			{
				System.out.println(" 3구 ");
				System.out.println(" s ");
			}
		else 
		{
				System.out.println("3구 \n O");			
		}
	
	}
}
