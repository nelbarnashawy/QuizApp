import java.util.ArrayList;

public class QuizApplication {
    private ArrayList<User> users = new ArrayList<User>();
    private Quiz quiz;

    public void registerUser(String name) {
        users.add(new User(name));
        quiz = new Quiz();
    }


}
