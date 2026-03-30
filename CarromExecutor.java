class CarromExecutor{

  public static void main(String[] args){
  
    Carrom cr1 = new Carrom();
    Carrom cr2 = new Carrom("Standard");
    Carrom cr3 = new Carrom("Professional", 32);
    Carrom cr4 = new Carrom("Club", 36, "Wood");
    Carrom cr5 = new Carrom("Premium", 40, "Plywood", 19);
    Carrom cr6 = new Carrom("Deluxe", 42, "Hardwood", 19, 3000);

    cr1.display();
	cr2.display(); 
	cr3.display();
    cr4.display(); 
	cr5.display(); 
	cr6.display();
	
  }
}