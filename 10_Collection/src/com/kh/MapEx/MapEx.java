package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

/*
 	┌ 	HashMap		 : 빠른 검색 속도 (가장 많이 사용)
 Map├ 	TreeMap		 : 정렬된 데이터를 필요할 경우 사용
 	└ 	LinkedHashMap: 순서를 유지하면서 저장하기 때문에 순서가 중요한 경우 사용
Map : 특정 키를 입력하면 해당되는 값을 얻을 수 있는 Collection 객체
	키 = key (=열쇠)
	값 = value (= 값어치가 있는 것)
	key:value 값으로 구성

메서드
	put(key, value) 	 : 지정된 키와, 지정된 값의 쌍을 추가
	get(key) 			 : 지정된 키에 저장된 값을 보여줌
	containsKey(key)	 : 지정된 키가 존재하는지 확인
	containsValue(value) : 지정된 값이 존재하는지 확인
	remove(key) 		 : 지정된 키와 키에 저장된 값을 제거
	keySet()			 : 키를 포함하는 집합을 반환
	values()			 : 모든 값들을 포함하는 컬렉션 반환
	entrySet			 : 모든 키-쌍을 포함하는 집합을 반환
 * */
public class MapEx {
	public static void main(String[] args) {
		//Map 생성
		Map<String, Integer> students = new HashMap<>();
		
		//put을 활용해서 값 추가하기
		//   .추가하기(key, value)
		students.put("철수", 90);
		students.put("영희", 85);
		students.put("민수", 88);
		
		//전체보기
		System.out.println(students);
		
		//get을 사용해서 조회하기
		System.out.println("철수의 성적 : " + students.get("철수"));
		
		//remove를 사용해서 삭제하기
		students.remove("영희");
		
		
		//키는 유일해야함 키의 값은 중복이 될 수 없음
		//맨 마지막 값으로 덮어씌워짐 / 철수 90 -> 80
		students.put("철수", 80);
		System.out.println(students);
		
		//학생들 성적 출력하기
		//for - each
		//               
		for(String name :students.keySet()) {
			//각 학생의 성적 조회
			int score = students.get(name);
			System.out.println(name + "의 성적은 : " + score);
		}
		
	}
}
