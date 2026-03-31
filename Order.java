class Order{

    int orderId;
    String productName;
    int quantity;
    double totalPrice;
    String orderStatus;

    public void getOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Order Id: " + orderId);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("-----------------------------");
    }
}