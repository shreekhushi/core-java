class Zepto{
	public static double search(String itemName){
		double price = 0.0;
		if(itemName == "Banana"){
			price = 50.0;
			return price;
		}
		else if(itemName == "Apple"){
			price = 100.0;
			return price;
		}
		else if(itemName == "Orange"){
			price = 80.0;
			return price;
		}
		else if(itemName == "Tomato"){
			price = 30.0;
			return price;
		}
		else if(itemName == "Potato"){
			price = 25.0;
			return price;
		}
		else if(itemName == "Onion"){
			price = 30.0;
			return price;
		}
		else if(itemName == "Carrot"){
			price = 40.0;
			return price;
		}
		else if(itemName == "Spinach"){
			price = 20.0;
			return price;
		}
		else if(itemName == "Capsicum"){
			price = 40.0;
			return price;
		}
		else if(itemName == "Cucumber"){
			price = 30.0;
			return price;
		}
		else if(itemName == "Milk"){
			price = 55.0;
			return price;
		}
		else if(itemName == "Curd"){
			price = 35.0;
			return price;
		}
		else if(itemName == "Butter"){
			price = 70.0;
			return price;
		}
		else if(itemName == "Cheese"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Paneer"){
			price = 80.0;
			return price;
		}
		else if(itemName == "Bread"){
			price = 42.0;
			return price;
		}
		else if(itemName == "Eggs"){
			price = 70.0;
			return price;
		}
		else if(itemName == "Cornflakes"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Oats"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Peanut butter"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Rice"){
			price = 52.0;
			return price;
		}
		else if(itemName == "Wheat flour"){
			price = 40.0;
			return price;
		}
		else if(itemName == "Sugar"){
			price = 30.0;
			return price;
		}
		else if(itemName == "Salt"){
			price = 20.0;
			return price;
		}
		else if(itemName == "Cooking oil"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Ghee"){
			price = 280.0;
			return price;
		}
		else if(itemName == "Tur Dal"){
			price = 200.0;
			return price;
		}
		else if(itemName == "Moong Dal"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Chana Dal"){
			price = 90.0;
			return price;
		}
		else if(itemName == "Poha"){
			price = 45.0;
			return price;
		}
		else if(itemName == "Biscuits"){
			price = 10.0;
			return price;
		}
		else if(itemName == "Chips"){
			price = 20.0;
			return price;
		}
		else if(itemName == "Namkeen"){
			price = 50.0;
			return price;
		}
		else if(itemName == "Instant Noodles"){
			price = 14.0;
			return price;
		}
		else if(itemName == "Pasta"){
			price = 55.0;
			return price;
		}
		else if(itemName == "Maggi"){
			price = 14.0;
			return price;
		}
		else if(itemName == "Chocolate"){
			price = 20.0;
			return price;
		}
		else if(itemName == "Popcorn"){
			price = 40.0;
			return price;
		}
		else if(itemName == "Energy Bars"){
			price = 33.0;
			return price;
		}
		else if(itemName == "Dry fruits"){
			price = 250.0;
			return price;
		}
		else if(itemName == "Shampoo"){
			price = 300.0;
			return price;
		}
		else if(itemName == "Soap"){
			price = 30.0;
			return price;
		}
		else if(itemName == "Toothpaste"){
			price = 85.0;
			return price;
		}
		else if(itemName == "Toothbrush"){
			price = 30.0;
			return price;
		}
		else if(itemName == "Face wash"){
			price = 125.0;
			return price;
		}
		else if(itemName == "Body lotion"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Detergent Powder"){
			price = 138.0;
			return price;
		}
		else if(itemName == "Dishwash liquid"){
			price = 100.0;
			return price;
		}
		else if(itemName == "Hand wash"){
			price = 80.0;
			return price;
		}
		else if(itemName == "Garbage bags"){
			price = 42.0;
			return price;
		}
		else if(itemName == "Tea"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Coffee"){
			price = 210.0;
			return price;
		}
		else if(itemName == "Fruit juice"){
			price = 95.0;
			return price;
		}
		else if(itemName == "Soft drinks"){
			price = 53.0;
			return price;
		}
		else if(itemName == "Mineral water"){
			price = 38.0;
			return price;
		}
		else if(itemName == "Coconut water"){
			price = 35.0;
			return price;
		}
		else if(itemName == "Energy drinks"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Milkshake"){
			price = 105.0;
			return price;
		}
		else if(itemName == "Yogurt"){
			price = 35.0;
			return price;
		}
		else{
			System.out.println(itemName + "not found");
		}
		return price;
	}
	
	
	public static double search(String itemName, int quantity){
		double price = 0.0;
		if(itemName == "Banana"){
			price = 50.0 * quantity;
			return price;
		}
		else if(itemName == "Apple"){
			price = 100.0 * quantity;
			return price;
		}
		else if(itemName == "Orange"){
			price = 80.0 * quantity;
			return price;
		}
		else if(itemName == "Tomato"){
			price = 30.0 * quantity;
			return price;
		}
		else if(itemName == "Potato"){
			price = 25.0* quantity;
			return price;
		}
		else if(itemName == "Onion"){
			price = 30.0 * quantity;
			return price;
		}
		else if(itemName == "Carrot"){
			price = 40.0 * quantity;
			return price;
		}
		else if(itemName == "Spinach"){
			price = 20.0 * quantity;
			return price;
		}
		else if(itemName == "Capsicum"){
			price = 40.0 * quantity;
			return price;
		}
		else if(itemName == "Cucumber"){
			price = 30.0 * quantity;
			return price;
		}
		else if(itemName == "Milk"){
			price = 55.0* quantity;
			return price;
		}
		else if(itemName == "Curd"){
			price = 35.0 * quantity;
			return price;
		}
		else if(itemName == "Butter"){
			price = 70.0 * quantity;
			return price;
		}
		else if(itemName == "Cheese"){
			price = 120.0 * quantity;
			return price;
		}
		else if(itemName == "Paneer"){
			price = 80.0 * quantity;
			return price;
		}
		else if(itemName == "Bread"){
			price = 42.0 * quantity;
			return price;
		}
		else if(itemName == "Eggs"){
			price = 70.0 * quantity;
			return price;
		}
		else if(itemName == "Cornflakes"){
			price = 150.0 * quantity;
			return price;
		}
		else if(itemName == "Oats"){
			price = 120.0 * quantity;
			return price;
		}
		else if(itemName == "Peanut butter"){
			price = 180.0 * quantity;
			return price;
		}
		else if(itemName == "Rice"){
			price = 52.0 * quantity;
			return price;
		}
		else if(itemName == "Wheat flour"){
			price = 40.0 * quantity;
			return price;
		}
		else if(itemName == "Sugar"){
			price = 30.0 * quantity;
			return price;
		}
		else if(itemName == "Salt"){
			price = 20.0 * quantity;
			return price;
		}
		else if(itemName == "Cooking oil"){
			price = 120.0 * quantity;
			return price;
		}
		else if(itemName == "Ghee"){
			price = 280.0 * quantity;
			return price;
		}
		else if(itemName == "Tur Dal"){
			price = 200.0 * quantity;
			return price;
		}
		else if(itemName == "Moong Dal"){
			price = 130.0 * quantity;
			return price;
		}
		else if(itemName == "Chana Dal"){
			price = 90.0 * quantity;
			return price;
		}
		else if(itemName == "Poha"){
			price = 45.0 * quantity;
			return price;
		}
		else if(itemName == "Biscuits"){
			price = 10.0 * quantity;
			return price;
		}
		else if(itemName == "Chips"){
			price = 20.0 * quantity;
			return price;
		}
		else if(itemName == "Namkeen"){
			price = 50.0 * quantity;
			return price;
		}
		else if(itemName == "Instant Noodles"){
			price = 14.0 * quantity;
			return price;
		}
		else if(itemName == "Pasta"){
			price = 55.0 * quantity;
			return price;
		}
		else if(itemName == "Maggi"){
			price = 14.0 * quantity;
			return price;
		}
		else if(itemName == "Chocolate"){
			price = 20.0 * quantity;
			return price;
		}
		else if(itemName == "Popcorn"){
			price = 40.0 * quantity;
			return price;
		}
		else if(itemName == "Energy Bars"){
			price = 33.0 * quantity;
			return price;
		}
		else if(itemName == "Dry fruits"){
			price = 250.0 * quantity;
			return price;
		}
		else if(itemName == "Shampoo"){
			price = 300.0 * quantity;
			return price;
		}
		else if(itemName == "Soap"){
			price = 30.0 * quantity;
			return price;
		}
		else if(itemName == "Toothpaste"){
			price = 85.0 * quantity;
			return price;
		}
		else if(itemName == "Toothbrush"){
			price = 30.0 * quantity;
			return price;
		}
		else if(itemName == "Face wash"){
			price = 125.0 * quantity;
			return price;
		}
		else if(itemName == "Body lotion"){
			price = 150.0 * quantity;
			return price;
		}
		else if(itemName == "Detergent Powder"){
			price = 138.0 * quantity;
			return price;
		}
		else if(itemName == "Dishwash liquid"){
			price = 100.0 * quantity;
			return price;
		}
		else if(itemName == "Hand wash"){
			price = 80.0 * quantity;
			return price;
		}
		else if(itemName == "Garbage bags"){
			price = 42.0 * quantity;
			return price;
		}
		else if(itemName == "Tea"){
			price = 150.0 * quantity;
			return price;
		}
		else if(itemName == "Coffee"){
			price = 210.0 * quantity;
			return price;
		}
		else if(itemName == "Fruit juice"){
			price = 95.0 * quantity;
			return price;
		}
		else if(itemName == "Soft drinks"){
			price = 53.0 * quantity;
			return price;
		}
		else if(itemName == "Mineral water"){
			price = 38.0 * quantity;
			return price;
		}
		else if(itemName == "Coconut water"){
			price = 35.0 * quantity;
			return price;
		}
		else if(itemName == "Energy drinks"){
			price = 140.0 * quantity;
			return price;
		}
		else if(itemName == "Milkshake"){
			price = 105.0 * quantity;
			return price;
		}
		else if(itemName == "Yogurt"){
			price = 35.0 * quantity;
			return price;
		}
		else{
			System.out.println(itemName + "not found");
		}
		return price;
	}
}