package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();


    public void add(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : items) { //iter 향상된 for 문
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
            
        }

        System.out.println("전체 가격 합: " + calculateTotalPrice()); // ctrl + n 변수 인라인화
    }

    private int calculateTotalPrice() { // ctrl + alt + m 메서드로 변경
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
