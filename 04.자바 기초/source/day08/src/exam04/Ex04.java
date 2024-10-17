package exam04;

public class Ex04 {
    public static void main(String[] args) {
        String s1 = new String("ABC");
        String s2 = new String("ABC");
        String s3 = "ABC";
        String s4 = "ABC";

        System.out.printf("s1 == s2 : 동일성 ? : %s%n", s1 == s2);
        System.out.printf("s1.equals(s2) : 동등성 ? %s%n", s1.equals(s2));
        System.out.printf("s1 주소 ? %d%n", System.identityHashCode(s1));
        System.out.printf("s2 주소 ? %d%n", System.identityHashCode(s2));


        System.out.printf("S1 == ABC ? %s%n", s1 == "ABC");
        System.out.printf("S2 == ABC ? %s%n", s2 == "ABC");
        System.out.printf("S3 == ABC ? %s%n", s3 == "ABC");
        System.out.printf("S4 == ABC ? %s%n", s4 == "ABC");
        System.out.printf("S3 == S3  ? %s%n", s4 == s3);
    }
}
