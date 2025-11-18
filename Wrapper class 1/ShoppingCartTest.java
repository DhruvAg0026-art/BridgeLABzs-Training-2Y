import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.example.wrappers.models.CartItem;
import com.example.wrappers.shopping.ShoppingCart;

import java.util.Arrays;

public class ShoppingCartTest {
    private ShoppingCart shoppingCart;

    @BeforeEach
    public void setUp() {
        shoppingCart = new ShoppingCart();
    }

    @Test
    public void testAddItem() {
        CartItem item = new CartItem("Apple", 0.99, 3);
        shoppingCart.addItem(item);
        assertEquals(1, shoppingCart.getItems().size());
        assertEquals(2.97, shoppingCart.getTotalPrice());
    }

    @Test
    public void testCalculateTotalPrice() {
        shoppingCart.addItem(new CartItem("Banana", 0.59, 2));
        shoppingCart.addItem(new CartItem("Orange", 0.79, 1));
        assertEquals(1.97, shoppingCart.getTotalPrice());
    }

    @Test
    public void testInvalidPriceInput() {
        shoppingCart.addItem(new CartItem("InvalidItem", -1.00, 1));
        assertEquals(0.0, shoppingCart.getTotalPrice());
    }

    @Test
    public void testClearCart() {
        shoppingCart.addItem(new CartItem("Grapes", 2.50, 1));
        shoppingCart.clearCart();
        assertEquals(0, shoppingCart.getItems().size());
        assertEquals(0.0, shoppingCart.getTotalPrice());
    }

    @Test
    public void testMultipleItems() {
        shoppingCart.addItem(new CartItem("Milk", 1.50, 2));
        shoppingCart.addItem(new CartItem("Bread", 2.00, 1));
        shoppingCart.addItem(new CartItem("Eggs", 3.00, 1));
        assertEquals(8.00, shoppingCart.getTotalPrice());
    }
}