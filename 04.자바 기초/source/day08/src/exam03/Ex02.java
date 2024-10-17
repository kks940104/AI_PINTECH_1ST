package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Human human = new Human(); // Human, Object
        Bird  bird = new Bird(); // Bird, Object
        Tiger tiger = new Tiger(); // Tiger, Object

        Object[] animal = new Object[3];
        animal[0] = human;
        animal[1] = bird;
        animal[2] = tiger;
    }
}
