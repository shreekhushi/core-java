class UberEats{

	public static double search(String itemName){
		double price = 0.0;

		if(itemName == "BBQ wings"){
			price = 220.0;
			return price;
		}
		else if(itemName == "Buffalo wings"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Honey garlic wings"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Cheese burst pizza"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Pepperoni pizza"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Veg supreme pizza"){
			price = 200.0;
			return price;
		}
		else if(itemName == "Chicken pepperoni pizza"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Margherita classic"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Stuffed crust pizza"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Italian garlic bread"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Cheese sticks"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Chicken nuggets"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Chicken tenders"){
			price = 190.0;
			return price;
		}
		else if(itemName == "Loaded nachos"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Cheesy nachos"){
			price = 210.0;
			return price;
		}
		else if(itemName == "Mexican bowl"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Chicken rice bowl"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Veg rice bowl"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Spicy ramen"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Chicken ramen"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Veg ramen"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Sushi roll"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Chicken sushi"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Veg sushi"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Prawn sushi"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Grilled salmon"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Fish and chips"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Chicken steak"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Veg steak"){
			price = 190.0;
			return price;
		}
		else if(itemName == "Mashed potato"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Coleslaw salad"){
			price = 200.0;
			return price;
		}
		else if(itemName == "Caesar salad"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Greek salad"){
			price = 210.0;
			return price;
		}
		else if(itemName == "Chicken caesar salad"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Chocolate lava cake"){
			price = 190.0;
			return price;
		}
		else if(itemName == "Cheesecake slice"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Blueberry cheesecake"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Brownie fudge "){
			price = 140.0;
			return price;
		}
		else if(itemName == "Chocolate mousse"){
			price = 90.0;
			return price;
		}
		else if(itemName == "Vanilla mousse"){
			price = 110.0;
			return price;
		}
		else if(itemName == "Caramel pudding"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Iced latte"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Cappuccino hot"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Espresso shot"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Mocha coffee"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Hazelnut coffee"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Caramel latte"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Mint cooler"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Lime soda"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Orange fizz"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Berry blast"){
			price = 90.0;
			return price;
		}
		else if(itemName == "Watermelon juice"){
			price = 90.0;
			return price;
		}
		else if(itemName == "Pineapple juice"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Mango smoothie"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Banana smoothie"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Protein shake"){
			price = 110.0;
			return price;
		}
		else{
			System.out.println(itemName + " not found");
		}
		return price;
	}

	public static double search(String itemName, int quantity){
	double price = 0.0;

	if(itemName == "BBQ wings"){
			price = 220.0 * quantity;
			return price;
		}
		else if(itemName == "Buffalo wings"){
			price = 120.0 * quantity;
			return price;
		}
		else if(itemName == "Honey garlic wings"){
			price = 150.0 * quantity;
			return price;
		}
		else if(itemName == "Cheese burst pizza"){
			price = 140.0 * quantity;
			return price;
		}
		else if(itemName == "Pepperoni pizza"){
			price = 180.0 * quantity;
			return price;
		}
		else if(itemName == "Veg supreme pizza"){
			price = 200.0 * quantity;
			return price;
		}
		else if(itemName == "Chicken pepperoni pizza"){
			price = 170.0 * quantity;
			return price;
		}
		else if(itemName == "Margherita classic"){
			price = 130.0 * quantity;
			return price;
		}
		else if(itemName == "Stuffed crust pizza"){
			price = 160.0 * quantity;
			return price;
		}
		else if(itemName == "Italian garlic bread"){
			price = 150.0 * quantity;
			return price;
		}
		else if(itemName == "Cheese sticks"){
			price = 170.0 * quantity;
			return price;
		}
		else if(itemName == "Chicken nuggets"){
			price = 140.0 * quantity;
			return price;
		}
		else if(itemName == "Chicken tenders"){
			price = 190.0 * quantity;
			return price;
		}
		else if(itemName == "Loaded nachos"){
			price = 130.0 * quantity;
			return price;
		}
		else if(itemName == "Cheesy nachos"){
			price = 210.0 * quantity;
			return price;
		}
		else if(itemName == "Mexican bowl"){
			price = 180.0 * quantity;
			return price;
		}
		else if(itemName == "Chicken rice bowl"){
			price = 160.0 * quantity;
			return price;
		}
		else if(itemName == "Veg rice bowl"){
			price = 170.0 * quantity;
			return price;
		}
		else if(itemName == "Spicy ramen"){
			price = 140.0 * quantity;
			return price;
		}
		else if(itemName == "Chicken ramen"){
			price = 160.0 * quantity;
			return price;
		}
		else if(itemName == "Veg ramen"){
			price = 120.0 * quantity;
			return price;
		}
		else if(itemName == "Sushi roll"){
			price = 180.0 * quantity;
			return price;
		}
		else if(itemName == "Chicken sushi"){
			price = 170.0 * quantity;
			return price;
		}
		else if(itemName == "Veg sushi"){
			price = 130.0 * quantity;
			return price;
		}
		else if(itemName == "Prawn sushi"){
			price = 150.0 * quantity;
			return price;
		}
		else if(itemName == "Grilled salmon"){
			price = 180.0 * quantity;
			return price;
		}
		else if(itemName == "Fish and chips"){
			price = 150.0 * quantity;
			return price;
		}
		else if(itemName == "Chicken steak"){
			price = 160.0 * quantity;
			return price;
		}
		else if(itemName == "Veg steak"){
			price = 190.0 * quantity;
			return price;
		}
		else if(itemName == "Mashed potato"){
			price = 170.0 * quantity;
			return price;
		}
		else if(itemName == "Coleslaw salad"){
			price = 200.0 * quantity;
			return price;
		}
		else if(itemName == "Caesar salad"){
			price = 180.0 * quantity;
			return price;
		}
		else if(itemName == "Greek salad"){
			price = 210.0 * quantity;
			return price;
		}
		else if(itemName == "Chicken caesar salad"){
			price = 140.0 * quantity;
			return price;
		}
		else if(itemName == "Chocolate lava cake"){
			price = 190.0 * quantity;
			return price;
		}
		else if(itemName == "Cheesecake slice"){
			price = 180.0 * quantity;
			return price;
		}
		else if(itemName == "Blueberry cheesecake"){
			price = 120.0 * quantity;
			return price;
		}
		else if(itemName == "Brownie fudge "){
			price = 140.0 * quantity;
			return price;
		}
		else if(itemName == "Chocolate mousse"){
			price = 90.0 * quantity;
			return price;
		}
		else if(itemName == "Vanilla mousse"){
			price = 110.0 * quantity;
			return price;
		}
		else if(itemName == "Caramel pudding"){
			price = 170.0 * quantity;
			return price;
		}
		else if(itemName == "Iced latte"){
			price = 180.0 * quantity;
			return price;
		}
		else if(itemName == "Cappuccino hot"){
			price = 170.0 * quantity;
			return price;
		}
		else if(itemName == "Espresso shot"){
			price = 150.0 * quantity;
			return price;
		}
		else if(itemName == "Mocha coffee"){
			price = 160.0 * quantity;
			return price;
		}
		else if(itemName == "Hazelnut coffee"){
			price = 130.0 * quantity;
			return price;
		}
		else if(itemName == "Caramel latte"){
			price = 140.0 * quantity;
			return price;
		}
		else if(itemName == "Mint cooler"){
			price = 120.0 * quantity;
			return price;
		}
		else if(itemName == "Lime soda"){
			price = 150.0 * quantity;
			return price;
		}
		else if(itemName == "Orange fizz"){
			price = 160.0 * quantity;
			return price;
		}
		else if(itemName == "Berry blast"){
			price = 90.0 * quantity;
			return price;
		}
		else if(itemName == "Watermelon juice"){
			price = 90.0 * quantity;
			return price;
		}
		else if(itemName == "Pineapple juice"){
			price = 140.0 * quantity;
			return price;
		}
		else if(itemName == "Mango smoothie"){
			price = 130.0 * quantity;
			return price;
		}
		else if(itemName == "Banana smoothie"){
			price = 120.0 * quantity;
			return price;
		}
		else if(itemName == "Protein shake"){
			price = 110.0 * quantity;
			return price;
		}
		else{
			System.out.println(itemName + " not found");
		}
		return price;
}
}