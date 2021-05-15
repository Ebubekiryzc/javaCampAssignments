package eCommerceProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceProject.business.abstracts.UserValidationService;
import eCommerceProject.business.concretes.UserValidationManager;
import eCommerceProject.core.utils.Validation;
import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.entity.concretes.User;

public class StandartUserDao implements UserDao {

	private List<User> allUsers;
	private UserValidationService validater;

	public StandartUserDao() {
		setAllUsers(new ArrayList<User>());
		setValidater(new UserValidationManager());
	}

	@Override
	public boolean add(User user) {
		if (Validation.checkRules(validater.checkCharNumber(user.getFirstName()),
				validater.checkCharNumber(user.getLastName()), validater.checkEmailSyntax(user.getUserMail()),
				validater.checkPassword(user.getPassword()), emailNotExists(user.getUserMail()))) {
			this.allUsers.add(user);
			System.out.println("Kullan�c� veri taban�na eklendi!");
			return true;
		} else {
			System.out.println("Kullan�c� eklenmesi s�ras�nda bir hata ile kar��la��ld�!");
			return false;
		}
	}

	@Override
	public void update(int id, User user) {
		int index = indexFinder(id);
		if (index == 0) {
			System.out.println("B�yle bir kullan�c� bulunamad�!");
		} else {
			allUsers.set(index, user);
		}
	}

	@Override
	public void delete(User user) {
		int index = indexFinder(user.getUserId());
		if (index == 0) {
			System.out.println("B�yle bir kullan�c� bulunamad�!");
		} else {
			allUsers.remove(index);
		}
	}

	@Override
	public User getById(int id) {
		for (User user : allUsers) {
			if (user.getUserId() == id) {
				return user;
			} else {
				continue;
			}
		}
		return null;
	}

	@Override
	public User getByMail(String mail) {
		for (User user : allUsers) {
			if (user.getUserMail().equals(mail)) {
				return user;
			} else {
				continue;
			}
		}
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		return this.allUsers;
	}

	public boolean emailNotExists(String mail) {
		for (User findUser : allUsers) {
			if (findUser.getUserMail().equals(mail)) {
				System.out.println("B�yle bir mail adresi bulunmaktad�r!");
				return false;
			} else {
				continue;
			}
		}
		return true;
	}

	public int indexFinder(int id) {
		int index = 0;
		for (User findUser : allUsers) {
			if (findUser.getUserId() == id) {
				return index;
			} else {
				index++;
			}
		}
		return 0;
	}

	public void setAllUsers(List<User> allUsers) {
		this.allUsers = allUsers;
	}

	public UserValidationService getValidater() {
		return validater;
	}

	public void setValidater(UserValidationService validater) {
		this.validater = validater;
	}

}
