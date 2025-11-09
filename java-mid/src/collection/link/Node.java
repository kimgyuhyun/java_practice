package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    // IDE 생성 toString
//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }


     // [A->B->C]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); // 루프에서 문자를 더할때는 StringBuilder
        Node x = this; // x01
        sb.append("[");
        while (x != null) { // x가 null 이 아니면 반복
            sb.append(x.item);
            if (x.next != null) { // x.next 가 null 이 아니면 -> 연결
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
