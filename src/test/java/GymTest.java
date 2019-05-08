import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GymTest {

    Gym gym;

    @Before
    public void before(){
        gym = new Gym(20);
    }

    @Test
    public void hasCapacity(){
        assertEquals(20, gym.getCapacity());
    }

    @Test
    public void currentGuests(){
        assertEquals(0, gym.guestCount());
    }
}
