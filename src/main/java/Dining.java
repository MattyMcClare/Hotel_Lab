import java.util.ArrayList;

public class Dining {

    private String name;
    private String type;
    private int capacity;
    private ArrayList<Guest> guests;

    public Dining(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}
