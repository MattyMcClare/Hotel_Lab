import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Dining dining1;
    Dining dining2;
    Gym gym1;

    @Before
    public void before(){
        bedroom1 = new Bedroom("single", 103, 1);
        bedroom2 = new Bedroom("double", 104, 2);
        bedroom3 = new Bedroom("family", 105, 4);
        dining1 = new Dining("Pim's Specials", "Thai Food", 2);
        dining2 = new Dining("Matt's Specials", "Polish Food", 3);
        gym1 = new Gym(5);
        ArrayList<Bedroom> bedrooms = new ArrayList<>();
        ArrayList<Dining> dinings= new ArrayList<>();
        ArrayList<Gym> gyms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        dinings.add(dining1);
        dinings.add(dining2);
        gyms.add(gym1);
        hotel = new Hotel("Hilton", bedrooms, dinings, gyms);

    }

    @Test
    public void hasName(){
        assertEquals("Hilton", hotel.getName());
    }

    @Test
    public void hasBedrooms(){ assertEquals(3, hotel.bedroomCount()); }

    @Test
    public void hasDinings(){ assertEquals(2, hotel.diningsCount()); }

    @Test
    public void hasGyms(){ assertEquals(1, hotel.gymCount()); }
}
