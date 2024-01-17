package ex12inheritance;

class Burger {
	// 멤버변수
	// 버거명, 가격, 패티, 소스, 야채를 표현
	private String burgerName;
	private int price;
	private String patty;
	private String sauce;
	private String vegetable;
	
	// 인자 생성자
	public Burger(String burgerName, int price, String patty,
			String sauce, String vegetable) {
		super();
		this.burgerName = burgerName;
		this.price = price;
		this.patty = patty;
		this.sauce = sauce;
		this.vegetable = vegetable;
	}

	// getter : price만 필요
	public int getPrice() {
		return price;
	}
	
	public void burgerInfo() {
		System.out.println(burgerName);
		System.out.println("가겨은: " + price);
		System.out.printf("식재료는 %s, %s, %s", patty, sauce, vegetable);
	}
	
}

public class QuBuyHamburger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
