package rizea.andreea.g1099.singleton;

public class TestPatternSingleton {

	public static void main(String[] args) {
		

		DBConnection dbConnection1 = DBConnection.getInstance("127.0.0.1", 3001, "bot-messages");
		dbConnection1.connect();
		
		
		DBConnection dbConnection2 = DBConnection.getInstance("127.0.0.1", 3011, "bot-messages");
		dbConnection2.connect();
		
		
		
		
	}

}
