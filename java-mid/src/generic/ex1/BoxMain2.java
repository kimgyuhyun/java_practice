package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10); // 저장
//        Object object = objectBox.get(); // 객체애서 값을 꺼내오고 변수에 저장
//        Integer integer = (Integer) object; // Integer 로 다운캐스팅해서 타입을 맞춘뒤 변수에 저장
        Integer integer = (Integer) integerBox.get(); //  Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); // Object -> String 캐스팅
        System.out.println("str = " + str);

        //잘못된 타입 인수 전달시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외
        System.out.println("result = " + result);
    }
}
