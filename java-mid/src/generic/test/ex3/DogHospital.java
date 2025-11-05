package generic.test.ex3;

import generic.animal.Dog;

public class DogHospital {
    private Dog animal;

    public void set(Dog animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public Dog bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal : target;
        // 객체에 있는 animal 과 매개변수에 인자로 전달된 target 을 비교해서
        // 조건식이 true = animal 이 더 크면 animal 을 반환
        // 조건식이 false = animal 이 작으면 target 을 반환
    }

}
