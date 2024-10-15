package exam05;

public class LoginService
{
    private static LoginService instance;

    // 객체 생성해야 가능.
    public static LoginService getInstance()
    {
        if(instance == null)
        {
            instance = new LoginService();
        }
        return instance;
    }

    public void login(String userId, String password)
    {

    }
}
