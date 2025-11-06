package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> { // Animal 이나 그 자식들만 이 타입 매게변수 T에 들어올 수 있어

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
