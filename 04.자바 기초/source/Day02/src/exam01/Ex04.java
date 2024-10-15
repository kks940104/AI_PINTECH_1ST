package exam01;

public class Ex04
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = num1++; // 대입하게 될 경우 (=) -> 증가연산(++) 대입 후 ++하게됨.
        int num3 = ++num1; // 대입하게 될 경우 (=) -> 증가연산(++) ++후 대입하게 됨.
        // 차이점은 연산자 우선순위 차이. --도 동일
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
