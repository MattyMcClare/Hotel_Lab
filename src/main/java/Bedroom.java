import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;

    public Bedroom(String type, int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.type = type;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int checkCapacity() {
        return capacity;
    }

    public int numberOfGuests() {
        return guests.size();
    }

    public String getType() {
        return type;
    }

    public boolean checkIfOccupied() {
        return this.guests.size() >  0;
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
