package eCommerceProject.business.concretes;

import eCommerceProject.business.abstracts.EmailVerificationService;

public class EmailVerificationManager implements EmailVerificationService {

	@Override
	public void send(String verificationMail) {
		System.out.println("Kullanıcıya doğrulama maili yollandı: " + verificationMail);
	}

}
