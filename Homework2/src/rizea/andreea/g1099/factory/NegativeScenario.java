package rizea.andreea.g1099.factory;

public class NegativeScenario extends Scenario {

	boolean needsHelp;

	protected NegativeScenario(float emotionIntensity, boolean needsHelp) {
		super(emotionIntensity);
		this.needsHelp = needsHelp;
	}

	@Override
	public void communicate() {
		System.out.println("The bot and the user are talking!");

	}

	@Override
	public void implementExercise() {
		System.out.println("Implementing exercise for negative scenario :(");

	}

	public boolean isNeedsHelp() {
		return needsHelp;
	}

	public void setNeedsHelp(boolean needsHelp) {
		this.needsHelp = needsHelp;
	}

}
