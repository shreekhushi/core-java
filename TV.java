class TV{
  static int maxVol =9;
  static int minVol=0;
  static int  currentVol;
  static boolean isConnected;
  
  static void power(){
        if(isConnected == false){
        isConnected = true;
       }
	   else{
		   isConnected = false;
	   }
  }
  
  static int getVolume(){
        return currentVol;
  }
	
  static void increaseVolume(){
  if(isConnected){
   if(currentVol < maxVol){
    currentVol = currentVol + 1;
	System.out.println("The volume increased to :" + currentVol);
   }
   else{
	   System.out.println("Volume is already maximum");
   }
  }
  else{
	  System.out.println("TV turned OFF");
  }
 }
 
   static void decreaseVolume(){
   if(isConnected){
   if(currentVol > minVol){
    currentVol = currentVol - 1;
	System.out.println("The volume decreased to : " + currentVol);
   }
   else{
	   System.out.println("Volume is already minimum");
   }
  }
  else{
	  System.out.println("TV turned OFF");
  }
 }
}