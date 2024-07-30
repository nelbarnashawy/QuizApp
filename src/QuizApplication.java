import java.util.ArrayList;

public class QuizApplication {
    private ArrayList<User> users;
    private Quiz quiz;

    public QuizApplication() {
        users = new ArrayList<>();
    }

    public void registerUser(String name) {
        users.add(new User(name));
    }

    public void addQuestions(Question question){
        quiz.addQuestion(question);
    }

}
