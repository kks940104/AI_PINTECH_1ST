package exam01;

public class Ex04
{
    public static void main(String[] args)
    {
        C c = new C(); // C -> B -> A
        A ac = c;

        A a = new C();
        B b = new C();
    }
}
