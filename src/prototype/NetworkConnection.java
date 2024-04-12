package prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
	
	private String ip;
	private String importantData;
	
	// Its just to make concept of shallow and deep copy clear
	private List<String> domains = new ArrayList<String>();
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getImportantData() {
		return importantData;
	}
	
	public List<String> getDomains() {
		return this.domains;
	}
	
	public void setDomains(List<String> domains) {
		this.domains = domains;
	}
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	
	public void loadImportantData() throws InterruptedException {
		// make connection
		this.importantData = "Important data Loading.";
		
		domains.add("abc.com");
		domains.add("xyz.com");
		domains.add("ghi.com");
		
		Thread.sleep(5000);
	}
	
	
	
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + "]" + " "  +this.domains;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
