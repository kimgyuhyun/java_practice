package collection.link;

public class MyLinkedListV2 {

    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x; // x.next = null 이면 현재 위치 반환
    }

    // 추가 코드
    public void add(int index, Object e) {
        Node newNode = new Node(e);
        if (index == 0) { // 첫번째 자리에 추가할 시
            newNode.next = first; // 새로운 노드에 next 를 기존 first 랑 연결
            first = newNode; // first 앞에 새로 추가된 노드를 first 에 연결해서 바꿔줌
        } else {
            Node prev = getNode(index -1); // 직전 노드인 prev 노드를 찾기
            newNode.next = prev.next; // 노드를 중간에 끼어넣어야하니 새 노드에 next 에 직전 노드에 next 를 넣음
            prev.next = newNode; // 그 다음 직전 노드에 next 에 새 노드를 넣음
        }
        size++;
    }

    // 추가 코드
    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removeItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next; // first 에 삭제할 노드에 next 를 넣음
        } else {
            Node prev = getNode(index -1);
            prev.next = removeNode.next; // 직전 Node.next 에 삭제할 노드에 next 를 넣음
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;
    }

    public Object set(int index, Object element) {
        Node x =  getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
