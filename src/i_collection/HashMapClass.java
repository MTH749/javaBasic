package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	private static Set<String> keySet;

	public static void main(String[] args) {
		/*
		 * put()		: 지정된 키와 값을 저장
		 * get()		: 지정된 키의 값을 반환(없으면 null)
		 * remove()		: 지정된 키로 저장된  값을 제거
		 * keySet()		: 저장된 모든 키를 Set으로 반환
		 */

		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("title", "제목입니다.");
		map.put("content", "내용입니다");
		map.put("user", "김승섭");
		map.put("date", "2019-12-18 3:43");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));
		
		map.put("user", "홍길동");
		System.out.println(map.get("user"));
		
		map.remove("user");
		System.out.println(map.get("user"));
		
		//map에 저장된 모든 내용 출력
		Set<String>	keys = map.keySet();	
		for(String key : keys){
			String value = map.get(key);
			System.out.println(key + " : " + value);
			
		
			
		ArrayList<HashMap <String,Object>> a = new ArrayList<>();
		
		HashMap<String,Object> hm = new HashMap<>();
		
		hm.put("LPROD_ID", 1);
		hm.put("LPROD_GU", "p101");
		hm.put("LPROD_NM", "컴퓨터제품");		
		a.add(hm);
		
		HashMap<String,Object> hm1 = new HashMap<>();
		
		hm1.put("LPROD_ID", 2);
		hm1.put("LPROD_GU", "p102");
		hm1.put("LPROD_NM", "전자제품");		
		a.add(hm1);
		
		HashMap<String,Object> hm2 = new HashMap<>();
		
		hm2.put("LPROD_ID", 3);
		hm2.put("LPROD_GU", "p201");
		hm2.put("LPROD_NM", "여성캐주얼");		
		a.add(hm2);
		
		HashMap<String,Object> hm3 = new HashMap<>();
		
		hm3.put("LPROD_ID", 4);
		hm3.put("LPROD_GU", "p202");
		hm3.put("LPROD_NM", "남성캐주얼");		
		a.add(hm3);
		
		HashMap<String,Object> hm4 = new HashMap<>();
		
		hm4.put("LPROD_ID", 5);
		hm4.put("LPROD_GU", "p301");
		hm4.put("LPROD_NM", "피혁잡화");		
		a.add(hm4);
		
		HashMap<String,Object> hm5 = new HashMap<>();
		
		hm5.put("LPROD_ID", 6);
		hm5.put("LPROD_GU", "p302");
		hm5.put("LPROD_NM", "화장품");		
		a.add(hm5);
		
		HashMap<String,Object> hm6 = new HashMap<>();
		
		hm6.put("LPROD_ID", 7);
		hm6.put("LPROD_GU", "p401");
		hm6.put("LPROD_NM", "음반/CD");		
		a.add(hm6);
		
		HashMap<String,Object> hm7 = new HashMap<>();
		
		hm7.put("LPROD_ID", 8);
		hm7.put("LPROD_GU", "p402");
		hm7.put("LPROD_NM", "도서");		
		a.add(hm7);
		
		HashMap<String,Object> hm8 = new HashMap<>();
		
		hm8.put("LPROD_ID", 9);
		hm8.put("LPROD_GU", "p403");
		hm8.put("LPROD_NM", "문구류");		
		a.add(hm8);
		
		for(String key1 : a.get(0).keySet()){
			System.out.print(key1 + "\t");
		}
		System.out.println();
		for(int i = 0; i <a.size(); i++){
			HashMap<String,Object>hashMap = a.get(i);
			Set<String> keyset = hashMap.keySet();
			for(String key1 : keyset){
				System.out.print(hashMap.get(key1) + "\t");
			}
			System.out.println();
		}
		
		}
	}

}


















