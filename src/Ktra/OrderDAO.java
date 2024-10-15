package Ktra;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {
    private Connection connection;

    public OrderDAO(String dbUrl, String user, String password) throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/OrderManagement", "root", "15062004");
    }

    public void updateOrder(Order order) throws SQLException {
        String query = "UPDATE orders SET customer_id = ?, customer_name = ?, items = ?, total_cost = ? WHERE order_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, order.customer.getIdKH());
            stmt.setString(2, order.customer.getName());
            stmt.setString(3, order.items.toString()); // Simplified for example
            stmt.setDouble(4, order.getTotalCost());
            stmt.setString(5, order.orderID);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Order> getAllOrders() {
        List<Order> orders = new ArrayList<>();
        String query = "SELECT * FROM orders";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                String orderID = rs.getString("order_id");
                String customerID = rs.getString("customer_id");
                String customerName = rs.getString("customer_name");
                String itemsStr = rs.getString("items");
                double totalCost = rs.getDouble("total_cost");

                Customer customer = new Customer(customerName, customerID);
                Order order = new Order(orderID, customer);

                String[] itemsArray = itemsStr.split(",");
                for (String item : itemsArray) {
                    String[] itemDetails = item.split(":");
                    String itemName = itemDetails[0];
                    double itemPrice = Double.parseDouble(itemDetails[1]);
                    String expiryDate = itemDetails[2];
                    order.addItem(new Grocery(itemName, itemPrice, expiryDate));
                }
                orders.add(order);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;
    }
}