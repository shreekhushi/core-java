class StrawberryExecutor{
   
   public static void main(String[] args){
   
    Strawberry st1 = new Strawberry();
    Strawberry st2 = new Strawberry("Red");
    Strawberry st3 = new Strawberry("Red", 25.5);
    Strawberry st4 = new Strawberry("Dark Red", 30.0, "Sweet");
    Strawberry st5 = new Strawberry("Bright Red", 28.0, "Sweet", "Ooty");
    Strawberry st6 = new Strawberry("Fresh Red", 35.0, "Juicy", "Mahabaleshwar", 200);

    st1.display(); 
	st2.display(); 
	st3.display();
    st4.display(); 
	st5.display(); 
	st6.display();
	
   }
}