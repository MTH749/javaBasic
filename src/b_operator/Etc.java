package b_operator;

public class Etc {

	public static void main(String[] args) {
		/*
		 * <<비트 연산자>>
		 * - |(OR) 		: 피연산자 중 한쪽이라도 값이 1이면, 1을 그외는 0을 결과로얻는다
		 * - &(AND) 	: 피연산자와 양 쪽이 모두 1이어야만 1을 그외는 0을 결과로 얻는다.
		 * - ^(XOR)		: 피연산의 값이 서로 다를 떄만 1을 같을때는 0을 결과로 얻는다.
		 * - ~(비트전환)	: 피연산자를 0은 1로 1은 0으로 바꾼다.
		 * - <<(쉬프트) 	: 피연산자의 각 자리를 왼쪽으로 이동시킨다. 빈칸은 0으로 채운다
		 * - >>(쉬프트)	: 피연산자의 각자리를 오른쪽으로 이동시킨다. 빈칸은앞자리와 동일한 값으로 채운다
		 * 
		 * <<기타연산자>>
		 * .(참조 연산자)  : 특정 범위 내에 속해있는 멤버를 지칭할 때 사용한다. ex .equals
		 * (type) 		: 형변환 (casting)
		 * ?:(삼향연산자)	: 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		 * instanceof 	: 참조형타입 확인 
		 */
		
		//1바이트는 8비트로 이루어져있고 1비트는 0또는 1을 표현할 수 있다.
		//즉, 1바이트는 8개의 0 또는 1을 표현할 수 있다.
		
		/*
		 *- 10 -> 2진수 : 10진수 값을 1이 될때까지 2로 나눈다/ 
		 * 
		 * 10	
		 * 5  0
		 * 2  1
		 * 1  0
		 * 
		 * 10의 2진수 = 1010
		 * 
		 * 15를 2진수로 만들어 주세요
		 * 
		 * 15 		
		 * 7 1
		 * 3 1
		 * 1 1
		 * 
		 * 15의 2진수 1111
		 * 
		 * -2진수 -> 10진수 : 각 자리에 1, 2, 4, 8, 16, 32....를 곱한값을 더한다
		 * 1 0 1 0
		 * 8 4 2 1
		 * 8+0+2+0 = 10
		 * 
		 * 1111을 10진수로 만들어주세요
		 * 
		 * 1 1 1 1
		 * 8 4 2 1 
		 * 8+4+2+1 = 15 
		 */
		//00001010 : 10
		//00001111 : 15
		
		//|00001010
		System.out.println(10 | 15);
		
		//&00000101 
		System.out.println(10 & 15);
		
		//^ : 00000101
		System.out.println(10 ^ 15);
		
		//~ : 11110101
		System.out.println(~10);
		
		//<< : 00010100
		System.out.println(10 << 1);
		//>> : 00000101
		System.out.println(10 >> 1);
		
		int x = 10;
		int y = 20;
		int result = x < y ? x: y;
		System.out.println(result);
		//true : int result = x;
		//false : int result - y;
		
		//시험점수가 60점 이상이면 합격 미만이면 불합격
		int score = 60;
		String res = 60 <= score ? "합격" : "불합격";
		System.out.println(score + "점은 " + res + " 입니다. ");
		
		//주민등록 번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		
		int regNO = 1;
		String gender = regNO == 1 ? "남자" : "여자 ";
		System.out.println("당신의 성별은 " + gender + " 입니다. ");
		
		gender = regNO == 1 ? "남자" : (regNO == 2 ? "여자" : "확인불가"); 
		System.out.println("당신의 성별은 " + gender + " 입니다. ");
		
		//두개의 변수에 저장된 수 중에 큰 숫자를 출력해주세요.
		int q = 5;
		int w = 6;
		int e = q > w ? q : w;
		System.out.println(e);
		
		//변수에 저장된 수의 절대값을 출력해주세요.
		
		int a = 6;
		int abs = 0 <= a ? a : -a;
		System.out.println(abs);
		
		//변수에 저장된 주민등록번호 뒷자리의 첫번째 숫자가 1이나 3이면 남자를
		//2나 4면 여자를 출력해주세요.
		//그외 숫자는 확인불가를 출력해주세요

		int d = 3 ;
		String g = d == 1 || d == 3  ? "남자 ": d == 2 || d == 4 ? "여자 " : "확인불가";
		System.out.println("당신의 성별은 " + g + " 입니다. ");
		
		
	}

}
