package exam05;

public class Outer {

    int num1 = 10;

    class Inner{ // 인스턴스 내부 클래스
        static int num; // JDK 16 이후 가능. JDK 15 이전 불가

        int num1 = 20;

        void method() {
            System.out.println(num1); // Inner - num1
            System.out.println(Outer.this.num1); // Outer - num1
        }
    }
}
