package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);
        // Map.of를 쓰면 데이터를 수정할 수 없는 HashMap 을 반환해줌


        Map<String, Integer> result = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) { // map1 의 ke y가 map2에 있으면
                result.put(key, map1.get(key) + map2.get(key));
            }
        }

        System.out.println(result);
    }
}
