
public class PetHotelTest {

	public static void main(String[] args) {
		PetHotel myPetHotel = new PetHotel("Tzukulina");
		
		Dog myDog1 = new Dog("Tzukurel", "Maidanez", "Puya", 10);
		Dog myDog2 = new Dog("Queen", "Retriever", "King", 4);
		Dog myDog3 = new Dog("Spikey", "Dobermann", "Tactu", 5);
		Room newRoom1 = new Room(1, 1);
		Room newRoom2 = new Room(2, 1);
		Room newRoom3 = new Room(1, 5);
		myPetHotel.addDog(newRoom1, myDog1);
		myPetHotel.addDog(newRoom2, myDog2);
		myPetHotel.addDog(newRoom3, myDog3);
		
		myPetHotel.printRoomsDogs();

		myPetHotel.freeRoom(newRoom3);
		
		myPetHotel.printRoomsDogs();
	}

}
