package eCommerceProject.business.concretes;

import eCommerceProject.business.abstracts.EmailVerificationService;

public class EmailVerificationManager implements EmailVerificationService {

	@Override
	public void send(String verificationMail) {
		System.out.println("Kullanýcýya doðrulama maili yollandý: " + verificationMail);
	}

}
