
public class Shop {
	public Long orderNum;
	public String orderId;
	public String orderDate;
	public String orderName;
	public String productNum;
	public String address;
	
	public void prn() {
		System.out.println("주문 번호 : "+orderNum);
		System.out.println("주문자 아이디 : "+orderId);
		System.out.println("주문 날짜 : "+orderDate);
		System.out.println("주문자 이름 : "+orderName);
		System.out.println("주문 상품 번호 :"+productNum);
		System.out.println("배송 주소 : "+address);
	}
}
