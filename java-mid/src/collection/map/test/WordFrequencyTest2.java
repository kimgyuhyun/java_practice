package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        Map<String, Integer> map = new HashMap<>();


        String[] words = text.split(" ");

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) +1);
            // key 는 word 를 넣고 value 부분에는 map.getOrDefault()에 word 를 넣어보고 없으면 0을 반환
            // 있으면 그 값에 +1을 한다음 map 에 추가
        }

        System.out.println(map);
    }
}
