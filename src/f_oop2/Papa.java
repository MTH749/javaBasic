package f_oop2;

public class Papa extends Son{
	
	public static void main(String[] args) {
		
		Son s = new Son();
		Papa p = new Papa();
		int hr1 = p.hr(6, 7);
		System.out.println(s.hr(15, 13));
		System.out.println(s.hr(14, 15));
		System.out.println(hr1);
		System.out.println("sonA :  " + s.b);
		
		System.out.println();
	}
	
		int hr (int a, int b){
		
			return a * b;
			
		}
		
	}


