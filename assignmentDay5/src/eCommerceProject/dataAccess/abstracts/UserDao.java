package eCommerceProject.dataAccess.abstracts;

import java.util.List;

import eCommerceProject.entity.concretes.User;

public interface UserDao {
	boolean add(User user);
	void update(int id, User user);
	void delete(User user);
	User getById(int id);
	User getByMail(String mail);
	boolean emailNotExists(String mail);
	List<User> getAllUsers();
}
