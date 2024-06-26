package lesson_13_p2.com.test;

import lesson_13_p2.com.domain.Item;
import lesson_13_p2.com.domain.ShoppingCart;

import java.io.*;
import java.text.NumberFormat;

public class SerializeTest {

    public static void main(String[] args) {
        String directory = "/home/oracle/labs/13-IO_Fundamentals/practices/practice2/SerializeShoppingCart" ;
        String cartId = null;
        ShoppingCart cart = null;
        System.out.println("Enter the ID of the cart file to create and serialize or q exit.");
        // Wrap the System.in InputStream with a BufferedReader to read
        // each line from the keyboard.
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            cartId = in.readLine();
            if (cartId.equals("q")) {
                System.exit(0);
            }
            cart = new ShoppingCart(new Integer(cartId).intValue());
        } catch (IOException | NumberFormatException e) { // Catch any exceptions.
            System.out.println("Exception: " + e);
            System.exit(-1);
        }
        // Add some items
        cart.addItem(new Item(101, "Duke Plastic Circular Flying Disc", 10.95));
        cart.addItem(new Item(123, "Duke Soccer Pro Soccer ball", 29.95));
        cart.addItem(new Item(45, "Duke \"The Edge\" Tennis Balls - 12-Ball Bag", 17.49));

        // Print some messages about the cart
        System.out.println("Shopping cart " + cartId + " contains " + cart.getCartSize() + " items");
        System.out.println("Shopping cart total: "
                + NumberFormat.getCurrencyInstance().format(cart.getCartTotal()));

        String cartFile = directory + "cart" + cart.getCartID() + ".ser";

        // Your code goes here....
        try(FileOutputStream fos = new FileOutputStream(cartFile);
        ObjectOutputStream o = new ObjectOutputStream(fos)) {
            o.writeObject(cart);
        } catch (IOException e) {
            System.out.println("Exception serializing " + cartFile + ": " + e);
        System.exit(-1);
        }
        System.out.println("Successfully serialized shopping cart with ID: " + cart.getCartID());
    }
}