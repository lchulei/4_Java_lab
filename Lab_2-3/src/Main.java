import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Order order = new Order("Galaxy", "Nahimova 21", 9000, 1, 9000,
                LocalDateTime.of(2022,9,29,13,19));

	    Order order1 = new Order("OPPO", "Chkalova 22", 5000, 1, 5000,
                LocalDateTime.of(2022,9,20,12,55));

	    Order order2 = new Order("GalaxyA52", "Main 101", 10000, 1, 0,
                LocalDateTime.of(2022,9,15,9,35));

	    Order order3 = new Order("Redmi", "Ruska 205", 6000, 1, 0,
                LocalDateTime.of(2022,10,2,11,5));

	    Order order4 = new Order("OPPO 5", "Lesi Ukrainki 15", 10000, 1, 10000,
                LocalDateTime.of(2022,10,3,12,11));

	    Order order5 = new Order("GalaxyA13", "Komarova 60", 9000, 1, 9000,
                LocalDateTime.of(2022,9,2,9,5));

	    Order order6 = new Order("Motorola", "Gagarina 2", 8000, 1, 8000,
                LocalDateTime.of(2022,10,1,11,55));

	    Order order7 = new Order("Nokia 3310", "Poletaeva 8", 12000, 1, 12000,
                LocalDateTime.of(2022,10,1,10,11));

	    Order order8 = new Order("GalaxyA53", "Rivnenska 9", 10000, 1, 0,
                LocalDateTime.of(2022,9,27,18,47));

	    Order order9 = new Order("Redmi 9", "Storojenetska 1", 7000, 1, 0,
                LocalDateTime.of(2022,9,21,10,26));

        ArrayList<Order> orderList = new ArrayList<>();
        orderList.add(order);
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);
        orderList.add(order7);
        orderList.add(order8);
        orderList.add(order9);

        for (Order o : orderList) {
            System.out.println(o + "\n");
        }

        ArrayList<Order> payed = new ArrayList<>();

        for(Order o : orderList) {
            if (o.getPayment() == o.getCost()) {
                payed.add(o);
            }
        }
        DeliveryService payedOrders = new DeliveryService(payed);
        payedOrders.writeToFile("payedOrders.txt");
        payedOrders.readFromFile("payedOrders.txt");
        payed = payedOrders.getOrderList();
        System.out.println("Payed:\n");
        for(Order o : payed) {
            System.out.println(o + "\n");
        }

        System.out.println();
        System.out.println("Not payed:\n");
        for(Order o : orderList) {
            if (o.getPayment() != o.getCost()) {
                System.out.println(o + "\n");
            }
        }

        System.out.println();
        System.out.println("Find order by part of address and by full address:\n");
        System.out.println("Search \"va\":");
        for(Order o : orderList) {
            if (o.isAddressContains("va")) {
                System.out.println(o + "\n");
            }
        }
        System.out.println("Search \"Rivnenska 9\":");
        for(Order o : orderList) {
            if (o.isAddressContains("Rivnenska 9")) {
                System.out.println(o + "\n");
            }
        }
    }
}
