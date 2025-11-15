package collection.deque.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> history = new ArrayDeque<>();
    private String currentPage = null; // 현재 페이지

    public void visitPage(String url) {
        if (currentPage != null) { // 현재 페이지가 null 이 아니면 즉, 값이 있으면
            history.push(currentPage); // 방문 기록에 추가
        }
        currentPage = url; // 현재 페이지가 null 이면 url 을 현재 페이지에 추가
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if (!history.isEmpty()) { // history 가 비어있지 않으면 즉, 방문 기록이 있으면
            currentPage = history.pop(); // 가장 나중에 넣은 페이지 = 가장 최근에 방문한 페이지를 현재 페이지에 넣음
            System.out.println("뒤로 가기: " + currentPage);
            return currentPage;
        }
        return null;
    }
}
