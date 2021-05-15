package eCommerceProject.business.abstracts;

public interface UserValidationService {
	boolean checkEmailSyntax(String mail);
	boolean checkCharNumber(String text);
	boolean checkPassword(String password);
}
