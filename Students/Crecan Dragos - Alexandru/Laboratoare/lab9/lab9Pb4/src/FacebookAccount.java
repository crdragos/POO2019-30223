import java.util.ArrayList;

public class FacebookAccount {
    private String name;
    private String currentAdress;
    private int age;
    private ArrayList<Person> friends;

    public FacebookAccount(Person person) {
        this.name = person.getFirstName() + " " + person.getLastName();
        this.age = person.getAge();
        this.currentAdress = person.getAdress();
        this.friends = new ArrayList<Person>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentAdress(String currentAdress) {
        this.currentAdress = currentAdress;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFriends(ArrayList<Person> friends) {
        this.friends = (ArrayList<Person>) friends.clone();
    }

    public String getName() {
        return this.name;
    }

    public String getCurrentAdress() {
        return this.currentAdress;
    }

    public int getAge() {
        return this.age;
    }

    public ArrayList<Person> getFriends() {
        return this.friends;
    }

    public void addFriend(Person newFriend) {
        friends.add(newFriend);
        System.out.println(newFriend.getFirstName() + " " + newFriend.getLastName() + " a fost adaugat in lista de prieteni.");
    }

    public void removeFriend(Person toRemoveFriend) {
        if (this.friends.contains(toRemoveFriend)) {
            this.friends.remove(toRemoveFriend);
            System.out.println(toRemoveFriend.getFirstName() + " " + toRemoveFriend.getLastName() + " a fost eliminat din lista de prieteni.");
        } else {
            System.out.println(toRemoveFriend.toString() + " nu se aflsa in lista de prieteni");
        }
    }

    public void searchFriendsByLocation(String location) {
        int counter = 0;
        for (Person friend : this.friends) {
            if (friend.getAdress().equals(location)) {
                counter += 1;
                if (counter == 1) {
                    System.out.println("Prietenii din locatia " + location + " sunt: ");
                    System.out.println(friend.toString());
                } else {
                    System.out.println(friend.toString());
                }
            }
        }
        if (counter == 0) {
            System.out.println("Niciun prieten al lui " + this.getName() + " nu se afla in locatia : " + location);
        }
        System.out.println();
    }

    public void printFriends() {
        System.out.println("Pritenii lui " + this.getName() + " sunt :");
        for (Person friend : this.friends) {
            System.out.println(friend.toString());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Nume cont : " + this.getName() + ", varsta : " + this.getAge();
    }
}
