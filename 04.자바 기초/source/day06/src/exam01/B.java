package exam01;

public class B extends A
{
    int numB = 20;
    public B()
    {
        super(); // 컴파일러가 자동 추가. -> A() 자동호출
        System.out.println("B 생성자!");
    }
}
