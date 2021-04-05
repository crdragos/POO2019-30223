import java.util.HashMap;

public class PetHotel {
	private String numeHotel;
	private HashMap<Room, Dog> roomMap;
 
	public PetHotel(String numeHotel)
	{
		this.numeHotel = numeHotel;
		this.roomMap = new HashMap<Room, Dog>();
		
	}
	public String getNumeHotel() {
		return numeHotel;
	}

	public void setNumeHotel(String numeHotel) {
		this.numeHotel = numeHotel;	
	}
	public void addDog(Room room, Dog dog)
	{
		this.roomMap.put(room, dog);
	}
	public void freeRoom(Room room)
	{
		this.roomMap.remove(room);
	}
	public void printRoomsDogs() {
		if(this.roomMap.isEmpty())
			System.out.println("No room is occupied");
		else
			System.out.println(this.roomMap);
	}
	
}
