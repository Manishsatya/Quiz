package quiz;
import java.util.*;

public class QuizManager {
	private Map<String,Quiz> quizzes;
	private Map<String,User> users;
	
	public QuizManager() {
        quizzes = new HashMap<>();
        users = new HashMap<>();
        initializeData();
    }
	

	public void createQuiz(String topic) {
		quizzes.put(topic, new Quiz(topic));
	}
	
	public void addQuestion(String topic, Question question) {
		Quiz quiz = quizzes.get(topic);
		if(quiz != null) {
			quiz.addQuestion(question);
		}
	}
	
	public void registerUser(String username) {
		users.put(username, new User(username));
	}
	
	public void submitAnswer(String username,Question question,String answer) {
		User user = users.get(username);
		if(user != null) {
			user.answerQuestion(question, answer);
		}
	}
	
	public void printUserScore(String username) {
		User user = users.get(username);
		if(user != null) {
			System.out.println(user.getUsername()+"'s score : "+ user.getScore());
		}
	}
	
	public Quiz getQuiz(String topic) {
		return quizzes.get(topic);
		
	}
	
	public void listTopics() {
		if(quizzes.isEmpty()) {
			System.out.println("No quizzes available.");
		}
		else {
			System.out.println("Available quiz topics:");
			for (String topic : quizzes.keySet()) {
				System.out.println("- "+ topic);
			}
		}
	}
	
	private void initializeData() {
		
        Quiz mathQuiz = new Quiz("Mathematics");
        mathQuiz.addQuestion(new Question("What is 2 + 2?", Arrays.asList("3", "4", "5"), "4"));
        mathQuiz.addQuestion(new Question("What is 5 * 6?", Arrays.asList("30", "36", "42"), "30"));
        quizzes.put("Mathematics", mathQuiz);

        Quiz scienceQuiz = new Quiz("Science");
        scienceQuiz.addQuestion(new Question("What is the chemical symbol for water?", Arrays.asList("H2O", "O2", "CO2"), "H2O"));
        scienceQuiz.addQuestion(new Question("What planet is known as the Red Planet?", Arrays.asList("Mars", "Jupiter", "Saturn"), "Mars"));
        quizzes.put("Science", scienceQuiz);
    }

}
