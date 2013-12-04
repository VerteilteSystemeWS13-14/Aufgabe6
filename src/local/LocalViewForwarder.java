package local;

import java.io.IOException;
import java.util.Map;
import forum.framework.IForumView;
import forum.framework.Position;

public final class LocalViewForwarder implements IForumView {

	private IForumView view;
	
	public LocalViewForwarder(IForumView p_view)
	{
		view = p_view;
	}
	
	@Override
	public void notifyView(Map<String, Position> folks) throws IOException {
		view.notifyView(folks);
	}

}
