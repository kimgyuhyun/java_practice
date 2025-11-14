package collection.map.test;

import java.util.*;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA",  "30000"}};
        Map<String, Integer> productMap = new HashMap<>();
        for (String[] product : productArr) { // 모든 인덱스를 순호하면서 String[] 배열에 넣음
            productMap.put(product[0], Integer.valueOf(product[1]));
        }

        for (String key : productMap.keySet()) {
            System.out.println("제품: " + key + ", 가격: " + productMap.get(key));
        }

    }
}

/*
    내 코드
   for (int i = 0; i < productArr.length; i++) {
            String[] product = (productArr[i]);
            String key = product[0];
            int value = Integer.parseInt(product[1]);
            map.put(key, value);
        }

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("제품: " + key + ", 가격: " + value);
        }
 */
