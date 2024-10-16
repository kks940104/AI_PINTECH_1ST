package exam03;

public interface Buyer {
    int NUM = 10; // Static 상수. public static final 이 자동으로 붙음.

    int nul1 = 0;

    void buy();
    default void order(){ // JDK 7버전 이상부터
        System.out.println("Buyer - 주문");
        privateMethod();
    }

    private void privateMethod() { // JDK 9버전 이상부터
        System.out.println("private 메서드");
    }

    static void staticMethod() { // public
        System.out.println("static 메서드");
    }
}
