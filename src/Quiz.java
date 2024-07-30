import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> quizQuestions;
    private static ArrayList<Question> allQuestions = new ArrayList<>();

    public Quiz(int numQuestions) {
        quizQuestions = new ArrayList<>();
        randomQuiz();
    }

    public void addQuestion(Question question) {
        allQuestions.add(question);
    }
    public ArrayList<Question> displayAllQuestions() {
        return allQuestions;
    }
    // Create a random quiz (with a specific size) out of all possible questions
    public void randomQuiz(int numQuestions) {

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
