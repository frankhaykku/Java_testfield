package Auth;

public class Login {

    public boolean check(String user, String password) {
        if("admin".equals(user) && "123".equals(password)) return true;

        return false;
    }
}
