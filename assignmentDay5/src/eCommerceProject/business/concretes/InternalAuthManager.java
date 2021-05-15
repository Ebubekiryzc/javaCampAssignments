package eCommerceProject.business.concretes;

import eCommerceProject.business.abstracts.AuthService;
import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.entity.concretes.User;

public class InternalAuthManager implements AuthService {

	private UserDao userDao;
	private EmailVerificationManager emailVerification;

	public InternalAuthManager(UserDao userDao) {
		this.userDao = userDao;
		emailVerification = new EmailVerificationManager();
	}

	@Override
	public void signUp(User user) {
		if (!userDao.add(user)) {
			return;
		} else {
			emailVerification.send(user.getUserMail());
		}
	}

	@Override
	public void signIn(User user) {
		if (this.userDao.getByMail(user.getUserMail()) != null) {
			System.out.println(user.getUserMail() + " mail adresi ile giriþ yapýldý!");
		} else {
			System.out.println("Böyle bir kullanýcý bulunmamaktadýr!");
		}
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public EmailVerificationManager getEmailVerification() {
		return emailVerification;
	}

	public void setEmailVerification(EmailVerificationManager emailVerification) {
		this.emailVerification = emailVerification;
	}

}
