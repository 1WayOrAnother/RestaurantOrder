import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {
    @Test
    public void shouldReturnCostOnlyForMusicWithWrongCoupon() throws Exception {
        Order testParty = new Order(100, false, false, true, "7899");
        assertEquals("Should return 3500", 3500, testParty.calculateCost());

    }

    @Test
    public void shouldReturnCostOnlyForDrinksWithNoCoupon() throws Exception {
        Order testParty = new Order(100, false, true, false, "no");
        assertEquals("Should return 500", 500, testParty.calculateCost());
    }

}