
public class Room {
	private int roomNo;
	private int floorNo;
	
	public Room(int roomNo, int floorNo)
	{
		this.setRoomNo(roomNo);
		this.setFloorNo(floorNo);
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public int getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public String toString()
	{
		return "Camera " + this.roomNo + ", etajul " + this.floorNo;
	}
}
