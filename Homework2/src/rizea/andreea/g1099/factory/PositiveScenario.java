package rizea.andreea.g1099.factory;

public class PositiveScenario extends Scenario {

	public static final String DEFAULT_FEEDBACK = "You are doing a great job!";
	String feedback;

	protected PositiveScenario(float emotionIntensity, String feedback) {
		super(emotionIntensity);
		this.feedback = feedback;

	}

	@Override
	public void communicate() {
		System.out.println("The bot and the user are talking.");

	}

	@Override
	public void implementExercise() {
		System.out.println("Implementing exercise for positive scenario :)");

	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public static String getDefaultFeedback() {
		return DEFAULT_FEEDBACK;
	}

}
