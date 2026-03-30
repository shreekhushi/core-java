class RainExecutor{

    public static void main(String[] args){
	
	Rain r1 = new Rain();
    Rain r2 = new Rain("Drizzle");
    Rain r3 = new Rain("Moderate", 5.5);
    Rain r4 = new Rain("Heavy", 9.2, "Monsoon");
    Rain r5 = new Rain("Light", 3.0, "Winter", "Bangalore");
    Rain r6 = new Rain("Storm", 10.5, "Monsoon", "Chennai", 60);

    r1.display();
	r2.display(); 
	r3.display();
    r4.display(); 
	r5.display(); 
	r6.display();
	
	}
}