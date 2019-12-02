package D_array;

public class asdasdasd {

	
	public static void main(String[] args) {
		
		
	
	
		int score [][] = new int [21][6];
		int [] sum = new int [score.length];
		double[] avg = new double[score.length];
		int [] score1 = new int[score.length];
		int [] score2 = new int[score.length];
		int [] score3 = new int[score.length];
		int [] score4 = new int[score.length];
		int [] score5 = new int[score.length];
		int [] score6 = new int[score.length];
		int [] rank = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
		String [] name = new String[]{"김지선","이누리","박종민","정대석","정재영","강현철","주향한","강현지","연은주","이병훈",
				"구한나","박진영","이승재","민태홍","이지형","정보람","김령환","윤창훈","백종빈","이에림","김경운"};
		String []save = new String [21];
		String temp ="";
		int nameSize = name.length;
		
		System.out.println("석차"+ "\t" + "이름" + "\t" + "Java" +"\t" + " Oracle" + "\t" + "HTML" + "\t"
					+"CSS" +"\t" + "JQuery" + "\t" + "JSP" + "\t" + "총점"+"\t" + "평균" );
		

			for (int i = 0; i < name.length; i++) {
				for (int j = i + 1; j < name.length; j++) {

					if (name[i] .compareTo (name[j])>0) {

					}
				}
			}	            
		}
}
