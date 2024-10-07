package exam01;

public class Ex12
{
    public static void main(String[] args)
    {
        int num1 = 1000;
        byte num2 = (byte) num1; // 앞에 자료형을 붙혀 '명시적 형변환'을 해줌.
        System.out.println(num2); // byte는 작기때문에 계속 뺑뻉이 돌다가 -24로 변환됨.
    }
}
