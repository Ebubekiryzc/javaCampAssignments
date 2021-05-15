package eCommerceProject;

import eCommerceProject.business.abstracts.AuthService;
import eCommerceProject.business.concretes.InternalAuthManager;
import eCommerceProject.core.ExternalAuthService;
import eCommerceProject.core.GoogleAuthAdapter;
import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.dataAccess.concretes.StandartUserDao;
import eCommerceProject.entity.concretes.User;

public class Main {
	public static void main(String[] args) {
		User ebubekir = new User(1, "Ebubekir", "YAZICI", "ebubekir_yazici@outlook.com", "pass12345");
		User salih = new User(2, "Salih", "DEÐÝRMENCÝ", "salihdeg@outlook.com", "pass12345");
		User ebubekirGoogle = new User(1, "Ebubekir", "YAZICI", "ebubekiryazi@gmail.com", "pass12345");

		UserDao standartDao = new StandartUserDao();
		AuthService authManager = new InternalAuthManager(standartDao);
		ExternalAuthService externalAuthService = new GoogleAuthAdapter(standartDao);

		// Kayýtlý olmayan kullanýcýlar giriþ yapamaz!
		authManager.signIn(salih);
		System.out.println("*****");

		// Kullanýcý kayýt olup giriþ yapabilir.
		authManager.signUp(ebubekir);
		System.out.println("*****");
		authManager.signIn(ebubekir);
		System.out.println("*****");

		// Ayný kullanýcý bir kere daha kayýt olamaz!
		authManager.signUp(ebubekir);
		System.out.println("*****");

		// Sisteme google vb. bir dýþardan kullanýcý ile kayýt olabilir ve giriþ yapýlabilir.
		externalAuthService.signUp(ebubekirGoogle);
		System.out.println("*****");
		externalAuthService.signIn(ebubekirGoogle);
		System.out.println("*****");

	}
}
