package Buybuy;

public class Product {
	private String name;
	private int price;
	
	// private 걸린 멤버필드 name 과 price에 값을 넣어주는 '생성자'
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	// 중요!!! 아주신기한 현상
	// Product 클래스 toString() 메소드와 <--> Buy 클래스 Buyer() 메소드
	// 와 상호작용함 현재까지 알기로는 System.out.println 에서 println이 오버라이딩??
	// 아직 자세힌 모르지만 좀더 완벽하게 이해하고 넘어갈 필요가 있음
	@Override
	public String toString() {
		return String.format("%s 구매 (%s 만원)",this.name
				,this.price);
	}
}
