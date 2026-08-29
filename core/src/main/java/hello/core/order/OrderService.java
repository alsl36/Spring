package hello.core.order;

public interface OrderService {

    //클라이언트에서 바로 Order entity를 만드는 것이 아니라 OrderService라는 인터페이스를 활용해서
    //Order를 만들어 줌으로써 중간 로직 처리나 보안적으로 안정적인 구조 가능
    Order createOrder(Long memberId, String itemName, int itemPrice);
    
}
