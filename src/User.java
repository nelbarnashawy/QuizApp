import java.util.HashMap;

public class User {
    private String name;
    private int quizzesTaken;
    private HashMap<Integer, Integer> quizzesScores;

    public User(String name) {
        this.name = name;
        quizzesScores = new HashMap<Integer, Integer>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addQuizTaken(){
        quizzesTaken++;
    }

    public void saveScore(int score) {
        quizzesScores.put(quizzesTaken, score);
    }
}
