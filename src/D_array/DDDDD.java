package D_array;

import java.util.Arrays;

public class DDDDD {

	public static void main(String[] args) {
		//0번 인덱스의 값과 랜덤 인덱스의 값을 서로 교환한다
		int [] shuffle = new int [20];
		for(int i = 0; i < shuffle.length; i++ ){
			
				shuffle[i] += i +1 ;
		}		
		for(int i = 0; i < shuffle.length; i++ ){
			
				int random = (int)(Math.random()*20) + 1;				
				
				int temp  =  shuffle[0];
				shuffle [0] = shuffle[random];
				shuffle [random] = temp;
			
		}
		
		
		}
	}

