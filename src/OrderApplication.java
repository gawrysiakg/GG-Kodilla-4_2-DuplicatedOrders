import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class OrderApplication {
    public static void main (String[] args) {

        Set<Order> orders = new HashSet<>();
        Random theGenerator = new Random();

        System.out.println("Lista zamówień:");
        for(int i = 0; i < 10; i++) {
            int productId;
            String productName;
            int productQuantity;
            orders.add(new Order(i+1, "Produkt_"+(theGenerator.nextInt(20)), theGenerator.nextInt(20)));
        }

        for (Order o : orders) {
            System.out.println(o);
        }

        System.out.println("\nLista zamówień po dodaniu kolejnych zamówień: ");
        orders.add(new Order(11, "Produkt_2", 5));
        orders.add(new Order(2, "Produkt_10", 1));
        orders.add(new Order(1, "Produkt_7", 9));
        orders.add(new Order(12, "Produkt_7", 35));

        for (Order o : orders) {
            System.out.println(o);
        }


    }

}
