import java.util.Scanner;


public class Basdas {

	public static void main(String[] args) {
		
		
		// 숫자를 입력 받을때 3자리 마다 ,를 찍어주세요
		Scanner s = new Scanner(System.in);
		System.out.println(" 숫자를 입력해 주세요 ");
		String dd = s.nextLine();
		
		for(int i = dd.length()-3; i > 0; i -= 3 ){
			
			char temp = dd. charAt (i);
			char temp1 = dd.charAt(i);
			
			dd = temp + "," + temp1;
			
		}System.out.println(dd);		
				
	}

}
