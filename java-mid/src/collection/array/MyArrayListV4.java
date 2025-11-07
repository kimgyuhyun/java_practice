package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E e) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    // 코드 추가
    public void add(int index, E e) {
        if (size == elementData.length) {
            grow();
        }

        // 데이터 이동
        shiftRightFrom(index); // index 로 부터 오른쪽으로 이동시키겠단 뜻
        elementData[index] = e;
        size++;
    }

    // 코드 추가, 요소의 마지막부터 index 까지 오른쪽으로 밁
    private void shiftRightFrom(int index) {
        for (int i = size; i > index ; i--) { // index 0 size 4로 가정 4 3 2 1 4번 반복
            elementData[i] = elementData[i-1];
            // [4] = [4-1] : [4] = [3] 3번째 인덱스 데이터를 4번째 인덱스로 욺김
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
        // 기존 배열을 기반으로 새로운 길이의 열을 만들어 값을 복사해줌
    }

    @SuppressWarnings("unchecked") // 메서드에 대한 경고 억제
    public E get(int index) {
        return (E) elementData[index];
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return  oldValue;
    }

    public E remove(int index) {
        E oldValue = get(index);
        shiftLeftFrom(index);

        size --;
        elementData[size] = null; // [array, a, b, c, null] 에서
        // 왼쪽으로 다 욺긴 상태면 [a, b, c, c, null]이 됨 위에서 size --를해서 4에서 3이된 상태일텐데
        // 0 1 2 3 해서 c 자리를 null 로 바꿔주면 하나씩 떙겨지고 뒤에도 다 null 로 바뀜
        // [a, b, c, null, null] 이 됨
        return oldValue;
    }

    // 코드 추가 요소의 index 부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) { // index 3, size 5 -> i: 3
            elementData[i] = elementData[i + 1];
            // [3] = [3+1] : [3] = [4] → 4번째 인덱스의 값을 3번째 인덱스의 값에 넣음
            // 3번째 인덱스의 값은 삭제되고, 그 자리는 뒤(4번째 인덱스)의 값으로 채워짐
            // 즉, [3]가 사라지고 [4]가 앞으로 땡겨짐 size 도 삭제된 개수만큼 줄음
        }
    }

    public int indexOf(E o) {
        for (int i = 0; i <size ; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        // [1, 2, 3, null, null] // size 3
        // [1, 2, 3] // size 3
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size=" + size + ", capacity=" + elementData.length;
    }
}
