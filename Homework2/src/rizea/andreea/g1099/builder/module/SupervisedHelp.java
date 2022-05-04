package rizea.andreea.g1099.builder.module;

import rizea.andreea.g1099.builder.interfaces.SupervisedHelpInterface;

public class SupervisedHelp implements SupervisedHelpInterface {

	String doctorName;
	String reason;

	public SupervisedHelp(String doctorName, String reason) {
		this.doctorName = doctorName;
		this.reason = reason;
	}

}
