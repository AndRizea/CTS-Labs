package rizea.andreea.g1099.singleton;

public class DBConnection {

	private static DBConnection dbConnection = null;

	String ip;
	int port;
	String databaseName;
	boolean isConnected = false;

	private DBConnection(String ip, int port, String databaseName) {
		super();
		this.ip = ip;
		this.port = port;
		this.databaseName = databaseName;
	}

	public void connect() {
		if (!isConnected) {
			System.out.println("Connecting to " + this.ip + "...");
			isConnected = true;
		} else {
			System.out.println("You are already connected to " + this.ip);
		}
	}

	public static synchronized DBConnection getInstance(String ip, int port, String databaseName) {

		if (dbConnection == null) {
			dbConnection = new DBConnection(ip, port, databaseName);
		}

		return dbConnection;
	}

}
