package local;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import forum.framework.IForumView;
import forum.framework.Position;

public final class LocalViewReceiver implements IForumView {
	
	private static final LocalViewReceiver instance = new LocalViewReceiver();
	private List<IForumView> viewList = new LinkedList<IForumView>();
	
	private LocalViewReceiver() {
		
	}
	
	public static LocalViewReceiver getInstance() {
		return instance;
	}
	
	public static void addView(IForumView pview) {
		instance.viewList.add(pview);
	}

	@Override
	public void notifyView(Map<String, Position> folks) throws IOException {
		for (IForumView view : viewList)
			view.notifyView(folks);
	}

}
