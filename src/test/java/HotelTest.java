import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
//    Gym gym;
//    Dining dining;

    @Before
    public void before(){
        hotel = new Hotel("Hilton", 50);
        bedroom1 = new Bedroom("single", 103, 1);
        bedroom2 = new Bedroom("double", 104, 2);
        bedroom3 = new Bedroom("family", 105, 4);
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
    }

    @Test
    public void hasName(){
        assertEquals("Hilton", hotel.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, hotel.getCapacity());
    }

    @Test
    public void hasBedrooms(){
        assertEquals(3, hotel.bedroomCount());
    }


}
