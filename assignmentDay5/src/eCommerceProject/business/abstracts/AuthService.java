package eCommerceProject.business.abstracts;

import eCommerceProject.entity.concretes.User;

public interface AuthService {
	void signUp(User user);

	void signIn(User user);
}
