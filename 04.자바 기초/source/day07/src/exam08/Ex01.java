package exam08;

import exam02.Calculator;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Calculator cal = out.method(30);
        int result = cal.add(10, 20);
        System.out.println(result);

        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        int[] odds = Arrays.stream(nums).filter(x -> x % 2 == 1).toArray(); // 람다식
    }
}
