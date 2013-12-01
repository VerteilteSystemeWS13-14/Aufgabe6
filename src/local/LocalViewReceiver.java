package local;

import java.io.IOException;
import java.util.Map;

import forum.framework.ForumView;
import forum.framework.IForumView;
import forum.framework.Position;

public final class LocalViewReceiver implements IForumView {
	
	private static final LocalViewReceiver instance = new LocalViewReceiver();;
	
	private LocalViewReceiver() {
		
	}
	
	public static LocalViewReceiver getInstance() {
		return instance;
	}

	@Override
	public void notifyView(Map<String, Position> folks) throws IOException {
		ForumView view = new ForumView();
		view.notifyView(folks);
	}

}
