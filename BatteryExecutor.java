class BatteryExecutor{

   public static void main(String[] args){
   
    Battery b1 = new Battery();
    Battery b2 = new Battery("Duracell");
    Battery b3 = new Battery("Eveready", 2000);
    Battery b4 = new Battery("Sony", 2500, "Lithium");
    Battery b5 = new Battery("Amaron", 3000, "Lead", 12.0);
    Battery b6 = new Battery("Exide", 3500, "Dry", 24.0, 5000);

    b1.display(); 
	b2.display();
	b3.display();
    b4.display(); 
	b5.display(); 
	b6.display();
	
   }
}