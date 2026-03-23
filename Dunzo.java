class Dunzo{
	public static double search(String itemName){
		double price = 0.0;

		if(itemName == "Cold coffee bottle"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Iced mocha"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Vanilla milkshake"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Chocolate milkshake"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Strawberry milkshake"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Mango smoothie"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Banana smoothie"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Protein shake vanilla"){
			price = 200.0;
			return price;
		}
		else if(itemName == "Protein shake chocolate"){
			price = 210.0;
			return price;
		}
		else if(itemName == "Green detox juice"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Orange fresh juice"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Watermelon juice"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Pineapple juice"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Apple juice fresh"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Carrot juice fresh"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Beetroot juice"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Mixed fruit juice"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Lassi sweet"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Lassi salted"){
			price = 110.0;
			return price;
		}
		else if(itemName == "Buttermilk spiced"){
			price = 100.0;
			return price;
		}
		else if(itemName == "Cold badam milk"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Rose milk"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Falooda special"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Kulfi falooda"){
			price = 200.0;
			return price;
		}
		else if(itemName == "Chocolate sundae"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Vanilla sundae"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Strawberry sundae"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Brownie sundae"){
			price = 190.0;
			return price;
		}
		else if(itemName == "Ice cream tub chocolate"){
			price = 220.0;
			return price;
		}
		else if(itemName == "Ice cream tub vanilla"){
			price = 200.0;
			return price;
		}
		else if(itemName == "Ice cream tub strawberry"){
			price = 210.0;
			return price;
		}
		else if(itemName == "Cup ice cream mango"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Cup ice cream pista"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Chocolate cone ice cream"){
			price = 110.0;
			return price;
		}
		else if(itemName == "Vanilla cone ice cream"){
			price = 100.0;
			return price;
		}
		else if(itemName == "Strawberry cone ice cream"){
			price = 110.0;
			return price;
		}
		else if(itemName == "Dry fruit shake"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Dates milkshake"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Kitkat shake"){
			price = 190.0;
			return price;
		}
		else if(itemName == "Oreo shake"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Snickers shake"){
			price = 200.0;
			return price;
		}
		else if(itemName == "Cold brew coffee"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Caramel cold coffee"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Hazelnut cold coffee"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Mocha frappe"){
			price = 190.0;
			return price;
		}
		else if(itemName == "Caramel frappe"){
			price = 200.0;
			return price;
		}
		else if(itemName == "Vanilla frappe"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Chocolate frappe"){
			price = 190.0;
			return price;
		}
		else if(itemName == "Green tea cold"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Lemon iced tea"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Peach iced tea"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Blueberry iced tea"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Mint lemonade"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Virgin mojito"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Sparkling lemonade"){
			price = 150.0;
			return price;
		}
		else{
			System.out.println(itemName + " not found");
		}
		return price;
	}
	
	public static double search(String itemName, int quantity){
	double price = 0.0;

	if(itemName == "Cold coffee bottle"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Iced mocha"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Vanilla milkshake"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Chocolate milkshake"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Strawberry milkshake"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Mango smoothie"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Banana smoothie"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Protein shake vanilla"){
		price = 200.0 * quantity;
		return price;
	}
	else if(itemName == "Protein shake chocolate"){
		price = 210.0 * quantity;
		return price;
	}
	else if(itemName == "Green detox juice"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Orange fresh juice"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Watermelon juice"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Pineapple juice"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Apple juice fresh"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Carrot juice fresh"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Beetroot juice"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Mixed fruit juice"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Lassi sweet"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Lassi salted"){
		price = 110.0 * quantity;
		return price;
	}
	else if(itemName == "Buttermilk spiced"){
		price = 100.0 * quantity;
		return price;
	}
	else if(itemName == "Cold badam milk"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Rose milk"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Falooda special"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Kulfi falooda"){
		price = 200.0 * quantity;
		return price;
	}
	else if(itemName == "Chocolate sundae"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Vanilla sundae"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Strawberry sundae"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Brownie sundae"){
		price = 190.0 * quantity;
		return price;
	}
	else if(itemName == "Ice cream tub chocolate"){
		price = 220.0 * quantity;
		return price;
	}
	else if(itemName == "Ice cream tub vanilla"){
		price = 200.0 * quantity;
		return price;
	}
	else if(itemName == "Ice cream tub strawberry"){
		price = 210.0 * quantity;
		return price;
	}
	else if(itemName == "Cup ice cream mango"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Cup ice cream pista"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Chocolate cone ice cream"){
		price = 110.0 * quantity;
		return price;
	}
	else if(itemName == "Vanilla cone ice cream"){
		price = 100.0 * quantity;
		return price;
	}
	else if(itemName == "Strawberry cone ice cream"){
		price = 110.0 * quantity;
		return price;
	}
	else if(itemName == "Dry fruit shake"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Dates milkshake"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Kitkat shake"){
		price = 190.0 * quantity;
		return price;
	}
	else if(itemName == "Oreo shake"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Snickers shake"){
		price = 200.0 * quantity;
		return price;
	}
	else if(itemName == "Cold brew coffee"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Caramel cold coffee"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Hazelnut cold coffee"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Mocha frappe"){
		price = 190.0 * quantity;
		return price;
	}
	else if(itemName == "Caramel frappe"){
		price = 200.0 * quantity;
		return price;
	}
	else if(itemName == "Vanilla frappe"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Chocolate frappe"){
		price = 190.0 * quantity;
		return price;
	}
	else if(itemName == "Green tea cold"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Lemon iced tea"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Peach iced tea"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Blueberry iced tea"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Mint lemonade"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Virgin mojito"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Sparkling lemonade"){
		price = 150.0 * quantity;
		return price;
	}
	else{
		System.out.println(itemName + " not found");
	}
	return price;
}

}