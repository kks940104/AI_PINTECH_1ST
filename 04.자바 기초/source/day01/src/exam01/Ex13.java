package exam01;

public class Ex13
{
    public static void main(String[] args)
    {
        double num1 = 10.123;
        int num2 = (int) num1; // 명시적 형변환
        System.out.println(num2); // 실수 -> 정수로 변환되기에 소수점이 사라짐.
    }
}
