// class Cafe{
   // public static void main(String[] args){
    // // datatype refName = ref;
       // String cafeName = "shremonya cafe";
	   
	   // // String teaName = "green tea";
	   // // String teaName1 = "elachi tea";
       // // String teaName2 = "ginger tea";
       // // String teaName3 = "lemon tea";
       // // String teaName4 = "Masala chaha";
	   
	   // String teaNames[] = {"green tea", "elachi tea","ginger tea","lemon tea","Masala chaha",
	   // "white tea","yellow tea","oolang tea","dark tea","herbel tea","chamomile tea",
	   // "matcha tea","Darjeeling tea","Irani chai","tandoori tea" };
	   
	   // String coffeeNames[] = {"Espresso","Americano","Latte","Cappuccino","Mocha","Flat white",
	   // "red eye","Cortado","black coffee","cold coffee","Turkish coffee","Dalgano","Cuban coffee",
	   // "Iced coffee","Breve"};
	   
       // String snacks[] = {"Sandwhich","cupcake","Garlic bread",
	   // "peri peri fries","puffs","pastries","cookies","croissants","toasties",
	   // "pizza","pasta","samosa","pani puri","donuts","momos"};
	   
	   // System.out.println("the cafe name is:" + cafeName);
	   
	   // System.out.println("\n");
	   
	   // System.out.println("Lists of tea names are:");
	   // int noOfTeaNames = teaNames.length;
	   // System.out.println("The number of teas added are:" + noOfTeaNames);
	   
	    
	   // // System.out.println(teaNames[0]+"\n" + teaNames[1]+ "\n"+teaNames[2]+"\n"+teaNames[3]+"\n"+
	   // // teaNames[4]+"\n"+teaNames[5]+"\n"+teaNames[6]+"\n"+teaNames[7]+"\n"+teaNames[8]+"\n"+teaNames[9]+
	   // // "\n"+teaNames[10]+"\n"+teaNames[11]+"\n"+teaNames[12]+"\n"+teaNames[13]+"\n"+teaNames[14]);
	   
	   
	   // for(String teaName : teaNames){
		   // System.out.println(teaName);
	   // }
	   
	   // System.out.println("\n");
	   
	   // System.out.println("Lists of Coffee names are:");
	   // System.out.println("The number of coffee added are:" + coffeeNames.length);
	   
	   // // System.out.println(coffeeNames[0]+ "\n" + coffeeNames[1]+ "\n"+coffeeNames[2]+"\n"+coffeeNames[3]+"\n"+
	   // // coffeeNames[4]+"\n"+coffeeNames[5]+"\n"+coffeeNames[6]+"\n"+coffeeNames[7]+"\n"+coffeeNames[8]+"\n"+coffeeNames[9]+
	   // // "\n"+coffeeNames[10]+"\n"+coffeeNames[11]+"\n"+coffeeNames[12]+"\n"+coffeeNames[13]+"\n"+coffeeNames[14]);
	   
	   
	   // for(String coffeeName : coffeeNames){
		   // System.out.println(coffeeName);
	   // }
	   
	   // System.out.println("\n");
	   
	   // System.out.println("Lists of Snacks are:");
	   // System.out.println("The number of snacks added are:" + snacks.length);
	   
	   // // System.out.println(snacks[0]+ "\n" + snacks[1]+ "\n"+snacks[2]+"\n"+snacks[3]+"\n"+
	   // // snacks[4]+"\n"+snacks[5]+"\n"+snacks[6]+"\n"+snacks[7]+"\n"+snacks[8]+"\n"+snacks[9]+
	   // // "\n"+snacks[10]+"\n"+snacks[11]+"\n"+snacks[12]+"\n"+snacks[13]+"\n"+snacks[14]);
	   
	   
	   // for(String snack : snacks){
		   // System.out.println(snack);
	   // }
	   
 // }

// }



class Cafe{
	static String teaNames[] = {"green tea", "elachi tea","ginger tea","lemon tea","Masala chaha",
	   "white tea","yellow tea","oolang tea","dark tea","herbel tea","chamomile tea",
	   "matcha tea","Darjeeling tea","Irani chai","tandoori tea" };
	   
	static String coffeeNames[] = {"Espresso","Americano","Latte","Cappuccino","Mocha","Flat white",
	   "red eye","Cortado","black coffee","cold coffee","Turkish coffee","Dalgano","Cuban coffee",
	   "Iced coffee","Breve"};
	
	static String snacks[] = {"Sandwhich","cupcake","Garlic bread",
	   "peri peri fries","puffs","pastries","cookies","croissants","toasties",
	   "pizza","pasta","samosa","pani puri","donuts","momos"};
	   
	public static void main(String[] args){
		System.out.println("main started");
		String cafeName = "shremonya";
		System.out.println(cafeName);
		
		getTeaNames();
		getCoffeNames();
		getSnacks();
	}
	
	//purpose  
	static void getTeaNames(){
		System.out.println("The available teas are : ");
		for(String teaName : teaNames){
		   System.out.println(teaName);
	}
    }
	
	static void getCoffeNames(){
		System.out.println("The available coffee are : ");
		for(String coffeeName : coffeeNames){
		   System.out.println(coffeeName);
	}
    }
	
	static void getSnacks(){
		System.out.println("The available snacks are :");
		for(String snack : snacks){
			System.out.println(snack);
		}
	}
	
}