import java.util.Arrays;
public class Hello {

	public static void main(String[] args) {
		// 배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요.
		int[] ab = new int[10];

		int max = ab[0];
		int min = ab[0];

		for (int i = 0; i < ab.length; i++) {

			
			if (max > ab[i]) {

				max = ab[i];

			}
			if (min < ab[i]) {

				min = ab[i];

			}

		}
		System.out.println("최소값은? = " + min + "최대값은? = " + max);

	}

}
