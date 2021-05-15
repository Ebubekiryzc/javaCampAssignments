package eCommerceProject.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceProject.business.abstracts.UserValidationService;


public class UserValidationManager implements UserValidationService {

	@Override
	public boolean checkEmailSyntax(String mail) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mail);
		if (matcher.matches()) {
			System.out.println("Email format� uygun.");
		} else {
			System.out.println("Email yanl�� formatta, b�yle bir email bulunamaz!");
		}
		return matcher.matches();
	}

	@Override
	public boolean checkCharNumber(String text) {
		if (text.length() > 2) {
			System.out.println("Verilen parametre karakter limitine uygun!");
			return true;
		}
		System.out.println("Verilen parametre karakter limitine uygun de�il!");
		return false;
	}

	@Override
	public boolean checkPassword(String password) {
		if (password.length() > 6) {
			System.out.println("�ifre kurallara uyuyor!");
			return true;
		}
		System.out.println("�ifre kurallara uymuyor!");
		return false;
	}

}