package Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {
	
	List<Observer> subscribers = new ArrayList<Observer>();
	
	@Override
	public void subscribe(Observer ob) {
		subscribers.add(ob);
	}

	@Override
	public void unsubscribe(Observer ob) {
		subscribers.remove(ob);
		
	}

	@Override
	public void newVideoUploaded(String title) {

		for(Observer observer : subscribers) {
			observer.notified(title);
		}
		
	}

}
