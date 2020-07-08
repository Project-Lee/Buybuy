package Buybuy;

import TestFile.Buy;
import TestFile.Computer;
import TestFile.Tv;

public class Main {

	public static void main(String[] args) {
		Tv t = new Tv(); // 100만원
		Computer c = new Computer(); // 200만원
		Buy b = new Buy();
		
		b.setMoney(500); // 주머니속 돈 : 500만원
		b.Buyer(t);
		b.Buyer(t);
		b.Buyer(t);
		b.Buyer(c); // 여기까지 딱 500만원
		b.Buyer(c); // 구매안됨 (구매가 안되니 구매목록에도 안담김)
		
		b.wallet(); // 잔금 확인
		b.list(); // 구매목록 확인

	}

}
