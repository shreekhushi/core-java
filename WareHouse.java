class WareHouse{
    static void fetchFromAisle(String productName){
        System.out.println("Fetching product from aisle");
        PackagingUnit.packItem(productName);
    }
}