class EatSure{
	public static double search(String itemName){
		double price = 0.0;

		if(itemName == "Rajma chawal combo"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Chole rice combo"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Dal fry rice"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Dal tadka rice"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Veg khichdi"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Masala khichdi"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Curd rice bowl"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Lemon rice bowl"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Tomato rice bowl"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Bisibele bath"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Veg thali mini"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Veg thali deluxe"){
			price = 220.0;
			return price;
		}
		else if(itemName == "South indian thali"){
			price = 200.0;
			return price;
		}
		else if(itemName == "North indian thali"){
			price = 210.0;
			return price;
		}
		else if(itemName == "Mini meals combo"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Full meals combo"){
			price = 240.0;
			return price;
		}
		else if(itemName == "Veg sambar rice"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Curd meal combo"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Chapati sabzi combo"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Paratha sabzi combo"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Paneer curry combo"){
			price = 200.0;
			return price;
		}
		else if(itemName == "Mixed veg curry combo"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Aloo gobi combo"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Aloo matar combo"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Baingan bharta combo"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Bhindi masala combo"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Vegetable korma combo"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Paneer tikka masala combo"){
			price = 210.0;
			return price;
		}
		else if(itemName == "Veg handi combo"){
			price = 190.0;
			return price;
		}
		else if(itemName == "Jeera aloo combo"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Veg pulao combo"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Paneer pulao combo"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Peas pulao combo"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Veg biryani combo"){
			price = 190.0;
			return price;
		}
		else if(itemName == "Curd biryani combo"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Tamarind rice combo"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Coconut rice combo"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Vegetable upma bowl"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Rava kesari combo"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Pongal combo special"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Idli combo meal"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Dosa combo meal"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Set dosa combo"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Uttapam combo"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Masala dosa combo"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Plain dosa combo"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Rava dosa combo"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Onion dosa combo"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Ghee dosa combo"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Paper dosa combo"){
			price = 190.0;
			return price;
		}
		else if(itemName == "Curd vada combo"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Medu vada combo"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Veg cutlet combo"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Vegetable pakora combo"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Paneer pakora combo"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Veg sandwich combo"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Grilled veg sandwich combo"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Veg burger combo"){
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

	if(itemName == "Rajma chawal combo"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Chole rice combo"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Dal fry rice"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Dal tadka rice"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Veg khichdi"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Masala khichdi"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Curd rice bowl"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Lemon rice bowl"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Tomato rice bowl"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Bisibele bath"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Veg thali mini"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Veg thali deluxe"){
		price = 220.0 * quantity;
		return price;
	}
	else if(itemName == "South indian thali"){
		price = 200.0 * quantity;
		return price;
	}
	else if(itemName == "North indian thali"){
		price = 210.0 * quantity;
		return price;
	}
	else if(itemName == "Mini meals combo"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Full meals combo"){
		price = 240.0 * quantity;
		return price;
	}
	else if(itemName == "Veg sambar rice"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Curd meal combo"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Chapati sabzi combo"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Paratha sabzi combo"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Paneer curry combo"){
		price = 200.0 * quantity;
		return price;
	}
	else if(itemName == "Mixed veg curry combo"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Aloo gobi combo"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Aloo matar combo"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Baingan bharta combo"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Bhindi masala combo"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Vegetable korma combo"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Paneer tikka masala combo"){
		price = 210.0 * quantity;
		return price;
	}
	else if(itemName == "Veg handi combo"){
		price = 190.0 * quantity;
		return price;
	}
	else if(itemName == "Jeera aloo combo"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Veg pulao combo"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Paneer pulao combo"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Peas pulao combo"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Veg biryani combo"){
		price = 190.0 * quantity;
		return price;
	}
	else if(itemName == "Curd biryani combo"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Tamarind rice combo"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Coconut rice combo"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Vegetable upma bowl"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Rava kesari combo"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Pongal combo special"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Idli combo meal"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Dosa combo meal"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Set dosa combo"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Uttapam combo"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Masala dosa combo"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Plain dosa combo"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Rava dosa combo"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Onion dosa combo"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Ghee dosa combo"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Paper dosa combo"){
		price = 190.0 * quantity;
		return price;
	}
	else if(itemName == "Curd vada combo"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Medu vada combo"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Veg cutlet combo"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Vegetable pakora combo"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Paneer pakora combo"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Veg sandwich combo"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Grilled veg sandwich combo"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Veg burger combo"){
		price = 160.0 * quantity;
		return price;
	}
	else{
		System.out.println(itemName + " not found");
	}
	return price;
}
}