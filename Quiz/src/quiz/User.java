package quiz;
import java.util.*;

public class User {
	private String username;
	private Map<Question, String> userAnswers;
	private int score;
	public User(String username) {
		this.username = username;
		this.userAnswers = new HashMap<>();
		this.score = 0;
	}
	
	public void answerQuestion(Question question, String answer) {
        userAnswers.put(question, answer);
    }

	public String getUsername() {
		return username;
	}

	public int getScore() {
		return score;
	}
	
	public void calculateScore() {
		score = 0;
		for (Map.Entry<Question, String> entry : userAnswers.entrySet()) {
            if (entry.getKey().getCorrectAnswer().equals(entry.getValue())) {
                score++;
            }
        }
	}
	
}
