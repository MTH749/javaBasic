package D_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 
		 * <<배열>> -int[]number = new int[5];// 기본값으로 초기화 된다. []는 보통 타입 뒤에 붙임
		 * [5]는 [] 안에 5개의 숫자를 저장 기본값으로 0이 저장된 채로 생성. -int[]number = new
		 * int[]{10, 20, 30, 40, 50}; = 5개의 숫자를 저장햇기 때문에 [] 값은 5 -int[]number =
		 * {10, 20, 30, 40, 50};
		 *//* 값을 여러개 저장, 값을 효율적으로다 */

		// 배열은 참조형 타입입니다. 참조형은 값을 저장 하는게 아니라 주소를 저장
		int[] array; // 배열의 주소를 저장할 공간이 만들어 진다.
		array = new int[5]; // 배열이 생성되고 그 주소가 저장된다/
		// new : 새로운 저장공간 생성 및 주소 반환
		// int[5] : int를 저장할 수 있는 5개의 공간
		// 배열 초기화시 기본값이 저장된다.

		System.out.println(array);// 주소 저장*/

		System.out.println(array[0]);
		// 실제값에 접근하기 위해서는 index[0]를 지정해줘야 한다.
		// index 저장된 숫자의 순서를 나타내줌
		// index는 int타입만 사용할 수 있다 (리터럴, 변수, 상수, 연산등)

		String arrayStr = Arrays.toString(array);
		// 배열의 모든 인덱스에 저장된 값을 문자열로 반환.
		System.out.println(arrayStr);

		int[] iArray1 = new int[] { 1, 2, 3 };
		// 값의 개수로 길이가 정해진다
		// 배열의 크기는 고정되어 있다.

		int[] iArray2 = { 1, 2, 3 }; // 선언과 초기화를 동시에 해야한다
		int[] iArray3;
		/* iArray3 = {1, 2, 3} 에러 발생 */

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50; // 마지막 인덱스는 "배열의 길이 - 1" 이다.

		// 정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.
		int[] array1 = new int[10];

		// 모든 인덱스에 있는 값을 변경해 주세요.
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;
		array1[4] = 50;
		array1[5] = 60;
		array1[6] = 70;
		array1[7] = 80;
		array1[8] = 90;
		array1[9] = 100;

		// 모든 인덱스에 있는 값의 합계를 출력해주세요.
		int sum = 0;
		sum += array1[0];
		sum += array1[1];
		sum += array1[2];
		sum += array1[3];
		sum += array1[4];
		sum += array1[5];
		sum += array1[6];
		sum += array1[7];
		sum += array1[8];
		sum += array1[9];

		System.out.println(sum);

		// index는 1씩 증가하는 규칙이 있어 for 문과 함계 사용하기 좋다
		for (int i = 0; i < array1.length; i++) {

			System.out.println(array1[i]);

		}

		// 배열의 길이를 알고 있다고 숫자를 사용하는 것을 하드코딩이라고 한다.
		// 길이를 알더라도 length를 사용하는 것이 더 좋은 코드이

		for (int i = 0; i < array1.length; i++) {
			array1[i] = i + 1;

		}
		System.out.println(Arrays.toString(array1));

		// 배열에 숫자를 담고 합계와 평균을 구해보자
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = (int) (Math.random() * 100) + 1;

		}
		System.out.println(Arrays.toString(numbers));

		sum = 0;
		double avg = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		avg = (double) sum / numbers.length;
		System.out.println("합계 " + sum + " /평균 " + avg);

		// 향상된 for문

		for (int number : numbers) {// 배열에 있는 값을 차례대로 변수에 넣는다.
			System.out.println(number);// 뒤의 numbers를 차례대로 앞의 number에 저장하고 나서
										// 중괄호를 실행
			// 그다음 돌아와서 index를 계속해서 차례대로 (뒤 -> 앞)실행, number의 값만 계속해서 바뀌고
			// numbers의 값은 그대로다.

		}

		// 배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요.
		int min = numbers[0];
		int max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (max < numbers[i]) {

				max = numbers[i];
			}

			if (min > numbers[i]) {

				min = numbers[i];
			}
		}
		System.out.println("최소 값은 " + min);
		System.out.println("최대 값은 " + max);
	

		
		int[] shuffle = new int[30];
		for (int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
			int zero = shuffle[i];
		}
		System.out.println(Arrays.toString(shuffle));
		// 배열의 값을 섞어주세요.
		//0번 인덱스의 값과 랜덤 인덱스의 값을 서로 교환한다
		
		for (int i = 0; i < shuffle.length *10; i++) {
			int random = (int)(Math.random() * shuffle.length);
			int temp = shuffle[0];
			shuffle[0] = shuffle[random];
			shuffle[random] = temp;
			
			}
		System.out.println(Arrays.toString(shuffle));
		
		//1~10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
	
			
			int [] a = new int [10];
			for(int  i = 0; i  < 500; i++ ){				
				int ran = (int)(Math.random() * a.length) + 1;
					a[ran-1]++;
					
					
				}
			System.out.println(Arrays.toString(a));
			} 	
		 


	}



 
	

