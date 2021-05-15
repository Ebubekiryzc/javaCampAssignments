package eCommerceProject.core;

import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.entity.concretes.User;
import googleAuthorization.GoogleAccount;
import googleAuthorization.GoogleAuth;

public class GoogleAuthAdapter implements ExternalAuthService {
	private GoogleAccount googleAccount;
	private GoogleAuth googleAuth;
	private UserDao userDao;

	public GoogleAuthAdapter(UserDao userDao) {
		googleAccount = new GoogleAccount();
		googleAuth = new GoogleAuth();
		this.setUserDao(userDao);
	}

	@Override
	public void signUp(User user) {
		this.accountMaker(user.getFirstName(), user.getLastName(), user.getUserMail(), user.getPassword());
		if (googleAuth.signUp(googleAccount) && this.userDao.emailNotExists(user.getUserMail())) {
			this.userDao.add(user);
			System.out.println(user.getUserMail() + " kullan�c�s� sisteme kaydedildi!");
		} else {
			System.out.println("Kullan�c� eklenmesi s�ras�nda bir hata ile kar��la��ld�!");
		}
	}

	@Override
	public void signIn(User user) {
		this.accountMaker(user.getFirstName(), user.getLastName(), user.getUserMail(), user.getPassword());
		if (this.userDao.getByMail(user.getUserMail())!=null) {
			System.out.println(user.getUserMail()+" kullan�c�s�na giri� yap�ld�!");
		}else {
			System.out.println("B�yle bir kullan�c� bulunmamaktad�r!");
		}
	}

	private void accountMaker(String firstName, String lastName, String userMail, String userPass) {
		googleAccount.setFirstName(firstName);
		googleAccount.setLastName(lastName);
		googleAccount.setGmail(userMail);
		googleAccount.setPassword(userPass);
	}

	public GoogleAccount getGoogleAccount() {
		return googleAccount;
	}

	public void setGoogleAccount(GoogleAccount googleAccount) {
		this.googleAccount = googleAccount;
	}

	public GoogleAuth getGoogleAuth() {
		return googleAuth;
	}

	public void setGoogleAuth(GoogleAuth googleAuth) {
		this.googleAuth = googleAuth;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
