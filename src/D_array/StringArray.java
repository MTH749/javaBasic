package D_array;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		String s = new String("ABCD");// 참조형 변수 선언 할때는 new,() 붙임
		String str = "ABCD";// String만 new,() 생략 가능

		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		// char 배열은 특별히 배열의 내용이 출력된다.

		// String 클래스 내부에 문자배열을 다루는 여러가지 메서드가 정의되어 있다.

		/*
		 * <<String의 주요 메서드>>
		 * -equals() : 문자열의 내용이 같은지 확인한다.
		 * -length() : 문자열의
		 * 길이를 반환한다.
		 * -charAt() : 문자열에서 해당 위치에 있는 문자를 반환한다.
		 * -substring() : 문자열에서 해당 범위에 있는 문자를 반환한다. 
		 * -indexOf() : 문자열 내의 특정 문자열의 인덱스를 반환한다.
		 *  -replace(): 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다.
		 */

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)); // charArray[i]
		}
		String revstr = ""; // str을 거꾸로 담을 변수
		// 뒤에서부터 한글자씩 가져와서 새로운 변수에 더한다.
		for (int i = str.length() - 1; i >= 0; i--) {
			revstr += str.charAt(i);
		}
		System.out.println(revstr);

		str = "0123456789";

		String sub1 = str.substring(3);// 3번 인덱스부터 끝까지 잘라서 반환한다. ()들어가는 값 = 파라미터
		System.out.println(sub1);
		String sub2 = str.substring(5, 8);
		System.out.println(sub2);
		// 문자열을 자를 필요가 있을때 사용

		str = " 치킨 피자 돈까스 떡볶이";
		int idx = str.indexOf("피자");// 피자의 시작 인덱스를 반환한다.
		System.out.println(idx);

		idx = str.indexOf("햄버거");
		System.out.println(idx); // 해당하는 문자열이 없는 경우 -1을 반환한다.

		String[] menus = { "치킨 18000원", "피자 9900원", "돈까스 8000원", "떡볶이 500원" };
		for (String menu : menus) {
			String name = menu.substring(0, menu.indexOf(" "));
			System.out.println(name);

			// 가격만 분리시켜 int형 변수에 담아주세요.
		}
		for (String menu : menus) {
			String name = menu.substring(0, menu.indexOf(" "));

			int price = Integer.parseInt(menu.substring(menu.indexOf(" ") + 1,
					menu.indexOf("원")));
			System.out.println(name + " = " + price); 

		}
		
		str = "123456789";
		str = str.replace ("3", " 짝");
		System.out.println(str);
		str = str.replace ("6", "짝");
		System.out.println(str);
		str = str.replace ("9", "짝");
		System.out.println(str);
		
		String pn = "010-2363-3647";
		//하이폰을 제거해서 출력해주세요.
		pn = pn.replace ("-", "");//갯수에 상관없이 전부다 찾아서 바꿔줌
		System.out.println(pn);
	
		
		// 숫자를 입력 받을때 3자리 마다 ,를 찍어주세요
		System.out.println("숫자를 입력해 주세요");
		Scanner s1 = new Scanner(System.in);		
		String change = s1.nextLine();	
		
		for(int i = change.length() -3; i >0; i -=3 ){
			
			String tmp = change.substring(0,i);
			String tmp1 = change.substring(i);
			change = tmp + "," +tmp1;
	}
		System.out.println(change);
		
		System.out.println ("숫자를 입력해 주세요");
		String number =s1.nextLine();
		String newNumber = "";
		
		int count = 0;
		
		for(int i = number.length() - 1; i >=0; i--){
			newNumber = number.charAt(i) +newNumber;
			count++;
			if(count %3 == 0 && count != number.length()){
					newNumber = "," + newNumber;		
			} 	
		}
		System.out.println(newNumber);
	}		
	
}
