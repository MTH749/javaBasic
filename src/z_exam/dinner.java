package z_exam;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class dinner {

	public static void main(String[] args) {
ArrayList<String> dinner = new ArrayList<>();
		
		dinner.add("김밥집");
		dinner.add("국밥");
		dinner.add("바로그집");
		dinner.add("부대찌개");
		dinner.add("다수결");
		dinner.add("국수");
		
		
		Random random = new Random();
	
		System.out.println("오늘 먹을 메뉴는 ?");
		
		
		int randomIndex 
	    = ThreadLocalRandom.current().nextInt( dinner.size());
	System.out.println( " 오늘은 " +  dinner.get( randomIndex ) );
    }

	}


