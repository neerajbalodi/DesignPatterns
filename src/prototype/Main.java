package prototype;

public class Main {
	
	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp("192.168.3.132");
		networkConnection.loadImportantData();
		System.out.println(networkConnection);
		
		NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
		System.out.println(networkConnection2);
		networkConnection.getDomains().remove(0);
		
		
		NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
		networkConnection3.setIp("192.168.3.132");
		//networkConnection3.loadImportantData();
		System.out.println(networkConnection3);
		
		
	}

}
