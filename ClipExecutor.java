class ClipExecutor{
   
   public static void main(String[] args){
   
    Clip c1 = new Clip();
    Clip c2 = new Clip("Hair");
    Clip c3 = new Clip("Paper", "Silver");
    Clip c4 = new Clip("Hair", "Black", "Plastic");
    Clip c5 = new Clip("Paper", "White", "Metal", 2.5);
    Clip c6 = new Clip("Hair", "Pink", "Rubber", 3.0, 20);

    c1.display();
	c2.display();
	c3.display();
    c4.display();
	c5.display();
	c6.display();
   }
}