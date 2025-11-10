package collection.list;

public class MyLinkedList<E> implements MyList<E> {

    private Node<E> first;
    private int size = 0;

    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x; // x.next = null 이면 현재 위치 반환
    }

    @Override
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) { // 첫번째 자리에 추가할 시
            newNode.next = first; // 새로운 노드에 next 를 기존 first 랑 연결
            first = newNode; // first 앞에 새로 추가된 노드를 first 에 연결해서 바꿔줌
        } else {
            Node<E> prev = getNode(index -1); // 직전 노드인 prev 노드를 찾기
            newNode.next = prev.next; // 노드를 중간에 끼어넣어야하니 새 노드에 next 에 직전 노드에 next 를 넣음
            prev.next = newNode; // 그 다음 직전 노드에 next 에 새 노드를 넣음
        }
        size++;
    }

    @Override
    public E set(int index, E element) {
        Node<E> x =  getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    @Override
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removeItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next; // first 에 삭제할 노드에 next 를 넣음
        } else {
            Node<E> prev = getNode(index -1);
            prev.next = removeNode.next; // 직전 Node.next 에 삭제할 노드에 next 를 넣음
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;
    }

    @Override
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
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

    private static class Node<E> { // static 중첩 클래스

        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }



        // [A->B->C]
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(); // 루프에서 문자를 더할때는 StringBuilder
            Node<E> x = this; // x01
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
}
