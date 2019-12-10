public class Facebook {
    public static void main(String[] args) {
        Person person0 = new Person("Dragos", "Crecan", "Gherla", 20);
        Person person1 = new Person("Radu", "Iosif", "Gherla", 19);
        Person person2 = new Person("Andrei", "Brehuescu", "Botosani", 19);
        Person person3 = new Person("Razvan", "Codrescu", "Botosani", 21);
        Person person4 = new Person("Florin", "Andone", "Istambul", 28);
        Person person5 = new Person("Denis", "Man", "Bucuresti", 22);
        Person person6 = new Person("Patrick", "Popescu", "Bucuresti", 19);
        Person person7 = new Person("Catalin", "Ionescu", "Cluj-Napoca", 25);
        Person person10 = new Person("Radu", "Iosif", "Gherla", 17);

        person0.setFacebookAccount();

        person0.getFacebookAccount().addFriend(person1);
        person0.getFacebookAccount().addFriend(person2);
        person0.getFacebookAccount().addFriend(person3);
        person0.getFacebookAccount().addFriend(person4);
        person0.getFacebookAccount().printFriends();

        person0.getFacebookAccount().searchFriendsByLocation("Bucuresti");
        person0.getFacebookAccount().searchFriendsByLocation("Botosani");
        person0.getFacebookAccount().searchFriendsByLocation("Gherla");

        person0.getFacebookAccount().removeFriend(person10);
        person0.getFacebookAccount().printFriends();

        person0.getFacebookAccount().removeFriend(person1);
        person0.getFacebookAccount().addFriend(person5);
        person0.getFacebookAccount().addFriend(person6);
        person0.getFacebookAccount().addFriend(person7);

        person0.getFacebookAccount().searchFriendsByLocation("Bucuresti");
        person0.getFacebookAccount().searchFriendsByLocation("Botosani");
        person0.getFacebookAccount().searchFriendsByLocation("Gherla");

        person0.getFacebookAccount().printFriends();
    }
}
