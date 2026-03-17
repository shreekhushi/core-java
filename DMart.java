class DMart{
   static String products[] = {"pillow","maggie","bucket","bottle","soaps","fruits","vegetables","blanket",
   "chocolates","biscuits"};
   
   public static void getProducts(){
   System.out.println("getProducts invoked");
   for(String product : products){
   System.out.println(product);
   }
   System.out.println("end of getProducts");
  }
}