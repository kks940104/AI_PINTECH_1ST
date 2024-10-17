package exam02;

public class LoginService
{
    public void process(String userId, String password)
    {
        if (!userId.equals("user01")) // user01번과 불일치
        {
            throw new UserIdValidationException("아이디가 일치하지 않습니다.");
        }

        if (!password.equals("1234")) // 1234와 불일치
        {
            throw new PasswordValidationException("비밀번호가 일치하지 않습니다.");
        }
    }
}
