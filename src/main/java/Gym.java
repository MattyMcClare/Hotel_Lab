import java.util.ArrayList;

public class Gym {
    private int capacity;
    private ArrayList<Guest> guests;

    public Gym(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int guestCount() {
        return this.guests.size();
    }
}
