package generic.ex4;

public class GenericMethod {

    public static Object objectMethod(Object obj) {
        System.out.println("Object Print: " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t) { // 제네릭 메서드는 반환타입 앞에 <T>를 선언해야함
        System.out.println("Generic Print: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) { // 타입 매게변수 제한도 가능
        System.out.println("bound Print: " + t);
        return t;
    }
}
