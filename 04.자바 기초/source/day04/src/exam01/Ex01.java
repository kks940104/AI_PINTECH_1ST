package exam01;

public class Ex01
{
    /**
     * main 함수는 프로그램을 시작해 주는 함수
     * @param args
     */
    public static void main(String[] args) // void - 반환값이 없을 때 사용. 보통 이벤트 발생할 때 사용한다.
    {
//        int num1 = 10;
//        int num2 = 20;
//        int result = add(num1, num2);
//        System.out.println(result);

        int result1 = add(10,20);
        System.out.println(result1);

        int result2 = add(10,20,30);
        System.out.println(result2);
    }
    static int add(int num1, int num2)
    {
        return num1 + num2;
    }

    static int add(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }
}
