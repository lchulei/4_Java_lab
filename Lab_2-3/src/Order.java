import java.io.Serializable;
import java.time.LocalDateTime;

public class Order implements Serializable {
    private String name;
    private String address;
    private float cost;
    private int amount;
    private float payment;
    private LocalDateTime dateTime;

    public Order() {

    }

    public Order(String name, String address, float cost, int amount, float payment, LocalDateTime dateTime) {
        this.name = name;
        this.address = address;
        this.cost = cost;
        this.amount = amount;
        this.payment = payment;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPayment() {
        return payment;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setDateTime(int year, int month, int dayOfMonth, int hour, int minute) {
        this.dateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
    }

    public void setDateTime(int year, int month, int dayOfMonth, int hour, int minute, int second) {
        this.dateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute, second);
    }

    public boolean isAddressContains(String address) {
        return this.address.contains(address);
    }

    @Override
    public String toString() {
        return "Order:" +
                "\nname:" + name +
                "\naddress:" + address +
                "\ncost:" + cost +
                "\namount:" + amount +
                "\npayment:" + payment +
                "\ndateTime:" + dateTime;
    }
}
