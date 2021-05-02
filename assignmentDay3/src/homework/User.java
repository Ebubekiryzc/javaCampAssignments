package homework;

public class User {
	private int userId;
	private String userMail;

	public User(int userId, String userMail) {
		super();
		this.userId = userId;
		this.userMail = userMail;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

}
