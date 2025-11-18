package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {


    private int currentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1; // 현재 인덱스 < 마지막 인덱스 / 현재 인덱스 증가하다 마지막인덱스에오면 false

    }

    @Override
    public Integer next() {
        return  targetArr[++currentIndex];
    }
}
