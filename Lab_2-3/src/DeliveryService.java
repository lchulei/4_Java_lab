import java.io.*;
import java.util.ArrayList;

public class DeliveryService {
    private ArrayList<Order> orderList;

    public DeliveryService() {

    }

    public DeliveryService(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public void readFromFile(String fileName) {
        File file = new File(fileName);
        ArrayList<Order> ordersList = new ArrayList<>();
        Order order = null;
        try {
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream inStream = new ObjectInputStream(fileIn);
            while(true) {
                order = (Order) inStream.readObject();
                if(order == null) break;
                ordersList.add(order);
            }
            orderList = ordersList;
            inStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e.getMessage());
        } catch (EOFException e) {
            System.out.println("Reach end of the file");
        } catch (IOException e) {
            System.out.println("Problem with reading data " + e.getMessage());
        } finally {
            orderList = ordersList;
        }
    }

    public void writeToFile(String fileName) {
        File file = new File(fileName);
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
            for(Order order : orderList) {
                outStream.writeObject(order);
            }
            outStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not created " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Problem with writing data " + e.getMessage());
        }
    }
}