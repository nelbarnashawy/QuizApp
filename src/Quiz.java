import java.sql.SQLOutput;
import java.util.*;

public class Quiz {
    private ArrayList<Question> quizQuestions;
    private static ArrayList<Question> allQuestions = new ArrayList<>();
    private Scanner sc;

    public Quiz() {
        quizQuestions = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void addQuestion(Question question) {
        allQuestions.add(question);
    }
    public ArrayList<Question> displayAllQuestions() {
        return allQuestions;
    }

    public ArrayList<Question> getQuizQuestions() {
        return quizQuestions;
    }

    public void createQuiz() {
        System.out.println("Please enter the number of questions you want in your quiz: ");
        int numQuestions = sc.nextInt();
        randomQuiz(numQuestions);
    }
    // Create a random quiz (with a specific size) out of all possible questions
    public void randomQuiz(int numQuestions) {
        Random rand = new Random();
        quizQuestions.clear();
        Set<Integer> usedIndexes = new HashSet<>();
        while(quizQuestions.size() < numQuestions) {
            int index = rand.nextInt(allQuestions.size());
            if(!usedIndexes.contains(index)){
                quizQuestions.add(allQuestions.get(index));
                usedIndexes.add(index);
            }
        }
    }

    public int calculateScore(ArrayList<Integer> answers){
        int score = 0;
        if(answers.size() != quizQuestions.size()){
            System.out.println("Incorrect number of answers");
            return -1;
        }
        for(int i = 0; i < answers.size(); i++){
            int correctAnswer =quizQuestions.get(i).getCorrectAnswer();
            if(answers.get(i) == correctAnswer){
                score++;
            }
        }
        return score;
    }
}
