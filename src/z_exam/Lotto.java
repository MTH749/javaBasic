package z_exam;

public class Lotto {

	public static void main(String[] args) {
		int[] L = new int [45];
		for(int i = 0 ; i < L.length; i ++){
			L [i] = i +1;
		}int temp = 0;
		 int j =0;
		for(int i = 0; i < 100; i++){
			
			j  = (int)(Math.random()*45);
			temp = L[0];
			L[0] = L[j];
			L[j] = temp;
		}
		
		for(int i = 0; i < 6; i++){
			
			System.out.print(L[i] + " ");
		}
		
	}
	 
}
