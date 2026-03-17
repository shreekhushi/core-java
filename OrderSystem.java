class OrderSystem{
    static void takeOrder(String productName){
        System.out.println("Order received for " + productName);
        InventoryCheck.validate(productName);
    }
}