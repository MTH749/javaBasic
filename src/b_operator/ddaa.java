package b_operator;

import java.util.Scanner;

public class ddaa
{
	
	public static void main(String[] args)
	{
	
		Scanner s1 = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		int num = Integer.parseInt(s1.nextLine());		
		String change = s1.nextLine();
		
		for(int i = 0; i < s1.nextLine().length(); i++){
			int num1 = Integer.parseInt(s1.nextLine());
			int num2 = change.indexOf(num);
				num1 = num2;
		}
	}
}
