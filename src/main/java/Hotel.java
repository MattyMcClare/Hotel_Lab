import java.util.ArrayList;

public class Hotel {

    private String name;
    private int capacity;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Dining> dinings;
    private ArrayList<Gym> gyms;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.bedrooms = new ArrayList<>();
        this.dinings = new ArrayList<>();
        this.gyms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }


    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }
}
