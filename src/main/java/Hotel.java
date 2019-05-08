import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Dining> dinings;
    private ArrayList<Gym> gyms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<Dining> dinings, ArrayList<Gym> gyms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.dinings = dinings;
        this.gyms = gyms;
    }

    public String getName() {
        return name;
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public int diningsCount() {
        return this.dinings.size();
    }

    public int gymCount() {
        return this.gyms.size();
    }

    public boolean checkInGuest(Guest guest, Bedroom bedroom) {
        if(!bedroom.checkIfOccupied()) {
            bedroom.addGuest(guest);
            return true;
        } else {
            return false;
        }
    }
    public boolean checkOutGuest(Guest guest, Bedroom bedroom){
        if(bedroom.checkIfOccupied()){
            bedroom.removeGuest(guest);
            return true;
        } else {
          return false;
        }
    }
    //public Bedroom findRoomByGuest(Guest guest) {
    //foundBedroom = null
    //loop  over  bedrooms
    //if bedroom contains guest foundBedroom = bedroom
    //return foundBedroom
    //}
}
