package D_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 
		 * <<정렬>> -선택정렬 : 첫번쨰 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은 수와 자리바꾸기를 반복해 앞에서 부터
		 * 작은수를 채워나가는 방식.
		 * 
		 * 
		 * -버블정렬 : 첫번쨰 숫자부터 바로 뒷 숫자와 비교해서 작은 수와 자리바꾸기를 반복 하여 뒤에서 부터 큰수를 채워나가는 방식
		 * 
		 * -삽입 정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰수들을 뒤로 밀고 주간에 삽임하는 방식
		 * 
		 * -석차구하기 : 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 등수를 1식 증가시키는 방식
		 */
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		shuffle(numbers);
		System.out.println(Arrays.toString(numbers));

		// selectSort(numbers);//선택 정렬
		// bubbleSort(numbers);//버블 정렬
		// insertSort(numbers); //삽입 정렬
		printRank(numbers);// 석차구하기

		// System.out.println(Arrays.toString(numbers));
	}

	private static void printRank(int[] numbers) {// numbers의 길이만큼 저장할 배열이
													// 필요(등수). 거기에 다 1을 저장해 놓고
													// 비교시작
		// 나보다 더 큰 점수를 만나면 등수를 1증가
		int rank[] = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			rank[i] = 1;
		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {

				if (numbers[i] < numbers[j]) {

					rank[i] += 1;

				}

			}

		}
		System.out.println(Arrays.toString(rank));
	}

	private static void insertSort(int[] numbers) {

		for (int i = 1; i < numbers.length; i++) {

			int temp = numbers[i];
			int j = 0;
			for (j = i - 1; j >= 0; j--) {

				if (temp < numbers[j]) {
					numbers[j + 1] = numbers[j];

				} else {
					break;
				}
			}
			numbers[j + 1] = temp;
		}
	}

	private static void bubbleSort(int[] numbers) {

		for (int i = 0; i < numbers.length - 1; i++) {
			boolean changed = false;
			for (int j = 0; j < numbers.length - 1 - i; j++) {// j의 반복문 다 처리후
																// 바깥의 i로 이동
				if (numbers[j] > numbers[j + 1]) {

					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					changed = true;

				}
			}
			if (!changed) {
				break;
			}
		}
	}

	private static void selectSort(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {// j의 반복문 다 처리후 바깥의 i로
															// 이동
				if (numbers[i] > numbers[j]) {

					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;

				}
			}
		}

	}

	private static void shuffle(int[] numbers) {
		for (int i = 0; i < numbers.length * 10; i++) {
			int random = (int) (Math.random() * numbers.length);

			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;

		}

	}

}
