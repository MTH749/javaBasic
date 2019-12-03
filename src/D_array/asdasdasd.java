package D_array;

import java.util.Arrays;

public class asdasdasd {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를 50 ~ 100까지 랜덤으로
		 * 생성시키고 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요
		 * 
		 * 순위 이름 Java Oracle HTML CSS JQuery JSP 총점 평균 1 홍길 90 100 80 50 30 90
		 * 400 70 2 홍길 90 100 80 50 30 90 400 70 3 홍길 90 100 80 50 30 90 400 70
		 * 4 홍길 90 100 80 50 30 90 400 70 5 홍길 90 100 80 50 30 90 400 70
		 */

		String[] students = { "정대석", "박종민", "이누리", "김지선", "이승재" };
		String[] subjects = { "Java", "Oracle", "HTML", "CSS", "JQuery", "JSP" };
		double[][] scores = new double[students.length][subjects.length + 3]; // 총점
																				// 평균
																				// 순위
																				// 까지
																				// 넣을거기때문에
																				// +3을
																				// 해줌

		// 점수를 입력한다.
		for (int i = 0; i < scores.length; i++) { // 맨앞에는 석차가있기때문에 0번인덱스에는 석차를
													// 넣음
			scores[i][0] = 1;
			for (int j = 0; j < subjects.length; j++) {
				scores[i][j + 1] = (int) (Math.random() * 51) + 50;
			}
		}

		// 총점과 평균을 구한다
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < subjects.length; j++) {
				scores[i][scores[i].length - 2] += scores[i][i + 1];
			}
			scores[i][scores[i].length - 1] = (int) (scores[i][scores[i].length - 2]
					/ subjects.length * 100 + 0.5) / 100.0; // 평균
		}

		// 석차를 구한다.
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				if (scores[i][scores[i].length - 1] < scores[j][scores[j].length - 1]) {
					scores[i][0]++;
				}
			}
		}

		// 정렬한다.
		for (int i = 0; i < scores.length - 1; i++) {
			for (int j = i + 1; j < scores.length; j++) {
				if (scores[i][0] > scores[j][0]) {
					double[] temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;

					String tempName = students[i];
					students[i] = students[j];
					students[j] = tempName;
				}
			}
		}
		// 출력한다.
		System.out.print("석차\t이름");
		for (int i = 0; i < subjects.length; i++) {
			System.out.print("\t" + subjects[i]);
		}
		System.out.println("\t총점\t평균");

		for (int i = 0; i < scores.length; i++) {
			System.out.print((int) scores[i][0] + "\t" + students[i]);
			for (int j = 1; j < scores[i].length; j++) {
				System.out.print("\t" + scores[i][j]);
			}
			System.out.println();
		}
		
		System.out.print("과목별 평균 \t");
		for(int i = 1; i <= subjects.length; i++){
			double sum =0;
			for(int j = 0; j < scores.length; j++){
			sum += scores[j][i];
		}
			double avg = (int)(sum/scores.length *100 +0.5)/100.0;
			System.out.print("\t" + avg);
		}
		
	}
}
