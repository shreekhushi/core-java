class Salon{
 static String services[] = {"Haircut", "manicure" , "pedicure" ,"skin treatment", "waxing", "makeup" , "coloring" , "straightening", "de-tan" , "threading"};
 
 public static void getServices(){
   System.out.println("getServices invoked");
   for(String service : services){
     System.out.println(service);
   }
   System.out.println("end of getServices");
 }
}