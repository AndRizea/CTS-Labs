package rizea.andreea.g1099.factory;

public abstract class Scenario {

	float emotionIntensity;

	protected Scenario(float emotionIntensity) {
		super();
		this.emotionIntensity = emotionIntensity;
	}

	public abstract void communicate();

	public abstract void implementExercise();
}
