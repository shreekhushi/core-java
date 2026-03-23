class Zomato{
	public static double search(String itemName){
		double price = 0.0;

		if(itemName == "Tandoori chicken"){
			price = 220.0;
			return price;
		}
		else if(itemName == "Paneer tikka"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Fish fry"){
			price = 250.0;
			return price;
		}
		else if(itemName == "Veg pulao"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Chicken kebab"){
			price = 210.0;
			return price;
		}
		else if(itemName == "Falooda"){
			price = 90.0;
			return price;
		}
		else if(itemName == "Rasgulla"){
			price = 60.0;
			return price;
		}
		else if(itemName == "Gulab jamun"){
			price = 70.0;
			return price;
		}
		else if(itemName == "Rabri"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Kulfi"){
			price = 80.0;
			return price;
		}
		else if(itemName == "Mango lassi"){
			price = 110.0;
			return price;
		}
		else if(itemName == "Butter chicken"){
			price = 260.0;
			return price;
		}
		else if(itemName == "Chicken tikka masala"){
			price = 240.0;
			return price;
		}
		else if(itemName == "Veg kofta"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Palak paneer"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Dal tadka"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Plain rice"){
			price = 90.0;
			return price;
		}
		else if(itemName == "Garlic naan"){
			price = 60.0;
			return price;
		}
		else if(itemName == "Rumali roti"){
			price = 40.0;
			return price;
		}
		else if(itemName == "Egg curry"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Chicken stew"){
			price = 200.0;
			return price;
		}
		else if(itemName == "Mutton curry"){
			price = 280.0;
			return price;
		}
		else if(itemName == "Veg sandwich"){
			price = 100.0;
			return price;
		}
		else if(itemName == "Chicken sandwich"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Grilled chicken"){
			price = 220.0;
			return price;
		}
		else if(itemName == "Pasta alfredo"){
			price = 190.0;
			return price;
		}
		else if(itemName == "Pasta arrabbiata"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Lasagna"){
			price = 240.0;
			return price;
		}
		else if(itemName == "Cheese balls"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Spring dosa"){
			price = 90.0;
			return price;
		}
		else if(itemName == "Rava idli"){
			price = 70.0;
			return price;
		}
		else if(itemName == "Mini idli"){
			price = 80.0;
			return price;
		}
		else if(itemName == "Tomato soup"){
			price = 60.0;
			return price;
		}
		else if(itemName == "Sweet corn soup"){
			price = 80.0;
			return price;
		}
		else if(itemName == "Manchow soup"){
			price = 90.0;
			return price;
		}
		else if(itemName == "Veg noodles"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Egg noodles"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Chilli paneer dry"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Chilli potato"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Dragon chicken"){
			price = 230.0;
			return price;
		}
		else if(itemName == "Chicken popcorn"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Chicken strips"){
			price = 150.0;
			return price;
		}
		else if(itemName == "French toast"){
			price = 110.0;
			return price;
		}
		else if(itemName == "Omelette"){
			price = 50.0;
			return price;
		}
		else if(itemName == "Boiled eggs"){
			price = 40.0;
			return price;
		}
		else if(itemName == "Veg wrap"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Chicken wrap"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Paneer wrap"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Cold coffee"){
			price = 90.0;
			return price;
		}
		else if(itemName == "Hot chocolate"){
			price = 110.0;
			return price;
		}
		else if(itemName == "Lemon tea"){
			price = 60.0;
			return price;
		}
		else if(itemName == "Green tea"){
			price = 70.0;
			return price;
		}
		else if(itemName == "Black coffee"){
			price = 80.0;
			return price;
		}
		else if(itemName == "Milk coffee"){
			price = 100.0;
			return price;
		}
		else if(itemName == "Fruit salad"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Veg salad"){
			price = 90.0;
			return price;
		}
		else if(itemName == "Chicken salad"){
			price = 160.0;
			return price;
		}
		else{
			System.out.println(itemName + " not found");
		}
		return price;
	}
	
	public static double search(String itemName, int quantity){
	double price = 0.0;

	if(itemName == "Tandoori chicken"){
		price = 220.0 * quantity;
		return price;
	}
	else if(itemName == "Paneer tikka"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Fish fry"){
		price = 250.0 * quantity;
		return price;
	}
	else if(itemName == "Veg pulao"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Chicken kebab"){
		price = 210.0 * quantity;
		return price;
	}
	else if(itemName == "Falooda"){
		price = 90.0 * quantity;
		return price;
	}
	else if(itemName == "Rasgulla"){
		price = 60.0 * quantity;
		return price;
	}
	else if(itemName == "Gulab jamun"){
		price = 70.0 * quantity;
		return price;
	}
	else if(itemName == "Rabri"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Kulfi"){
		price = 80.0 * quantity;
		return price;
	}
	else if(itemName == "Mango lassi"){
		price = 110.0 * quantity;
		return price;
	}
	else if(itemName == "Butter chicken"){
		price = 260.0 * quantity;
		return price;
	}
	else if(itemName == "Chicken tikka masala"){
		price = 240.0 * quantity;
		return price;
	}
	else if(itemName == "Veg kofta"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Palak paneer"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Dal tadka"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Plain rice"){
		price = 90.0 * quantity;
		return price;
	}
	else if(itemName == "Garlic naan"){
		price = 60.0 * quantity;
		return price;
	}
	else if(itemName == "Rumali roti"){
		price = 40.0 * quantity;
		return price;
	}
	else if(itemName == "Egg curry"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Chicken stew"){
		price = 200.0 * quantity;
		return price;
	}
	else if(itemName == "Mutton curry"){
		price = 280.0 * quantity;
		return price;
	}
	else if(itemName == "Veg sandwich"){
		price = 100.0 * quantity;
		return price;
	}
	else if(itemName == "Chicken sandwich"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Grilled chicken"){
		price = 220.0 * quantity;
		return price;
	}
	else if(itemName == "Pasta alfredo"){
		price = 190.0 * quantity;
		return price;
	}
	else if(itemName == "Pasta arrabbiata"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Lasagna"){
		price = 240.0 * quantity;
		return price;
	}
	else if(itemName == "Cheese balls"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Spring dosa"){
		price = 90.0 * quantity;
		return price;
	}
	else if(itemName == "Rava idli"){
		price = 70.0 * quantity;
		return price;
	}
	else if(itemName == "Mini idli"){
		price = 80.0 * quantity;
		return price;
	}
	else if(itemName == "Tomato soup"){
		price = 60.0 * quantity;
		return price;
	}
	else if(itemName == "Sweet corn soup"){
		price = 80.0 * quantity;
		return price;
	}
	else if(itemName == "Manchow soup"){
		price = 90.0 * quantity;
		return price;
	}
	else if(itemName == "Veg noodles"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Egg noodles"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Chilli paneer dry"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Chilli potato"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Dragon chicken"){
		price = 230.0 * quantity;
		return price;
	}
	else if(itemName == "Chicken popcorn"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Chicken strips"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "French toast"){
		price = 110.0 * quantity;
		return price;
	}
	else if(itemName == "Omelette"){
		price = 50.0 * quantity;
		return price;
	}
	else if(itemName == "Boiled eggs"){
		price = 40.0 * quantity;
		return price;
	}
	else if(itemName == "Veg wrap"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Chicken wrap"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Paneer wrap"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Cold coffee"){
		price = 90.0 * quantity;
		return price;
	}
	else if(itemName == "Hot chocolate"){
		price = 110.0 * quantity;
		return price;
	}
	else if(itemName == "Lemon tea"){
		price = 60.0 * quantity;
		return price;
	}
	else if(itemName == "Green tea"){
		price = 70.0 * quantity;
		return price;
	}
	else if(itemName == "Black coffee"){
		price = 80.0 * quantity;
		return price;
	}
	else if(itemName == "Milk coffee"){
		price = 100.0 * quantity;
		return price;
	}
	else if(itemName == "Fruit salad"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Veg salad"){
		price = 90.0 * quantity;
		return price;
	}
	else if(itemName == "Chicken salad"){
		price = 160.0 * quantity;
		return price;
	}
	else{
		System.out.println(itemName + " not found");
	}
	return price;
}
}