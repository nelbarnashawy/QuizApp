import java.util.ArrayList;

public class QuizApplication {
    private ArrayList<User> users;
    private Quiz quiz;

    public QuizApplication() {
        users = new ArrayList<>();
        quiz = new Quiz();
    }

    public void registerUser(String name) {
        users.add(new User(name));
    }

    public void addQuestions(Question question){
        quiz.addQuestion(question);
    }
    public void createQuiz(){
        quiz.createQuiz();
    }

}
