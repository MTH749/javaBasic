package D_array;

import java.util.Arrays;
import java.util.Random;

public class Score {

	public static void main(String[] args) {

		/*
		 * 우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를 50~100까지 랜덤으로 생성시켜
		 * 주시고 석차순으로 석차,이름,과목별 점수, 총점, 평균을 출력해주세요
		 * 
		 * 순위 이름 Java Oracle HTML CSS Jquery JSP 총점 평균 1 홍길동 90 100 80 50 30 90
		 * 400 70 2 홍길동 90 100 80 50 30 90 400 70 3 홍길동 90 100 80 50 30 90 400
		 * 70 4 홍길동 90 100 80 50 30 90 400 70 5 홍길동 90 100 80 50 30 90 400 70
		 */
		int scores[][] = new int[21][6];
		int[] sum = new int[scores.length];
		double[] avg = new double[scores.length];

		System.out.println("석차" + "\t" + "이름" + "\t" + "Java" + "\t"
				+ " Oracle" + "\t" + "HTML" + "\t" + "CSS" + "\t" + "JQuery"
				+ "\t" + "JSP" + "\t" + "총점" + "\t" + "평균");

		int[] scores1 = new int[scores.length];
		int[] scores2 = new int[scores.length];
		int[] scores3 = new int[scores.length];
		int[] scores4 = new int[scores.length];
		int[] scores5 = new int[scores.length];
		int[] scores6 = new int[scores.length];

		String[] name = new String[] { "김지선", "이누리", "박종민", "정대석", "정재영",
				"강현철", "주향한", "강현지", "연은주", "이병훈", "구한나", "박진영", "이승재", "민태홍",
				"이지형", "정보람", "김령환", "윤창훈", "백종빈", "이예림", "김경운" };
		int[] rank = new int[name.length];

		for (int i = 0; i < scores.length; i++) {
			scores1[i] = (int) (Math.random() * 50) + 50;
			scores2[i] = (int) (Math.random() * 50) + 50;
			scores3[i] = (int) (Math.random() * 50) + 50;
			scores4[i] = (int) (Math.random() * 50) + 50;
			scores5[i] = (int) (Math.random() * 50) + 50;
			scores6[i] = (int) (Math.random() * 50) + 50;
			sum[i] = scores1[i] + scores2[i] + scores3[i] + scores4[i]
					+ scores5[i] + scores6[i];

			avg[i] = (double) sum[i] / scores[i].length;

		}

		for (int i = 0; i < name.length; i++) {
				rank[i] = 1;
			for (int j = 0; j < name.length; j++) {

				if (sum[i] > sum[j]) {
					rank[i] ++;
				}
			}
			
		}
		for (int i = 0; i < rank.length; i++) {
			for (int j = i + 1; j < rank.length; j++) {

				if (rank[i] > rank[j]) {

					int temp = rank[i];
					rank[i] = rank[j];
					rank[j] = temp;
					
				}else if(rank[i] == rank[j]){
					int temp = rank[i];
					rank[i] = rank[j];
					rank[j] = temp;
					
				}
			}
		}
		
		
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name.length; j++) {

				if (sum[i] > sum[j]) {

					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;

					int temp1 = scores1[i];
					scores1[i] = scores1[j];
					scores1[j] = temp1;

					temp1 = scores2[i];
					scores2[i] = scores2[j];
					scores2[j] = temp1;

					temp1 = scores3[i];
					scores3[i] = scores3[j];
					scores3[j] = temp1;

					temp1 = scores4[i];
					scores4[i] = scores4[j];
					scores4[j] = temp1;

					temp1 = scores5[i];
					scores5[i] = scores5[j];
					scores5[j] = temp1;

					temp1 = scores6[i];
					scores6[i] = scores6[j];
					scores6[j] = temp1;

					temp1 = sum[i];
					sum[i] = sum[j];
					sum[j] = temp1;

					double temp2 = avg[i];
					avg[i] = avg[j];
					avg[j] = temp2;

				}
			}

		}

		for (int i = 0; i < scores.length; i++) {
			System.out.println(rank[i] + "\t" + name[i] + "\t" + scores1[i]
					+ "\t" + scores2[i] + "\t" + scores3[i] + "\t" + scores4[i]
					+ "\t" + scores5[i] + "\t" + scores6[i] + "\t" + sum[i]
					+ "\t" + (int) avg[i]);

		}

	}
}
