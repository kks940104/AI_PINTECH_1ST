package exam02;

public class Ex01
{
    public static void main(String[] args)
    {
        LoginService lg = new LoginService();
        try
        {
            lg.process("user01", "1234");
            System.out.println("로그인 성공");
        }
        catch (UserIdValidationException | PasswordValidationException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
