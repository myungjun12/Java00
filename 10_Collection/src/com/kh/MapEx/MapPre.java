package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapPre {
	//기본 생성자
	public MapPre() {}
	//void 메서드 생성
	public void practice1() {
		//  key      value
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "에그마요");
		map.put(3, "로티세리바베큐");
		map.put(1, "스파이시쉬림프");
		System.out.println(map);
	}
	public void practice2() {
		// 									<> 값을 넣어도되고 안넣어도됨
		Map<String, String> map = new HashMap<>();
		//map.put을 활용해서 학원-서울시 강남구 등산-서울시 관악구 롯데타워-서울시 송파구
		map.put("학원", "서울시 강남구");
		map.put("등산", "서울시 관악구");
		map.put("롯데타워", "서울시 송파구");
		//전체출력
		System.out.println(map);
		//get(key) 사용 롯데타워 찾아 벨류값 출력
		System.out.println(map.get("롯데타워"));
		//remove(key) 키값 등산 찾아 삭제
		map.remove("등산");
		// 등산 삭제후 전체 출력
		System.out.println(map);
		//for-each 
		System.out.println("===================================");
// key값이 String이므로String 참조 keySet사용 전체key값 k변수를 통해 나열
		for(String m : map.keySet()) {
			String 명칭 = map.get(m);
			System.out.println(명칭 + "-" + m);
		}
		//entry사용 전체 키값 + 벨류값 나열
		System.out.println(map.entrySet());
	}
	
	public void practice3() {
		//특정 값이 존재하는지 확인
		//String Integer 과일 - 가격
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 100);
		map.put("바나나", 200);
		map.put("체리", 300);
		
		// contains key,value
		// 200원 짜리 과일이 존재하는가 ? 
		System.out.println("200원 과일이 존재하는가 ? " + map.containsValue(200));
		//containsValue true false로 값이 보여짐
		
		// 체리 과일이 존재하는가 ?
		System.out.println("체리 과일이 존재하는가 ? " + map.containsKey("체리"));
		
		// 크기 조회
		System.out.println("현재 map의 크기 : " + map.size());
	}
	
	public void practice4() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "에그마요");
		map.put(2, "로티세리바베큐");
		map.put(3, "스테이크앤치즈");
		map.put(4, "스파이시쉬림프");
		//key = 3 에 값 확인
		System.out.println(map.get(3));
		//size로 메뉴가 몇개인지 확인
		System.out.println(map.size());
		//remove로 4번 삭제
		map.remove(4);
		//isEmpty() 맵이 비었나 확인
		System.out.println(map.isEmpty());
		//keySet사용 모두보기
		for(Integer m :map.keySet()) { // value값 = map.get(key)  
			System.out.println(m + "번 메뉴 : " +map.get(m));
		}					//map.keySet의 key값 변수 m을 통해 나열
		System.out.println("=================================");
		//Map.Entry 키-값을 동시에 가져오는 방법
		for(Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + "-" + e.getValue());
		}
		
		//전체 삭제
		map.clear();
		// 맵이 비었는지 확인
		System.out.println(map.isEmpty());
	}
	//최종 메인 메서드
	public static void main(String[] args) {
		MapPre mp = new MapPre();
//		mp.practice1();
//		mp.practice2();
//		mp.practice3();
		mp.practice4();
				
	}
}
