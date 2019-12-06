import java.util.Scanner;

import e_oop.SimLiTest;


public class Basdas {

	public static void main(String[] args) {
		new Basdas().question();	
	}
		Scanner s = new Scanner(System.in);
		
		
		String [] menu = new String [] {"김밥", "돈까스","라면","떡볶이","순대"};
		String [] num = new String [] {"1번","2번","3번","4번","5번"};
		String temp;
		void question(){
			System.out.println(" 메뉴를 입력해 주세요 ");
			String answer = s.nextLine();
			
			for(int i = 0; i < num.length; i++){

				for(int j = 0; j < num.length; j++){
						
					
				if(answer.equals(menu[i])){					
					temp = menu[j];
					num[j] = temp;
					
				System.out.println("메뉴의 번호는" + num[j] );
					answer = s.nextLine();
			}
			
		}
	  }
	}
}