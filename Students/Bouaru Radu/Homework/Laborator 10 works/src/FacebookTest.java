
public class FacebookTest {

	public static void main(String args[]) {
		FacebookAccount account1 = new FacebookAccount("Trufin Radu", 20, "Bucovina");
		FacebookAccount account2 = new FacebookAccount("Bouaru Radu", 20, "Bucovina");
		FacebookAccount account3 = new FacebookAccount("Juhasz Norbert", 20, "Oradea");
		FacebookAccount account4 = new FacebookAccount("Chiras Valentin", 20, "Bucovina");
		FacebookAccount account5 = new FacebookAccount("Goia Vlad", 20, "Cluj-Napoca");
		
		account2.addFriend(account5);
		account2.addFriend(account4);
		account2.addFriend(account3);
		account2.addFriend(account1);
		
		account2.showFriends();
		account2.removeFriend(account3);
		account2.showFriends();
		account2.searchFriends("Bucovina");
	}
}
