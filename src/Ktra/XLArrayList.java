package Ktra;

import Ktra.*;

import java.util.ArrayList;
import java.util.List;

public class XLArrayList {
    public static List<Order> getAllOrdersByCustomer(ArrayList<Order> orders, String customerId) {
        List<Order> customerOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.customer.getIdKH().equals(customerId)) {
                customerOrders.add(order);
            }
        }
        return customerOrders;
    }
}