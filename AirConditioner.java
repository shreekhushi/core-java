class AirConditioner{
	static int maxTemperature = 30;
	static int minTemperature = 0;
	static int currentTemperature;
	static boolean isConnected;
	
	static void power(){
    if(isConnected == false){
      isConnected = true;
      System.out.println("AC is ON");
    }else{
	  isConnected = false;
      System.out.println("AC is OFF");
    }
   }
   
   static int getTemperature(){
	   return currentTemperature;
   }
   
   static void increaseTemperature(){
	   if(isConnected){
		   if(currentTemperature < maxTemperature){
			   currentTemperature = currentTemperature + 1;
			   System.out.println("The temperature after increasing is:" + currentTemperature);
		   }
		   else{
			   System.out.println("it is in high temperature already");
		   }
	   }
	   else{
		   System.out.println("AC is off");
	   }
   }
   
   static void decreaseTemperature(){
	   if(isConnected){
		   if(currentTemperature > minTemperature){
			   currentTemperature = currentTemperature - 1;
			   System.out.println("The temperature after decreasing is:" + currentTemperature);
		   }
		   else{
			   System.out.println("it is in low temperature already");
		   }
	   }
	   else{
		   System.out.println("AC is off");
	   }
   }
}