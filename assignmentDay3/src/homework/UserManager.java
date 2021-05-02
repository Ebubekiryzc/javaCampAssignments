package homework;

public class UserManager {

	public User[] add(User[] userArray, User user) {
//		Eski kullan�c�lar� yedekleyelim ki yeni diziyi de ayn� �ekilde olu�turabilelim.
		User[] oldUsers = userArray;
//		Yeni diziyi olu�tural�m:
		userArray = new User[oldUsers.length + 1];
//		Yeni diziye eski elemanlar� atarken kullan�lacak indis:
		int index = 0;
		for (User copyComponent : oldUsers) {
			userArray[index++] = copyComponent;
		}
		userArray[index] = user;
		System.out.println(user.getUserId() + " id' li kullan�c� sisteme eklendi!");
		return userArray;
	}

	public User[] delete(User[] userArray, User user) {
//		Dizimizin boyutunu ��reniyoruz ki silinip silinmedi�ini anlayal�m:
		int arrayLength = userArray.length;
		for (int index = 0; index < userArray.length; index++) {
			if (userArray[index].getUserId() == user.getUserId()) {
				userArray[index] = null;
				arrayLength--;
//				E�er eleman silindiyse dizi uzunlu�umuzu bir azaltal�m:
				System.out.println(user.getUserId() + " id' li kullan�c� sistemden silindi!");
			} else {
				continue;
			}
		}

//		E�er uzunluk, eski uzunluk de�eri ile ayn� ise silinmemi�tir! 
		if (arrayLength == userArray.length) {
			System.out.println("Bu id de�erine sahip bir kullan�c� sistemde bulunamad�!");
//			Bir de�i�iklik olmayaca�� i�in yollanan dizi ayn� �ekilde geri d�nd�r�l�r:
			return userArray;
		} else {
//			Bir eleman ��kar�lm�� dizinin tutulmas� i�in yeni bir dizi olu�turulur:
			User[] recentUserArray = new User[arrayLength];
//			recentUserArray i�in gerekli indis�i:
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
		System.out.println("T�m kullan�c�lar�n ID de�erleri g�steriliyor...");
		for (User user : users) {
			System.out.println("Kullan�c� ID: " + user.getUserId());
		}
	}
}
