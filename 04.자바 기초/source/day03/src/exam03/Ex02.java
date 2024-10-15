package exam03;

public class Ex02
{
    public static void main(String[] args)
    {
        int result = calc(3); // 함수호출.
        System.out.println(result);
    }
    static int calc(int x)
    {
        return x * 2 + 3; // 함수종료
    }
}
