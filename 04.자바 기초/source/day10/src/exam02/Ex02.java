package exam02;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) throws Exception {

        //region Class 위에 적용된 에너테이션 정보.

        Class<Student> cls = Student.class;
        MyAnno myAnno = cls.getAnnotation(MyAnno.class);
        String[] value = myAnno.value();
        int min = myAnno.min();
        int max = myAnno.max();
        System.out.println(Arrays.toString(value));
        System.out.printf("min = %d, max = %d%n", min, max);

        //endregion

        //region Method 위에 적용된 에너테이션 정보.

        Method method = cls.getDeclaredMethod("Study");
        MyAnno myAnno2 = method.getAnnotation(MyAnno.class);
        String[] value2 = myAnno2.value();
        int min2 = myAnno2.min();
        int max2 = myAnno2.max();
        System.out.println(Arrays.toString(value2));
        System.out.printf("min = %d, max = %d%n", min2, max2);

        //endregion
    }
}
