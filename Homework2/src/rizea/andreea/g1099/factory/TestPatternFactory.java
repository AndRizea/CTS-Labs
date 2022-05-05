package rizea.andreea.g1099.factory;

public class TestPatternFactory {

	public static void main(String[] args) {

		boolean needsSupervisedHelp = true;

		Scenario positiveScenario = ScenarioFactory.getScenario(ScenarioType.POSITIVE, 0.75f);
		Scenario negativeScenario = ScenarioFactory.getScenario(ScenarioType.NEGATIVE, 0.23f);

		if (negativeScenario instanceof NegativeScenario) {
			NegativeScenario negScenario = (NegativeScenario) negativeScenario;
			if (negScenario.emotionIntensity <= 0.25f)
				negScenario.setNeedsHelp(needsSupervisedHelp);
		}

		if (positiveScenario instanceof PositiveScenario) {
			PositiveScenario posScenario = (PositiveScenario) positiveScenario;
			posScenario.setFeedback("Good job!");
		}

	}

}
