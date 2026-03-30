class SteelExecutor{

   public static void main(String[] args){
    
    Steel s1 = new Steel();
    Steel s2 = new Steel("Alloy");
    Steel s3 = new Steel("Carbon", 50.5);
    Steel s4 = new Steel("Stainless", 60.0, "Grade A");
    Steel s5 = new Steel("Mild", 70.0, "Grade B", "Construction");
    Steel s6 = new Steel("Tool", 80.0, "Grade C", "Industrial", 8000);

    s1.display(); 
	s2.display(); 
	s3.display();
    s4.display(); 
	s5.display(); s6.display();   
   }
}