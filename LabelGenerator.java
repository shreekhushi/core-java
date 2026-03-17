class LabelGenerator{
    static void printLabel(String productName){
        System.out.println("Printing shipping label");
        CarrierService.pickUpPackage(productName);
    }
}