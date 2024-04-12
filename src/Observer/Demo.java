package Observer;

public class Demo {
	
	public static void main(String[] args) {
		YoutubeChannel channel = new YoutubeChannel();
		Observer aman = new Subscriber("Aman");
		Observer raman = new Subscriber("Raman");
		
		channel.subscribe(aman);
		channel.subscribe(raman);

		
		channel.newVideoUploaded("Java Fullstack Course");
		
		
	}

}
