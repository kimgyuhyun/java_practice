package collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        Map<String, Integer> map = new HashMap<>();


        String[] words = text.split(" ");

        for (String word : words) {
            Integer count =  map.get(word); // word 를 넣으면 값이 나올테고 그 값은 각각의 단어의 개수임
            if (count == null) { // 만약 count 가 null 이면
                count += 0; // count 0으로 초기화
            }
            count++; // null 이 아니면 1++하면서
            map.put(word, count); // map 에 word 와 count 를 추가함
            // orange 기준으로하면 orange 를 키로 넣으면 null 이 나오고 count 에 저장됨
            // 다음 조건문에서 count 가 null 이면 0으로 초기화를해줌 즉, 처음 입력하는 단어면 0으로 초기화하고 내보냄
            // 그 다음 count++를 추가하면서 map 에 처음 문자를 추가함
            // null 이 아니면 조건문 건너뛰고 계속 카운트 추가하면서 map 에 값추가하는것
        }

        System.out.println(map);
    }
}
