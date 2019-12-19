package i_collection;

import java.util.ArrayList;

public class ArrayListClass {

	private static int[] array;

	public static void main(String[] args) {
		/*
		 * 
		 * 	add()		:마지막에 객체를 추가
		 *  get()		:지정된 위치에 객체를 반환
		 *  set()		:지정된 위치의 주어진 객체를 저장(수정)
		 *  remove()	:지정된 위치의 객체를 제거
		 *  size()		:저장된 객체의 수 반환
		 * 
		 */
		
		ArrayList<Object> list =new ArrayList<Object>();
		
		list.add(10);
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());
		
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		list2.set(1, "456");
		
		for(int i = 0; i < list2.size(); i++){
			System.out.println(list2.get(i));
		}
		
		list2.remove(0);
		//리스트에 저장된 값을 삭제하면 그 뒤의 모든 값의 인덱스가 당겨진다.
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		//2차원 배열
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();
		
		ArrayList<Integer> list4  = new ArrayList<>();
		list4.add(10);
		list3.add(list4);
		list4 = new ArrayList<>();
		list4.add(20);
		list3.add(list4);
		
		for(int i = 0; i < list3.size(); i++){
			System.out.println(list3.get(i));
		}
		
		//정수를 저장할 수 있는 ArrayList 생성해 값을 5번 넣어주세요
		
		ArrayList <Integer> a = new ArrayList<>();
		a.add (1);
		a.add (2);
		a.add (3);
		a.add (4);
		a.add (5);
		
		//위에서 만든 ArrayList에 담긴 값들의 합계와 평균을 출력해주세요.
		int sum = 0;
		for(int i = 0; i < a.size(); i++){
			
				sum += a.get(i);					
		}
		double avg = sum / a.size();
		
		System.out.println("합계 = " + sum + "," + " 평균 = " + avg);
		
		//위에서 만든 ArrayList에 담긴 값들 중 최소값과 최대값을 출력해주세요.

		int min = a.get(0);
		int max = a.get(0);

		for (int i = 0; i < a.size(); i++) {
			if (max < a.get(i)) {
				max = a.get(i);
			} else if (min > a.get(i)) {

				min = a.get(i);
			}

		}
		System.out.println("최대값 =" + max +","+ " 최소값 =" + min);
		
		//위에서 만든 ArrayList의 값을 내림차순으로 정렬해주세요.
		
		
		
		for (int i = 0; i < a.size() - 1; i++) {
			for (int j = i + 1; j < a.size(); j++) {

				if (a.get(i) < a.get(j)){

					int temp = a.get(i);
					a.set(i, a.get(j));
					a.set(j, temp);

				}
			}
		}
		System.out.println(a);
	}
	
	
}




