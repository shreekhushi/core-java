class Hospital{
  static String deparments[] = {"Cardiology", "Neurology", "orthopedics", "pediatrics" , "gynecology", 
  "pathology","radiology", "oncology", "general medicine", "emergency"};
  
  public static void getDepartments(){
  System.out.println("getDepartments invoked");
  for(String deparment : deparments){
  System.out.println(deparment);
  }
  System.out.println("end of getDepartments");
  }
} 