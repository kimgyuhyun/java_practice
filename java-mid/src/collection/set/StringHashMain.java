package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int)charA);
        System.out.println("charB = " + (int)charB);

        // hashCode
        System.out.println("hashCode(\"A\") = " + hashCode("A"));
        System.out.println("hashCode(\"A\") = " + hashCode("B"));
        System.out.println("hashCode(\"A\") = " + hashCode("AB"));

        // hashIndex
        int hashCode = hashCode("A"); // 65를 반환해서 hashCode 에 저장
        int hashIndex = hashIndex(hashCode); // 65를 hashIndex 에 전달하면 해시 인덱스를 반환
        System.out.println("hashIndex = " + hashIndex); // 65 % 10 = 5

        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String str) {
        // 65 + 66
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum = sum + (int) c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
