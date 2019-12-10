public class Person {
    private final String firstName;
    private final String lastName;
    private String adress;
    private int age;
    private FacebookAccount facebookAccount;

    public Person(String firstName, String lastName, String adress, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.age = age;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFacebookAccount() {
        this.facebookAccount = new FacebookAccount(this);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAdress() {
        return this.adress;
    }

    public int getAge() {
        return this.age;
    }

    public FacebookAccount getFacebookAccount() {
        return this.facebookAccount;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + ", domiciliat in  " + this.getAdress() + " avand varsta de " + this.age + " ani";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if ((object instanceof Person) == false) {
            return false;
        }

        Person person = (Person) object;
        if (this.firstName.equals(person.firstName) && this.lastName.equals(person.lastName) && this.adress.equals(person.adress) && (this.age == person.age)) {
            return true;
        } else {
            return false;
        }
    }
}
