package local;

import forum.framework.ForumClient;
import forum.framework.ForumServer;

public final class LocalForumSetup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ForumServer server = new ForumServer(LocalModelReceiver.getInstance());
		
		try {
			server.run();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		ForumClient client1;
		ForumClient client2;
		
		try {
			client1 = new ForumClient(new LocalModelForwarder());
			client2 = new ForumClient(new LocalModelForwarder());
			
			client1.register();
			client2.register();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
