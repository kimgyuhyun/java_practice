package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        GenericMethod.objectMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        // 제네릭 메서드에 원하는 타입을 타입 인자로 전달하면 타입 매개변수에 전달되서
        // 제네릭 메서드에 리턴타입과 매개변수타입이 전달된 인자로 변경됨
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        // 타입 추론, 타입 인자 생략
        System.out.println("타입 추론");
        Integer result1 = GenericMethod.genericMethod(i);
        Integer integerValue1 = GenericMethod.numberMethod(10);
        Double doubleValue1 = GenericMethod.numberMethod(20.0);


    }
}
