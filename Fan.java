class Fan{
	static int maxLevel = 5;
	static int minLevel = 0;
	static int currentLevel;
	static boolean isConnected;
	
	static void power(){
        if(isConnected == false){
        isConnected = true;
       }
	   else{
		   isConnected = false;
	   }
    }
	
	static int getLevel(){
		return currentLevel;
	}
	
	static void increaseLevel(){
		if(isConnected){
			if(currentLevel < maxLevel){
				currentLevel = currentLevel + 1;
				System.out.println("the speed level increased to: " + currentLevel);
			}
			else{
				System.out.println("the speed level is high already");
			}
		}
		else{
			System.out.println("fan is off");
		}
	}
	
	static void decreaseLevel(){
		if(isConnected){
			if(currentLevel > minLevel){
				currentLevel = currentLevel - 1;
				System.out.println("the speed level decreased to: " + currentLevel);
			}
			else{
				System.out.println("the speed level is low already");
			}
		}
		else{
			System.out.println("fan is off");
		}
	}	
}