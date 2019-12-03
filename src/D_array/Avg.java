package D_array;

public class Avg {

	public static void main(String[] args) {

		[5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
		(1)에 알맞은 코드를 넣어서 완성하시오.
		[연습문제]/ch5/Exercise5_10.java
		class Exercise5_10 {
		public static void main(String[] args) {
		char[] abcCode =
		{ '`','~','!','@','#','$','%','^','&','*',
		'(',')','-','_','+','=','|','[',']','{',
		'}',';',':',',','.','/'};
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String src = "abc123";
		String result = "";
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i < src.length();i++) {
		char ch = src.charAt(i);
		
		(1) 알맞은 코드를 넣어 완성하시오.
		 }
		System.out.println("src:"+src);
		System.out.println("result:"+result);
		} // end of main
		} // end of class
		0 1 2 3 4 5 6 7 8 9
		q w e r t y u i o p
		u v w x y z
		} ; : , . /
		a b c d e f g h i j k l m n o p q r s t
		` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] {
		[실행결과]
		src:abc123
		result:`~!wer
		
		
		[5-11] 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열
		의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다. (1)
		에 알맞은 코드를 넣어서 완성하시오.
		[연습문제]/ch5/Exercise5_11.java
		class Exercise5_11
		{
		public static void main(String[] args)
		{
		int[][] score = {
		{100, 100, 100}
		, {20, 20, 20}
		, {30, 30, 30}
		, {40, 40, 40}
		, {50, 50, 50}
		};
		int[][] result = new int[score.length+1][score[0].length+1];
		for(int i=0; i < score.length;i++) {
		for(int j=0; j < score[i].length;j++) {
		
		(1) 알맞은 코드를 넣어 완성하시오.
		 }
		}
		for(int i=0; i < result.length;i++) {
		for(int j=0; j < result[i].length;j++) {
		System.out.printf("%4d",result[i][j]);
		}S
		ystem.out.println();
		}
		} // main
		}
		[실행결과]
		100 100 100 300
		20 20 20 60
		30 30 30 90
		40 40 40 120
		50 50 50 150
		240 240 240 720
	}
}	
}
