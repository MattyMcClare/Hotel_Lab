import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

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

}
