package collection.link;

public class NodeMain1 {

    public static void main(String[] args) {
        // 노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색하기");
        Node x = first;
        while (x != null) { // null 이 아니면 반복
            System.out.println(x.item); // 아이템 출력
            x = x.next; // x에는 다음 노드에 참조값을 넣어줌
        }
    }
}
