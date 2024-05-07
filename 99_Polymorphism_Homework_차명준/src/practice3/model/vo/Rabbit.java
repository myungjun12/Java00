package practice3.model.vo;

public class Rabbit extends Animal{
//필드
	private int weight;
	private String color;
//메서드
	//Setter
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//Getter
	public int getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
	//기본 생성자
	 public Rabbit() {
	}
	//필수 생성자 art shift s o 선택한다음 부모클래스에 있는 필드 추가 super()
	public Rabbit(String name, String kinds, int weight, String color) {
		super(name, kinds);
		this.weight = weight;
		this.color = color;
	}
	@Override
		public void speak() {//부모클래스 메서드 super.toString
			System.out.println(super.toString() + " 토끼의 무게 " + weight + "kg 색깔은 " + color);
		}
	 
}
