package exam01;

public class Ex03
{
    public static void main(String[] args)
    {
        int num1 = 10;
//        num1++; // ++ -> + 1 증가.
//        num1++;
        //++num1; // +1 증가 ++위치에 따른 차이점은 대입했을 때 구분.
        int num2 = num1++;
        int num3 = ++num1;
        System.out.println(num1);
    }
}
