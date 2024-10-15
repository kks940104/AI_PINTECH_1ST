package exam01;

public class C extends B
{
    int numC = 30;
    public C()
    {
        // 정의하지 않아도 기본적으로 생성자 생성시 추가됨.
        super(); // 컴파일러가 자동 추가해준다. -> B() 자동호출.
        System.out.println("C 생성자!");
    }
}
