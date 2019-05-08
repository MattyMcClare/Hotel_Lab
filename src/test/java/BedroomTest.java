import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom("single", 102, 1);
    }

    @Test
    public void hasType(){
        assertEquals("single", bedroom.getType());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(102, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.checkCapacity());
    }

    @Test
    public void checkStartEmpty(){
        assertEquals(false, bedroom.checkIfOccupied());
    }

    @Test
    public void canAddGuest(){
        guest = new Guest("david", 27, 0);
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.checkCapacity());
    }

}
