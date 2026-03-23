class Swiggy{
	public static double search(String itemName){
		double price = 0.0;
		if(itemName == "Dosa"){
			price = 50.0;
			return price;
		}
		else if(itemName == "Ghee dosa"){
			price = 100.0;
			return price;
		}
		else if(itemName == "Ghee pudi masala dosa"){
			price = 80.0;
			return price;
		}
		else if(itemName == "Masala dosa"){
			price = 30.0;
			return price;
		}
		else if(itemName == "Open dosa"){
			price = 25.0;
			return price;
		}
		else if(itemName == "Onion dosa "){
			price = 30.0;
			return price;
		}
		else if(itemName == "Chicken Breast"){
			price = 40.0;
			return price;
		}
		else if(itemName == "Cakes"){
			price = 20.0;
			return price;
		}
		else if(itemName == "Brownies"){
			price = 40.0;
			return price;
		}
		else if(itemName == "Miffins"){
			price = 30.0;
			return price;
		}
		else if(itemName == "Donuts"){
			price = 55.0;
			return price;
		}
		else if(itemName == "Ice cream"){
			price = 35.0;
			return price;
		}
		else if(itemName == "Pastries"){
			price = 70.0;
			return price;
		}
		else if(itemName == "Waffles"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Cupcakes"){
			price = 80.0;
			return price;
		}
		else if(itemName == "Deserts"){
			price = 42.0;
			return price;
		}
		else if(itemName == "Eggs"){
			price = 70.0;
			return price;
		}
		else if(itemName == "Chicken biriyani"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Mutton biriyani"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Veg biriyani"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Paneer butter masala"){
			price = 52.0;
			return price;
		}
		else if(itemName == "Butter naan"){
			price = 40.0;
			return price;
		}
		else if(itemName == "Dal makhani"){
			price = 30.0;
			return price;
		}
		else if(itemName == "Chicken curry"){
			price = 20.0;
			return price;
		}
		else if(itemName == "Kadai Paneer"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Jeera rice"){
			price = 280.0;
			return price;
		}
		else if(itemName == "Pizza "){
			price = 200.0;
			return price;
		}
		else if(itemName == "Farmhouse pizza"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Cheese burger"){
			price = 90.0;
			return price;
		}
		else if(itemName == "Chicken burger"){
			price = 45.0;
			return price;
		}
		else if(itemName == "French fries"){
			price = 10.0;
			return price;
		}
		else if(itemName == "White sauce Pasta"){
			price = 20.0;
			return price;
		}
		else if(itemName == "Red sauce pasta"){
			price = 50.0;
			return price;
		}
		else if(itemName == "Sandwich"){
			price = 14.0;
			return price;
		}
		else if(itemName == "Hot dog"){
			price = 55.0;
			return price;
		}
		else if(itemName == "Maggi"){
			price = 14.0;
			return price;
		}
		else if(itemName == "Veg fried rice"){
			price = 20.0;
			return price;
		}
		else if(itemName == "Chicken fried rice"){
			price = 40.0;
			return price;
		}
		else if(itemName == "Hakka Noodles"){
			price = 33.0;
			return price;
		}
		else if(itemName == "Chicken Noodles"){
			price = 250.0;
			return price;
		}
		else if(itemName == "Veg momos"){
			price = 300.0;
			return price;
		}
		else if(itemName == "Chicken momos"){
			price = 30.0;
			return price;
		}
		else if(itemName == "Spring rolls"){
			price = 85.0;
			return price;
		}
		else if(itemName == "Gobi manchurian"){
			price = 30.0;
			return price;
		}
		else if(itemName == "Chilli chicken"){
			price = 125.0;
			return price;
		}
		else if(itemName == "Schezwan rice"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Idli"){
			price = 138.0;
			return price;
		}
		else if(itemName == "medu vada"){
			price = 100.0;
			return price;
		}
		else if(itemName == "Upma"){
			price = 80.0;
			return price;
		}
		else if(itemName == "Pongal"){
			price = 42.0;
			return price;
		}
		else if(itemName == "Set dosa"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Chicken roll"){
			price = 210.0;
			return price;
		}
		else if(itemName == "Shawarma"){
			price = 95.0;
			return price;
		}
		else if(itemName == "Samosa"){
			price = 53.0;
			return price;
		}
		else if(itemName == "Pav Bhaji"){
			price = 38.0;
			return price;
		}
		else if(itemName == "Vada pav"){
			price = 35.0;
			return price;
		}
		else if(itemName == "Chole bhature"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Chocolate cake"){
			price = 105.0;
			return price;
		}
		else if(itemName == "Kaju katli"){
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
		if(itemName == "Dosa"){
			price = 50.0 * quantity;
			return price;
		}
		else if(itemName == "Ghee dosa"){
			price = 100.0 * quantity;
			return price;
		}
		else if(itemName == "Ghee pudi masala dosa"){
			price = 80.0 * quantity;
			return price;
		}
		else if(itemName == "Masala dosa"){
			price = 30.0 * quantity;
			return price;
		}
		else if(itemName == "Open dosa"){
			price = 25.0 * quantity;
			return price;
		}
		else if(itemName == "Onion dosa "){
			price = 30.0 * quantity;
			return price;
		}
		else if(itemName == "Chicken Breast"){
			price = 40.0 * quantity;
			return price;
		}
		else if(itemName == "Cakes"){
			price = 20.0 * quantity;
			return price;
		}
		else if(itemName == "Brownies"){
			price = 40.0 * quantity;
			return price;
		}
		else if(itemName == "Miffins"){
			price = 30.0 * quantity;
			return price;
		}
		else if(itemName == "Donuts"){
			price = 55.0 * quantity;
			return price;
		}
		else if(itemName == "Ice cream"){
			price = 35.0 * quantity;
			return price;
		}
		else if(itemName == "Pastries"){
			price = 70.0 * quantity;
			return price;
		}
		else if(itemName == "Waffles"){
			price = 120.0 * quantity;
			return price;
		}
		else if(itemName == "Cupcakes"){
			price = 80.0 * quantity;
			return price;
		}
		else if(itemName == "Deserts"){
			price = 42.0 * quantity;
			return price;
		}
		else if(itemName == "Eggs"){
			price = 70.0 * quantity;
			return price;
		}
		else if(itemName == "Chicken biriyani"){
			price = 150.0 * quantity;
			return price;
		}
		else if(itemName == "Mutton biriyani"){
			price = 120.0 * quantity;
			return price;
		}
		else if(itemName == "Veg biriyani"){
			price = 180.0 * quantity;
			return price;
		}
		else if(itemName == "Paneer butter masala"){
			price = 52.0 * quantity;
			return price;
		}
		else if(itemName == "Butter naan"){
			price = 40.0 * quantity;
			return price;
		}
		else if(itemName == "Dal makhani"){
			price = 30.0 * quantity;
			return price;
		}
		else if(itemName == "Chicken curry"){
			price = 20.0 * quantity;
			return price;
		}
		else if(itemName == "Kadai Paneer"){
			price = 120.0 * quantity;
			return price;
		}
		else if(itemName == "Jeera rice"){
			price = 280.0 * quantity;
			return price;
		}
		else if(itemName == "Pizza "){
			price = 200.0 * quantity;
			return price;
		}
		else if(itemName == "Farmhouse pizza"){
			price = 130.0 * quantity;
			return price;
		}
		else if(itemName == "Cheese burger"){
			price = 90.0 * quantity;
			return price;
		}
		else if(itemName == "Chicken burger"){
			price = 45.0 * quantity;
			return price;
		}
		else if(itemName == "French fries"){
			price = 10.0 * quantity;
			return price;
		}
		else if(itemName == "White sauce Pasta"){
			price = 20.0 * quantity;
			return price;
		}
		else if(itemName == "Red sauce pasta"){
			price = 50.0 * quantity;
			return price;
		}
		else if(itemName == "Sandwich"){
			price = 14.0 * quantity;
			return price;
		}
		else if(itemName == "Hot dog"){
			price = 55.0 * quantity;
			return price;
		}
		else if(itemName == "Maggi"){
			price = 14.0 * quantity;
			return price;
		}
		else if(itemName == "Veg fried rice"){
			price = 20.0 * quantity;
			return price;
		}
		else if(itemName == "Chicken fried rice"){
			price = 40.0 * quantity;
			return price;
		}
		else if(itemName == "Hakka Noodles"){
			price = 33.0 * quantity;
			return price;
		}
		else if(itemName == "Chicken Noodles"){
			price = 250.0 * quantity;
			return price;
		}
		else if(itemName == "Veg momos"){
			price = 300.0 * quantity;
			return price;
		}
		else if(itemName == "Chicken momos"){
			price = 30.0 * quantity;
			return price;
		}
		else if(itemName == "Spring rolls"){
			price = 85.0 * quantity;
			return price;
		}
		else if(itemName == "Gobi manchurian"){
			price = 30.0 * quantity;
			return price;
		}
		else if(itemName == "Chilli chicken"){
			price = 125.0 * quantity;
			return price;
		}
		else if(itemName == "Schezwan rice"){
			price = 150.0 * quantity;
			return price;
		}
		else if(itemName == "Idli"){
			price = 138.0 * quantity;
			return price;
		}
		else if(itemName == "medu vada"){
			price = 100.0 * quantity;
			return price;
		}
		else if(itemName == "Upma"){
			price = 80.0 * quantity;
			return price;
		}
		else if(itemName == "Pongal"){
			price = 42.0 * quantity;
			return price;
		}
		else if(itemName == "Set dosa"){
			price = 150.0 * quantity;
			return price;
		}
		else if(itemName == "Chicken roll"){
			price = 210.0 * quantity;
			return price;
		}
		else if(itemName == "Shawarma"){
			price = 95.0 * quantity;
			return price;
		}
		else if(itemName == "Samosa"){
			price = 53.0 * quantity;
			return price;
		}
		else if(itemName == "Pav Bhaji"){
			price = 38.0 * quantity;
			return price;
		}
		else if(itemName == "Vada pav"){
			price = 35.0 * quantity;
			return price;
		}
		else if(itemName == "Chole bhature"){
			price = 140.0 * quantity;
			return price;
		}
		else if(itemName == "Chocolate cake"){
			price = 105.0 * quantity;
			return price;
		}
		else if(itemName == "Kaju katli"){
			price = 35.0 * quantity;
			return price;
		}
		else{
			System.out.println(itemName + "not found");
		}
		return price;
	
	}
}