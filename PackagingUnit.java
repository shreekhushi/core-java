class PackagingUnit{
    static void packItem(String productName){
        System.out.println("Packing the item");
        LabelGenerator.printLabel(productName);
    }
}