package exam04;

public class Ex01 {
    public static void main(String[] args) {
        //Box<Apple> appleBox = new Box<Apple>(); // 타입을 Apple로 명시
        Box<Apple> appleBox = new Box<>(); // 앞에 Type을 확인하여 예측 가능한 부분이기에 뒤에 <> 생략 가능.
        appleBox.setItem(new Apple());

        Apple apple = appleBox.getItem(); // 형변환이 필요없음.


        //Box<Grape> grapeBox = new Box<Grape>();
        //Box<Grape> grapeBox = new Box<>(); // 해당 부분도 마찬가지.
    }
}
