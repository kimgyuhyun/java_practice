package collection.array;

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        // 배열의 첫번째 위치에 추가
        // 기존 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 첫번째 위치에 추가
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        // index 위치에 추가
        // 기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 index 위치에 추가
        System.out.println("배열의 index(2) 위치에 4추가 O(n)");
        int index = 2;
        int value = 4;
        addAtIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));

        System.out.println("배열의 마지막 위치에 5추가 O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    private static void addLast(int[] arr, int newValue) {
        arr[arr.length-1] = newValue; // 마지막 인덱스에 값을 넣을때는 데이터를 욺길 필요가없음
    }

    private static void addAtIndex(int[] arr, int index, int value) {
        for (int i = arr.length -1; i > index; i--) { // index 보다 클동안 도는거니 i는 4, 3
            arr[i] = arr[i-1];
            // arr[4] = arr[3] 3번째 인덱스값을 4번으로밈
            // arr[3] = arr[2] 2번쨰 인덱스값을 3번으로밈
            // 이 시점에는 [3, 1, 2, 2, 0]
        }
        arr[index] = value; // arr[2] = 4;
        // [3, 1, 4, 2, 0]
    }

    public static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length -1; i > 0 ; i--) { // i: 4 3 2 1
            arr[i] = arr[i-1];
            // arr[4] = arr[4-1] : arr[4] = arr[3] 3번째 인덱스값을 4번으로밈
            // arr[3] = arr[2] 2번째 인덱스값을 3번째 인덱스로밈
            // arr[2] = arr[1] 1번째 인덱스값을 2번째 인덱스로밈
            // arr[1] = arr[0] 0번쨰 인덱스값을 1번째 인덱스로밈
        }
        arr[0] = newValue; // 0번째 인덱스값을 1번쨰로 밀어놨으니 0번쨰는 빈공간이됨 여기에 newValue 를 넣음
        // 사실 값을 밀때는 복붙같은거라서 newValue 를 넣기전 상황은 [1, 1, 2, 0, 0]임
    }
}
