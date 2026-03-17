class CarrierService{
    static void pickUpPackage(String productName){
        System.out.println("Picking up the package");
        HubRouter.sortToZipCode(productName);
    }
}