import java.util.ArrayList;
import java.util.Scanner;

public class QuizApplication {
    private ArrayList<User> users;
    private Quiz quiz;
    private Scanner sc;

    public QuizApplication() {
        users = new ArrayList<>();
        quiz = new Quiz();
        sc = new Scanner(System.in);
    }

    public void registerUser(String name) {
        if (users.contains(name)) {
            users.add(new User(name));
        }
        else {
            System.out.println("User already exists!");
        }
    }

    public void addQuestions(Question question){
        quiz.addQuestion(question);
    }
    public void createQuiz(){
        quiz.createQuiz();
    }

    public void takeQuiz(){
        System.out.println("Please enter your name: ");
        String name = sc.next();

    }

}
