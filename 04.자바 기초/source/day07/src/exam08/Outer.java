package exam08;
import exam02.Calculator;

public class Outer {


    Calculator method(int num3){ // 매개변수는 다 상수로 변함. -> 상수는 데이터영역 메모리
        // 익명 내부 클래스
        return new Calculator() {
            @Override
            //num3 = 20; // final num3 ... 지역 변수의 상수화, 제거 되지 않고 유지하기 위해서.
            public int add(int num1, int num2) {
                return num1 + num2 + num3;
            }
        };
    }
}