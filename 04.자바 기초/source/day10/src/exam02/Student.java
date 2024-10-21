package exam02;


//@MyAnno(value = "여기는 클래스")
@MyAnno(value = {"여기는 클래스", "여기는 Student Class"}, min = 10, max = 100)
public class Student {

    //@MyAnno(value = "여기는 메서드")
    @MyAnno(value = {"여기는 메서드", "여기는 Study Method"})
    public void Study(){

    }
}
