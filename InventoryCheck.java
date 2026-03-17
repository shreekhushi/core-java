class InventoryCheck{
    static void validate(String productName){
        System.out.println("Validating product availability");
        WareHouse.fetchFromAisle(productName);
    }
}