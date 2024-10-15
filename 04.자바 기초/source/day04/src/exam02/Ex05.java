package exam02;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Ex05
{
    public static void main(String[] args) {
        Class cls = Student.class;

        // 인자들
        Constructor[] constructors = cls.getConstructors();
        for (Constructor constructor : constructors)
        {
            System.out.println(constructor);
        }

        // 메서드들
        Method[] methods = cls.getMethods();
        for (Method method : methods)
        {
            System.out.println(method);
        }
    }
}
