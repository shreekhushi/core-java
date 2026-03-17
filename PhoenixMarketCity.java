class PhoenixMarketCity{
   static String brands[] = {"adidas","aldo","aurelia","biba","birkenstock","blackberrys","casio","charles and keith","crocs","dyson"};
   
   public static void getBrands(){
     System.out.println("getBrands invoked");
	 for(String brand : brands){
	   System.out.println(brand);
	 }
    System.out.println("end of the getBrands");
   }

}