package com.kh.ListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
    ┌ Vector : Java1 버전 대에서 제일 먼저 등장해서 사용된 것
List├ LinkedList : 검색에는 부적합 데이터 삽입과 삭제에는 좋음
 	└ ArrayList : 검색에 좋음 데이터 삽입과 삭제가 빈번한 경우 부적합
 	
 * */                       
public class ListPre {         

	//기본 생성자
	public ListPre() {}
	//void : vector
	public void VectorEx() {
		
//		List<String> vector = new Vector<>(); 이렇게 사용해도 되지만 아래 사용 권장
		Vector<String> vector = new Vector<>();
		vector.add("자바");
		vector.add("파이썬");
		vector.add("C");
		System.out.println(vector);
	}
	
	public void LinkedEx() {
//		List<String> LinkedList = new LinkedList<>();
		LinkedList<String> LinkedList = new LinkedList<>();
		LinkedList.add("말");
		LinkedList.add("호랑이");
		LinkedList.add("송아지");
		System.out.println(LinkedList);
	}
	
	public void ArrayEx() {
		ArrayList<String> ArrayList = new ArrayList<>();
		ArrayList.add("사과");
		ArrayList.add("바나나");
		ArrayList.add("포도");
		System.out.println(ArrayList);
	}
	
	public static void main(String[] args) {
		ListPre li = new ListPre();
		li.VectorEx();
		li.LinkedEx();
		li.ArrayEx();
	}
}                              
                               