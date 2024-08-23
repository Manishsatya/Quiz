package quiz;
import java.util.*;

public class Quiz {
	private String topic;
	private List<Question> questions;
	public Quiz(String topic) {
		super();
		this.topic = topic;
		this.questions = new ArrayList<>();
	}
	public String getTopic() {
		return topic;
	}
	public List<Question> getQuestions() {
		return questions;
	} 
	
	public void addQuestion(Question question) {
		questions.add(question);
	}

}
