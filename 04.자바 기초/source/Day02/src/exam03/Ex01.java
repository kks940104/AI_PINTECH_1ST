package exam03;

public class Ex01
{
    public static void main(String[] args)
    {
        int num = 0, total = 0; // 동일 자료형이면 나열식으로 변수 선언과 초기화 가능.
        while(num <= 100)
        {
            total += num;
            num++;
        }
        System.out.println(total);
    }
}