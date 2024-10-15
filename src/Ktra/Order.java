package Ktra;

import Ktra.*;

import java.util.ArrayList;
import java.util.List;

public class Order {
    String orderID;
    Customer customer;
    List<Grocery> items;

    public Order(String orderID, Customer customer) {
        this.orderID = orderID;
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addItem(Grocery item) {
        items.add(item);
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Grocery item : items) {
            totalCost += item.getGiaSP();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", customer=" + customer +
                ", items=" + items +
                ", totalCost=" + getTotalCost() +
                '}';
    }
}