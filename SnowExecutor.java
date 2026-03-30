class SnowExecutor{
   public static void main(String[] args){
   
    Snow s1 = new Snow();
    Snow s2 = new Snow("White");
    Snow s3 = new Snow("White", -5.0);
    Snow s4 = new Snow("White", -10.0, "Powder");
    Snow s5 = new Snow("White", -15.0, "Wet", "Himalaya");
    Snow s6 = new Snow("White", -20.0, "Dry", "Kashmir", 30);

    s1.display();
	s2.display(); 
	s3.display();
    s4.display();
	s5.display(); 
	s6.display();
   }

}