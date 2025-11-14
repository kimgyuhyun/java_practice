package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>(); // 내 장바구니

    public void add(Product product, int addQuantity) { // 중복 상품이면 개수만 증가
        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        // cartMap 에 상품을 키로 넣고 있으면 기존 value 가 반환 없으면 defaultValue 로 0을 반환
        cartMap.put(product, existingQuantity + addQuantity);
        // 장바구니에 추가할 상품 + 장바구니에 기존 수량 + 추가한 수량이 장바구니에 입력됨
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            // cartMap 에 키값꾸러미를 한쌍씩 entry 에 넣으면서 반복
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }


    public  void minus(Product product, int minusQuantity) {
        int existingQuantity = cartMap.getOrDefault(product, 0);
        // product 를 key 로 넣고 기존값이 있으면 반한 없으면 defaultValue인 0을
        int newQuantity = existingQuantity - minusQuantity;
        if (newQuantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newQuantity);
        }
    }


}
