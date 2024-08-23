package quiz;

import java.util.*;

public class Question {
	private String questionText;
    private List<String> options;
    private String correctAnswer;
	public Question(String questionText, List<String> options, String correctAnswer) {
		super();
		this.questionText = questionText;
		this.options = options;
		this.correctAnswer = correctAnswer;
	}
	public String getQuestionText() {
		return questionText;
	}
	public List<String> getOptions() {
		return options;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
    
    
}
