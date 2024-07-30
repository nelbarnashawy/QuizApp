import java.util.*;

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
        if (!users.containsKey(name)) {
            users.put(name, new User(name));
        }
        else {
            System.out.println("User already exists!");
        }
    }

    public void addQuestions(Question question){
        quiz.addQuestion(question);
    }
    public void getUserScores(String name){
        if(!users.containsKey(name)){
            System.out.println("User not found!");
            return;
        }
        User currentUser = users.get(name);
        System.out.println("The scores for "+currentUser.getName()+" are: ");
        for(Map.Entry<Integer, Integer> score: currentUser.getQuizzesScores().entrySet()){
            int key = score.getKey();
            System.out.println("Quiz Number: "+score.getKey()+": "+score.getValue()+"/"+currentUser.getQuizzesSizes().get(key));
        }
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
        currentUser.saveQuizSize(currentQuiz.size());
    }

    public static void main(String[] args) {
        QuizApplication app = new QuizApplication();

        app.registerUser("Nader Atef");
        app.registerUser("Youssef Eid");

        app.addQuestions(new Question("What type of solutions does Sumerge primarily provide?", new ArrayList<String>(Arrays.asList("Financial Solutions", "IT and Business Solutions", "Agriculture Solutions", "Manufacturing Solutions")), 1));
        app.addQuestions(new Question("Which sector does Sumerge NOT serve?", new ArrayList<String>(Arrays.asList("Banking", "Government", "Telecom", "Education")), 3));
        app.addQuestions(new Question("What's 2+2?", new ArrayList<String>(Arrays.asList("4", "1", "5", "3")), 0));
        app.addQuestions(new Question("What's the capital of Egypt?", new ArrayList<String>(Arrays.asList("Alexandria", "El Gouna", "Cairo", "Luxor")), 2));
        app.addQuestions(new Question("What's language is primarily spoken at Egypt?", new ArrayList<String>(Arrays.asList("English", "Japenese", "French", "Arabic")), 3));

        app.takeQuiz("Nader Atef");
        app.takeQuiz("Youssef Eid");

        app.getUserScores("Nader Atef");

    }

}
