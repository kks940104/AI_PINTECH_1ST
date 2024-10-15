package exam02;

// exam02.Student : 전체 클래스명
public class Student
{
    int id; // 학번
    String name; // 이름
    String major; // 전공과목

    // 기본 생성자, 따로 정의 X -> 컴파일러가 추가, 디폴트 생성자.
    /**
     * 따로 정의하지 않으면 기본 생성되는 생성자
     * 디폴트 생성자
     */
    public Student()
    {
        // 객체 생성 이후 코드 실행
        // 보통은 객체의 변수 초기화.
        id = 1000;
        name = "이이름";
        major = "영어";
    }
    public Student(int _id, String _name, String _major)
    {
        id = _id;
        name = _name;
        major = _major;
    }

    public void showInfo()
    {
        System.out.printf("id = %d, name = %s, major = %s%n", id, name, major);

    }
}


