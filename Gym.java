class Gym{
   static String equipments[] = {"treadmill", "stationary bike", "elliptical trainer", "dumbbells", "barbell", "bench press bench", "leg press machine", "lat pulldown machine", "smith machine", "cable crossover machine"};
   public static void getEquipments(){
   System.out.println("getEquipments invoked");
   for(String equipment : equipments){
   System.out.println(equipment);
   }
   System.out.println("end of getEquipments");
   }
}