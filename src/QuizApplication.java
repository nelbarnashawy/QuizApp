import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuizApplication {
    private HashMap<String, User> users;
    private Quiz quiz;
    private Scanner sc;

    public QuizApplication() {
        users = new HashMap<String, User>();
        quiz = new Quiz();
        sc = new Scanner(System.in);
    }

    public void registerUser(String name) {
        if (users.containsKey(name)) {
            users.put(name, new User(name));
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

    public void takeQuiz(String name){
        if(!users.containsKey(name)){
            System.out.println("User not registered! Please register first");
            return;
        }
        User currentUser=users.get(name);
        createQuiz();
        ArrayList<Question> currentQuiz=quiz.getQuizQuestions();
        ArrayList<Integer> userAnswers = new ArrayList<>();
        for(Question question:currentQuiz){
            System.out.println(question.getQuestionText());
            ArrayList<String> possibleAnswers = question.getPossibleAnswers();
            for(int i = 0; i<possibleAnswers.size(); i++){
                System.out.println((i+1) + "- " + possibleAnswers.get(i));
            }
            System.out.println("Please choose the number of your choice: ");
            int choice = sc.nextInt()-1;
            userAnswers.add(choice);
        }
        currentUser.addQuizTaken();
        int score=quiz.calculateScore(userAnswers);
        System.out.println("Your score: "+score+"/"+currentQuiz.size());
        currentUser.saveScore(score);
    }

}
