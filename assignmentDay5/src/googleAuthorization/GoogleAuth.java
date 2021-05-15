package googleAuthorization;

public class GoogleAuth {

	public GoogleAuth() {
	}

	public boolean signUp(GoogleAccount acc) {
		return checkSyntax(acc);
	}

	public boolean logIn(GoogleAccount acc) {
		return checkSyntax(acc);
	}

	public boolean checkSyntax(GoogleAccount acc) {
		if (acc.getGmail().length() > 16 && acc.getPassword().length() >= 8) {
			return true;
		} else {
			return false;
		}
	}
}
