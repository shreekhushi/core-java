class PawnExecutor{
 
  public static void main(String[] args){
  
    Pawn p1 = new Pawn();
    Pawn p2 = new Pawn("White");
    Pawn p3 = new Pawn("Black", "Wood");
    Pawn p4 = new Pawn("White", "Plastic", 5);
    Pawn p5 = new Pawn("Black", "Wood", 6, "A2");
    Pawn p6 = new Pawn("White", "Metal", 7, "B2", 1);

    p1.display(); 
	p2.display(); 
	p3.display();
    p4.display();
	p5.display();
	p6.display();
  }
}