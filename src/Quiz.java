import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }
    public ArrayList<Question> displayQuestions() {
        return questions;
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
