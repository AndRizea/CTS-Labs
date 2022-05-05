package rizea.andreea.g1099.factory;

public class ScenarioFactory {

	public static Scenario getScenario(ScenarioType type, float emotionIntensity) {

		boolean needsSupervisedHelp = false;

		switch (type) {
		case POSITIVE:
			return new PositiveScenario(emotionIntensity, PositiveScenario.DEFAULT_FEEDBACK);
		case NEGATIVE:
			return new NegativeScenario(emotionIntensity, needsSupervisedHelp);
		default:
			throw new UnsupportedOperationException();
		}

	}

}
