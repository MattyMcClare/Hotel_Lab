import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningTest {

    Dining dining;

    @Before
    public void before(){
        dining = new Dining("matt's burgers", "fine dining", 10 );
    }

    @Test
    public void hasName(){
        assertEquals("matt's burgers", dining.getName());
    }

    @Test
    public void hasType(){
        assertEquals("fine dining", dining.getType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, dining.getCapacity());
    }
}
