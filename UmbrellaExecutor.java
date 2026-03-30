class UmbrellaExecutor{
    
    public static void main(String[] args){
	
	  Umbrella u1 = new Umbrella();
      Umbrella u2 = new Umbrella("Black");
      Umbrella u3 = new Umbrella("Blue", 90.5);
      Umbrella u4 = new Umbrella("Red", 85.0, "Foldable");
      Umbrella u5 = new Umbrella("Green", 88.0, "Straight", "Puma");
      Umbrella u6 = new Umbrella("Yellow", 92.0, "Auto", "Nike", 1200);

      u1.display();
	  u2.display();
	  u3.display();
      u4.display(); 
	  u5.display();
	  u6.display();
	
	}
}