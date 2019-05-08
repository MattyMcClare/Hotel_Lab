import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;
    Bedroom bedroom;

    @Before
    public void before(){
        guest = new Guest("matt", 26, 0);
    }

    @Test
    public void hasName(){
        assertEquals("matt", guest.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(26, guest.checkAge());
    }

    @Test
    public void isCheckedIn(){
        assertEquals(false, guest.isCheckedIn());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(0, guest.checkRoomNumber());
    }

    @Test
    public void canSetRoomNumber(){
        bedroom = new Bedroom("single", 101, 1);
        guest.setRoomNumber(bedroom.getRoomNumber());
        assertEquals(101, guest.checkRoomNumber());
    }
}
