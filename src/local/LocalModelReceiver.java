package local;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import forum.framework.IForumModel;
import forum.framework.IForumView;

public final class LocalModelReceiver implements IForumModel, Runnable {
	
	private static final LocalModelReceiver instance = new LocalModelReceiver();;
	
	private LocalModelReceiver() {
		
	}
	
	public static LocalModelReceiver getInstance() {
		return instance;
	}

	@Override
	public void deregisterView(String arg0) throws NotBoundException,
			IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveEast(String arg0) throws NotBoundException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveNorth(String arg0) throws NotBoundException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveSouth(String arg0) throws NotBoundException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveWest(String arg0) throws NotBoundException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerView(String arg0, IForumView arg1)
			throws AlreadyBoundException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
