package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }
        System.out.println("출력");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if(i < numbers.size() -1) { // i 보다  numbers.size -1 이 크면 true 반복
                System.out.print(", "); // numbers.size -1 하면 마지막 인덱스인데 마지막이면 , 안찍는다는뜻
            }
        }
    }
}
