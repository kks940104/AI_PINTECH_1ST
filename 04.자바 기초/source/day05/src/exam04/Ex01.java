package exam04;

import exam03.A;

public class Ex01
{
    public static void main(String[] args)
    {
        A a = new A();
        // B b = new B();
        //a.num1; 접근불가.
        a.num2 = 30; // 접근가능
    }
}