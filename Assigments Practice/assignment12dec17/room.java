package assignment12dec17;

public class room {
	private int roomno;
	private String roomtype, roomarea;
	private boolean acmac;

// create Constructor 
	room(int roomno, String roomtype, String roomarea, boolean acmac) {
		this.roomno = roomno;
		this.roomtype = roomtype;
		this.roomarea = roomarea;
		this.acmac = acmac;
	}

	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public String getRoomarea() {
		return roomarea;
	}

	public void setRoomarea(String roomarea) {
		this.roomarea = roomarea;
	}

	public boolean isAcmac() {
		return acmac;
	}

	public void setAcmac(boolean acmac) {
		this.acmac = acmac;
	}

	void displayData() {
		// getting value
		System.out.println("The room is " + getRoomno());
		System.out.println("The type is" + getRoomtype());
		System.out.println("The area is" + getRoomarea());
		System.out.println("The room is " + isAcmac());

	}

	public static void main(String[] args) {
		room room1 = new room(3, " double", " 500 sq", false); // adding values

		room1.displayData();

	}

}

//Output
//The room is 3
//The type is double
//The area is 500 sq
//The room is false
