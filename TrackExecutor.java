class TrackExecutor{
 
   public static void main(String[] args){
   
    Track t1 = new Track();
    Track t2 = new Track("Running");
    Track t3 = new Track("Race", 400.0);
    Track t4 = new Track("Jogging", 300.0, "Park");
    Track t5 = new Track("Race", 500.0, "Stadium", "Synthetic");
    Track t6 = new Track("Running", 600.0, "Arena", "Clay", 8);

    t1.display(); 
	t2.display();
	t3.display();
    t4.display();
	t5.display();
	t6.display();
	
   }
}