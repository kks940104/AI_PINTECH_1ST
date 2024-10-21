package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Grape()); // 다른 객체 들어갈 수 있음.


        Object _apple = appleBox.getItem(); // 타입 안정성이 떨어짐.
        if(_apple instanceof Apple)
        {
            Apple apple = (Apple)_apple;
        }
    }
}
