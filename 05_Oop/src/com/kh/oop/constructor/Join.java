package com.kh.oop.constructor;
// 1. 회원가입
public class Join {/*접근제한자 : public (모든접근허용) > protected (같은 패키지,상속관계) > default (같은 패키지) > private (같은 클래스)*/
	// 필드 회원번호 아이디 이름 연락처  
	public int memberNo;//회원가입한 순서
	public String memberId;//회원이 작성한 아이디 
	public String memberName;
	public String phonNumber;
	// 기본 생성자 : 필수로 아무것도 넣지않은 생성자
	public Join() { 
		
	}
	// 필수 생성자
	public Join(int memberNo, String memberId, String memberName, String phonNumber) {
//		이것은 필드에 있는 memberNo에 = 나중에 작성한 memberNo를 넣겠습니다.
					this.memberNo = memberNo; // 회원 번호
					this.memberId = memberId; // 회원 아이디
					this.memberName = memberName; // 회원 이름
					this.phonNumber = phonNumber; // 회원 번호
	}
	// 메서드 = 클래스 안에 존재하고, 특정 기능을 할 수 있도록 묶어놓은 코드 모음
		//void 메서드 : 결과를 전달하지 않음
	public void memberInfo() {
		System.out.println("회원번호 : " + memberNo);
		System.out.println("회원I D : " + memberId);
		System.out.println("회원이름 : " + memberName);
		System.out.println("회원번호 : " + phonNumber);
		System.out.println("====================");
	}
	
	//메인 메서드
	public static void main(String[] args) {
		System.out.println("=== kh 쇼핑 회원 정보 확인 ===");
		Join member1 = new Join();
		member1.memberId = "직장인";
		member1.memberName = "차명준";
		member1.phonNumber = "010-0000-0000";
		member1.memberInfo();
		Join member2 = new Join();
		member2.memberId = "학생휴먼";
		member2.memberName = "길똥이";
		member2.memberInfo();
		// 회원가입할 때 필수로 작성해야 하는 필수 작성이 생김
		Join member3 = new Join(3,"허약그자체","둘리","010-1549-8654");
		member3.memberInfo();
		//member4 
		//member4 기본 생성자로 회원가입 완성
		//멤버번호 이름작성 info 출력 
		Join member4 = new Join();
		member4.memberNo = 4;
		member4.memberName = "블랙아담";
		member4.memberInfo();
		//member5 
		//member5 필수 생성자로 회원가입 완성
		//member5 info();
		//5 "슈퍼맨 
		Join member5 = new Join(5,"슈퍼맨","딘 케인","010-1938-1932");
		member5.memberInfo();
		
	}
}
