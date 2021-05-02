package homework;

public class UserManager {

	public User[] add(User[] userArray, User user) {
//		Eski kullanýcýlarý yedekleyelim ki yeni diziyi de ayný þekilde oluþturabilelim.
		User[] oldUsers = userArray;
//		Yeni diziyi oluþturalým:
		userArray = new User[oldUsers.length + 1];
//		Yeni diziye eski elemanlarý atarken kullanýlacak indis:
		int index = 0;
		for (User copyComponent : oldUsers) {
			userArray[index++] = copyComponent;
		}
		userArray[index] = user;
		System.out.println(user.getUserId() + " id' li kullanýcý sisteme eklendi!");
		return userArray;
	}

	public User[] delete(User[] userArray, User user) {
//		Dizimizin boyutunu öðreniyoruz ki silinip silinmediðini anlayalým:
		int arrayLength = userArray.length;
		for (int index = 0; index < userArray.length; index++) {
			if (userArray[index].getUserId() == user.getUserId()) {
				userArray[index] = null;
				arrayLength--;
//				Eðer eleman silindiyse dizi uzunluðumuzu bir azaltalým:
				System.out.println(user.getUserId() + " id' li kullanýcý sistemden silindi!");
			} else {
				continue;
			}
		}

//		Eðer uzunluk, eski uzunluk deðeri ile ayný ise silinmemiþtir! 
		if (arrayLength == userArray.length) {
			System.out.println("Bu id deðerine sahip bir kullanýcý sistemde bulunamadý!");
//			Bir deðiþiklik olmayacaðý için yollanan dizi ayný þekilde geri döndürülür:
			return userArray;
		} else {
//			Bir eleman çýkarýlmýþ dizinin tutulmasý için yeni bir dizi oluþturulur:
			User[] recentUserArray = new User[arrayLength];
//			recentUserArray için gerekli indisçi:
			int index = 0;
			for (User copyUser : userArray) {
				if (copyUser == null) {
					continue;
				} else {
					recentUserArray[index++] = copyUser;
				}
			}
			return recentUserArray;
		}
	}

	public void showAllMembers(User[] users) {
		System.out.println("Tüm kullanýcýlarýn ID deðerleri gösteriliyor...");
		for (User user : users) {
			System.out.println("Kullanýcý ID: " + user.getUserId());
		}
	}
}
