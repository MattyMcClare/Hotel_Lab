import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("matt", 26);
    }

    @Test
    public void hasName(){
        assertEquals("matt", guest.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(26, guest.checkAge());
    }

}
