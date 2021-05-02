package homework;

public class InstructorManager extends UserManager {

	@Override
	public User[] add(User[] userArray, User user) {
		if (user instanceof Instructor) {
			userArray = super.add(userArray, user);
			System.out.println("Eðitmenin vereceði kurslar için veritabanýnda yer ayrýldý!");
		} else {
			System.out.println("Parametre olarak belirtilen kullanýcý bir eðitmen örneklemi deðil!");
		}
		return userArray;
	}

	@Override
	public User[] delete(User[] userArray, User user) {
		if (!(user instanceof Instructor)) {
			System.out.println("Böyle bir eðitmen bulunamadý!");
		} else {
//		Eðitmen dizide yoksa silinmeyecektir, bu yüzden silinme durumunu kontrol etmek için dizinin eski uzunluðunu kontrol ediyoruz.
			int arrayLength = userArray.length;
//		Dizinin silme iþlemine tabii tutulduktan sonraki halini referansýna eþitliyoruz ki dizinin yeni hali elimizde bir nesne olarak bulunsun.
			userArray = super.delete(userArray, user);
			if (arrayLength != userArray.length) {
				System.out.println("Eðitmene ait bütün bilgiler veritabanýndan kaldýrýldý!");
			} else {
				System.out.println("Böyle bir öðrenci bulunamadý!");
			}
		}
		return userArray;
	}

	@Override
	public void showAllMembers(User[] users) {
		System.out.println("Sadece eðitmenlerin ID deðerleri gösteriliyor...");
		for (User user : users) {
			if (user instanceof Instructor) {
				System.out.println("Kullanýcý ID: " + user.getUserId());
			}
		}
	}

}
