package com.kh.jabaAPIEx;

public class StringPre {
	// subString : index(0) 0~ 끝까지 출력
	// split : 문자열을 문자배열에 정해진 출력방법을 통해 값전달
	// toUpperCase : 문자열.toUpperCase 문자열 대문자변환
	// toLowerCase : 문자열.toLowerCase 문자열 소문자변환
	// replace : 문자열.replace("a","b") a문자열을 b문자열로 변환
	// charAt : 문자열.charAt(index) index 번호의 문자'' 출력
	public static void main(String[] args) {
		// subString 메서드를 사용해서 문자열의 일부를 Today 추출
		String 문제1 = "Today is a beautiful day.";
		String 정답1 = 문제1.substring(0, 5);
		System.out.println(정답1);
		// toUpperCase 메서드를 사용해서 모두 대문자로 변환
		String 문제2 = "Programming is fum and challenging";
		String 정답2 = 문제2.toUpperCase();
		System.out.println(정답2);
		// ex) Programming만 대문자로 뒤에는 정상적으로 출력
		String 정답_2 = (문제2.substring(0,11).toUpperCase() + 문제2.substring(11));
		System.out.println(정답_2);
		// toLowerCase 메서드를 사용해서 모두 소문자로 변환
		String 문제3 = "Learning new things is exciting";
		String 정답3 = 문제3.toLowerCase();
		System.out.println(정답3);
		// split 활용해서 문자열을 " " 로 구분하기
		String 문제4 = "A good medicine tastes bitter";
		String[] 정답4 = 문제4.split(" ");
//		System.out.println(정답4[0]);
//		System.out.println(정답4[1]);
//		System.out.println(정답4[2]);
//		System.out.println(정답4[3]);
//		System.out.println(정답4[4]);
		for(String str : 정답4) {
			System.out.println(str);
		}
		// replace 활용해서 more을 less로 대체
		String 문제5 = "The more, the better";
		String 정답5 = 문제5.replace("more", "less");
		System.out.println(정답5);
		// charAt을 사용해서 6번째 글자를 가져오기 
		String 문제6 = "walls have ears";
		char 정답6 = 문제6.charAt(6);
		System.out.println(정답6);
		// subString 메서드를 사용해서 his부터 ~ 끝까지 추출
		String 문제7 = "Every dog has his day";
		String 정답7 = 문제7.substring(14);
		System.out.println(정답7);
	}
}
