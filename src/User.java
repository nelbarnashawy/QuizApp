import java.util.HashMap;

public class User {
    private String name;
    private int quizzesTaken;
    private HashMap<Integer, Integer> quizzesScores;
    private HashMap<Integer, Integer> quizzesSizes;

    public User(String name) {
        this.name = name;
        quizzesScores = new HashMap<Integer, Integer>();
        quizzesSizes = new HashMap<Integer, Integer>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public HashMap<Integer, Integer> getQuizzesScores() {
        return quizzesScores;
    }
    public HashMap<Integer, Integer> getQuizzesSizes() {
        return quizzesSizes;
    }

    public void addQuizTaken(){
        quizzesTaken++;
    }

    public void saveScore(int score) {
        quizzesScores.put(quizzesTaken, score);
    }
    public void saveQuizSize(int size) {
        quizzesSizes.put(quizzesTaken, size);
    }
}
