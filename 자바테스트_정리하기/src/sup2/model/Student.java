package sup2.model;

public class Student {
//필드
	String 이름;
	int 학년;
	int 반;
	int 번호;
	char 성별;
	double 성적;
//메서드
	
	//기본 생성자
	public Student() {}
	//Setter
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public void set학년(int 학년) {
		this.학년 = 학년;
	}
	public void set반(int 반) {
		this.반 = 반;
	}
	public void set번호(int 번호) {
		this.번호 = 번호;
	}
	public void set성별(char 성별) {
		this.성별 = 성별;
	}
	public void set성적(double 성적) {
		this.성적 = 성적;
	}
	//Getter
	public String get이름() {
		return 이름;
	}
	public int get학년() {
		return 학년;
	}
	public int get반() {
		return 반;
	}
	public int get번호() {
		return 번호;
	}
	public char get성별() {
		return 성별;
	}
	public double get성적() {
		return 성적;
	}
	//필수 생성자
	public Student(String 이름, int 학년, int 반, int 번호, char 성별, double 성적) {
	this.이름 = 이름;
	this.학년 = 학년;
	this.반 = 반;
	this.번호 = 번호;
	this.성별 = 성별;
	this.성적 = 성적;
}
	public void information() {
		
		System.out.println("이름 : " + 이름);
		System.out.println("학년 : " + 학년);
		System.out.println("반 : " + 반);
		System.out.println("번호 : " + 번호);
		String 성별확인 = (성별 == 'M') ? "남자" : "여자" ;
		System.out.println("성별 : " + 성별확인);
		System.out.println("성적 : " + 성적);
	
	}	
	
}

