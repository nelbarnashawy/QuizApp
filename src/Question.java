import java.util.ArrayList;

public class Question {
    private String questionText;
    private ArrayList<String> possibleAnswers;
    private int correctAnswer;

    public Question(String questionText, ArrayList<String> possibleAnswers, int correctAnswer) {
        this.questionText = questionText;
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }
    public String getQuestionText() {
        return questionText;
    }
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }
    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }
    public int getCorrectAnswer() {
        return correctAnswer;
    }
    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
