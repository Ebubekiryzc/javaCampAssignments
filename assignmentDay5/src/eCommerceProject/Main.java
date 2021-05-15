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
		User salih = new User(2, "Salih", "DE��RMENC�", "salihdeg@outlook.com", "pass12345");
		User ebubekirGoogle = new User(1, "Ebubekir", "YAZICI", "ebubekiryazi@gmail.com", "pass12345");

		UserDao standartDao = new StandartUserDao();
		AuthService authManager = new InternalAuthManager(standartDao);
		ExternalAuthService externalAuthService = new GoogleAuthAdapter(standartDao);

		// Kay�tl� olmayan kullan�c�lar giri� yapamaz!
		authManager.signIn(salih);
		System.out.println("*****");

		// Kullan�c� kay�t olup giri� yapabilir.
		authManager.signUp(ebubekir);
		System.out.println("*****");
		authManager.signIn(ebubekir);
		System.out.println("*****");

		// Ayn� kullan�c� bir kere daha kay�t olamaz!
		authManager.signUp(ebubekir);
		System.out.println("*****");

		// Sisteme google vb. bir d��ardan kullan�c� ile kay�t olabilir ve giri� yap�labilir.
		externalAuthService.signUp(ebubekirGoogle);
		System.out.println("*****");
		externalAuthService.signIn(ebubekirGoogle);
		System.out.println("*****");

	}
}
