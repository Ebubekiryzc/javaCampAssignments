package eCommerceProject.business.concretes;

import eCommerceProject.business.abstracts.EmailVerificationService;

public class EmailVerificationManager implements EmailVerificationService {

	@Override
	public void send(String verificationMail) {
		System.out.println("Kullan�c�ya do�rulama maili yolland�: " + verificationMail);
	}

}
