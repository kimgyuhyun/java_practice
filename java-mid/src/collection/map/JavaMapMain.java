package collection.map;

import java.util.*;

public class JavaMapMain {

    public static void main(String[] args) {
        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());
    }

    private static void run(Map<String, Integer> map) {
        System.out.println("map = " + map.getClass());
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet(); // Key 꾸러미를 Set 형태로 꺼내서 저장
        Iterator<String> iterator = keySet.iterator(); // Set 은 인덱스가 없으므로 반복문을 돌릴수있게 iterator 에 세팅
        while (iterator.hasNext()) { // 다음 요소가있으면 계속 반복
            String key = iterator.next(); // 다음 요소를 실제로 가져옴
            System.out.print(key + "=" + + map.get(key) + "");
        }

        System.out.println();
    }
}
