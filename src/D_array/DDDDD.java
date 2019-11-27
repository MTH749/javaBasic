package D_array;

import java.util.Arrays;

public class DDDDD {

	public static void main(String[] args) {
		// 배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요.
		
		
		
		int []numbers = new int [10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100) + 1;
		}
		int min = numbers[0];
		int max = numbers[0];
		
		int [] shuffle = new int [30];
		for (int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}
		for (int i = 0; i < shuffle.length *100; i++) {
			int random = (int)(Math.random() * shuffle.length);
			int temp = shuffle[0];
			shuffle[0] = shuffle[random];
			shuffle[random] = temp;
			
			}System.out.println(Arrays.toString(shuffle));
		}
	}

