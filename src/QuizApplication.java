import java.util.ArrayList;

public class QuizApplication {
    private ArrayList<User> users = new ArrayList<User>();

    public void registerUser(String name) {
        users.add(new User(name));
    }

}
