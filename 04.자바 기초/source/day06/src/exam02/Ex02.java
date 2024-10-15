package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Animal[] animals = { new Tiger(), new Bird(), new Human() };
        for (Animal animal : animals){ // 업캐스팅
            animal.move();
            if (animal instanceof Human) {
                Human human = (Human) animal; // 다운캐스팅
                human.reading();
            } else if (animal instanceof Bird bird) { // 최근에 추가된 문법. 바로 캐스팅.
                bird.singing();
            } else if (animal instanceof Tiger tiger) {
                tiger.hunting();
            }
        }
    }
}