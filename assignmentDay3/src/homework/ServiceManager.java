package homework;

public class ServiceManager {
	public User[] add(UserManager manager, User[] users, User user) {
		return manager.add(users, user);
	}

	public User[] delete(UserManager manager, User[] users, User user) {
		return manager.delete(users, user);
	}

	public void showAllMembers(UserManager manager, User[] users) {
		manager.showAllMembers(users);
	}
}
