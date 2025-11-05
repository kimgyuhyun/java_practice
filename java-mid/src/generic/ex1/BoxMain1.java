package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox(); // 객체 생성
        integerBox.set(10); // 오토 박싱에 의해 int 가 Integer 로 자동변환
        Integer integer = integerBox.get(); // 객체에 저장한 값을 get 메서드 호출해서 변수에 저장
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }
}
