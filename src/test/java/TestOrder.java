import org.junit.Assert;
import org.junit.Test;
import restarant.Order;

public class TestOrder {


    public class OrderTest {

        @Test
        public void shouldTestisFoodAndNotMusicAndDrinks() {
            Order order = new Order(true, false, false, 9);

            Assert.assertEquals("Should return 270 grn", 270, order.sumOfOrder());
        }

    }

}
