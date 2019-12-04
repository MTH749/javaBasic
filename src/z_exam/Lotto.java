package z_exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import D_array.Array;

public class Lotto {

	public static void main(String[] args) {
		
		
		int [] lo = new int [45];
		
		for(int i = 0; i <lo.length; i++) {
			lo[i] = i + 1;
	
		}
		int temp = 0;
		int dice = 0;
		
		
		for(int i = 0 ; i < 100; i++){

			dice= (int)(Math.random()*45);  
				
				temp = lo[0];
				lo[0] = lo[dice];
			 	lo[dice] = temp;
		}	 	
		
		for(int i =0; i < 6 ; i++){
			
		System.out.println("행운번호  "+ lo[i]);
	 	
		}	 	
		
	}
}					
	


