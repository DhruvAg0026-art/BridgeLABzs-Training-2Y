import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

class CollectionsTaskTest {

    @Test
    void testConvertArrayToArrayList() {
        double[] prices = {10.99, 20.49, 5.99, 15.00};
        CollectionsTask collectionsTask = new CollectionsTask();
        ArrayList<Double> priceList = collectionsTask.convertArrayToArrayList(prices);
        
        assertEquals(4, priceList.size());
        assertTrue(priceList.contains(10.99));
        assertTrue(priceList.contains(20.49));
        assertTrue(priceList.contains(5.99));
        assertTrue(priceList.contains(15.00));
    }

    @Test
    void testCalculateHighestPrice() {
        double[] prices = {10.99, 20.49, 5.99, 15.00};
        CollectionsTask collectionsTask = new CollectionsTask();
        double highestPrice = collectionsTask.calculateHighestPrice(prices);
        
        assertEquals(20.49, highestPrice);
    }

    @Test
    void testCalculateAveragePrice() {
        double[] prices = {10.99, 20.49, 5.99, 15.00};
        CollectionsTask collectionsTask = new CollectionsTask();
        double averagePrice = collectionsTask.calculateAveragePrice(prices);
        
        assertEquals(13.7375, averagePrice, 0.0001);
    }
}