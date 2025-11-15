package collection.deque.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistoryTest {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("youtube");
        stack.push("google");
        stack.push("facebook");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
