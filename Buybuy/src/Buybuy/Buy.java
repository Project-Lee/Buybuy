package Buybuy;

import java.util.ArrayList;
import java.util.List;



public class Buy {
	// <Product> 클래스 name,price 을 담을 arr 리스트 
		private List<Product> arr = new ArrayList();
		
		private int money;
		private String name = "재용손님";
		
		
		public Buy() {
			init();
		}
		
		// 의미는없지만 init 사용을 해본것 (생성자에 메소드를 넣을수도있다)
		// Buy 클래스가 생성되면 재용손님 가게입장 문구 뜨게하는 메소드 
		public void init() {
			System.out.println(this.name + "이 가게에 입장했습니다");
		}
		
		// 내가 돈 얼마 가질지 입력해주는 셋터메소드
		public void setMoney(int money) {
			this.money = money;
		}
		
		public void Buyer(Product p) {
			int result = p.getPrice() - money;
			if(money < p.getPrice()) {
				System.out.println("잔액이 " + result + "만원 부족합니다");
			} else {
				
				// arr.add에 주소값으로 구매한 목록을 하나하나 담는다
				// 잔액이 부족할경우 '구매목록'에 담지않음
				arr.add(new Product(p.getName(),p.getPrice()));
				System.out.println(p.getName() + "을 구매했습니다");
				money -= p.getPrice();
			}
		}
		
		// 현재 내지갑 잔고확인하는 wallet 메소드
		public void wallet() {
			System.out.println("현재잔액 : " + money + "만원");
		}
		
		// 여태 구매한 목록을 보여주는 list 메소드
		// 잔금(money)가 부족한경우 구매목록에 담지않는다  
		// 위에 Buyer 메소드 내용 확인하면 알수있음
		public void list() {
			for(int i=0; i<arr.size(); i++) {
				System.out.printf("%d.\t %s\n",i+1,arr.get(i));
			}
		}
}
