class Cart{

    int cartId;
    String userName;
    int totalItems;
    double cartTotal;
    String paymentMethod;

    Order order;
	
    public void getCartDetails() {
        System.out.println("Cart Details:");
        System.out.println("Cart Id: " + cartId);
        System.out.println("User Name: " + userName);
        System.out.println("Total Items: " + totalItems);
        System.out.println("Cart Total: " + cartTotal);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("--------------------------------");

        order.getOrderDetails();

    }
}