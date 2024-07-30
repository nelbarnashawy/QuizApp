import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> quizQuestions;
    private static ArrayList<Question> allQuestions = new ArrayList<>();
    private Scanner sc;

    public Quiz(int numQuestions) {
        quizQuestions = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void addQuestion(Question question) {
        allQuestions.add(question);
    }
    public ArrayList<Question> displayAllQuestions() {
        return allQuestions;
    }

    public void createQuiz() {
        System.out.println("Please enter the number of questions you want in your quiz: ");
        int numQuestions = sc.nextInt();
        randomQuiz(numQuestions);
    }
    // Create a random quiz (with a specific size) out of all possible questions
    public void randomQuiz(int numQuestions) {
        Random rand = new Random();

    }

    public int calculateScore(ArrayList<Integer> answers){
        int score = 0;
        if(answers.size() != questions.size()){
            System.out.println("Incorrect number of answers");
            return -1;
        }
        for(int i = 0; i < answers.size(); i++){
            int correctAnswer =questions.get(i).getCorrectAnswer();
            if(answers.get(i) == correctAnswer){
                score++;
            }
        }
        return score;
    }
}
