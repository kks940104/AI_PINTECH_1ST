package exam01;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        // 문자열 -> Enum 상수 객체
        //Transportation trans = Enum.valueOf(Transportation.class, "SUBWAY");
        //System.out.println(trans);

        // Enum 자체에서 가지고오는게 아니라 Transportation가 Enum 그 자체니까 바로 가지고오는 방식.
        Transportation tans = Transportation.valueOf("SUBWAY");
        System.out.println(tans);

        // Transportation에 정의된 상수 목록
        Transportation[] items = Transportation.values();
        System.out.println(Arrays.toString(items));
    }
}
