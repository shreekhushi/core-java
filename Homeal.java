class Homeal{
	public static double search(String itemName){
		double price = 0.0;

		if(itemName == "Homemade veg meal"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Homemade chicken meal"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Homemade mutton meal"){
			price = 220.0;
			return price;
		}
		else if(itemName == "Chapati dal combo"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Rice dal combo"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Rice sambar combo"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Curd rice home"){
			price = 110.0;
			return price;
		}
		else if(itemName == "Lemon rice home"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Tomato rice home"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Vegetable curry meal"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Paneer curry meal"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Aloo fry meal"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Bhindi fry meal"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Gobi fry meal"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Mixed veg fry meal"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Chicken curry meal"){
			price = 190.0;
			return price;
		}
		else if(itemName == "Egg curry meal"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Fish curry meal"){
			price = 200.0;
			return price;
		}
		else if(itemName == "Dal khichdi home"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Veg khichdi home"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Masala khichdi home"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Upma home style"){
			price = 100.0;
			return price;
		}
		else if(itemName == "Poha home style"){
			price = 110.0;
			return price;
		}
		else if(itemName == "Idli home meal"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Dosa home meal"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Set dosa home"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Plain dosa home"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Rava dosa home"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Masala dosa home"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Uttapam home"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Chapati paneer meal"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Chapati veg meal"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Chapati chicken meal"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Rice paneer meal"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Rice veg meal"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Rice chicken meal"){
			price = 190.0;
			return price;
		}
		else if(itemName == "Rice egg meal"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Veg pulao home"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Paneer pulao home"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Peas pulao home"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Veg biryani home"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Chicken biryani home"){
			price = 220.0;
			return price;
		}
		else if(itemName == "Egg biryani home"){
			price = 200.0;
			return price;
		}
		else if(itemName == "Curd meal home"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Dal fry meal"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Dal tadka meal"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Veg thali home"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Mini thali home"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Full thali home"){
			price = 220.0;
			return price;
		}
		else if(itemName == "Sweet pongal home"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Kesari bath home"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Roti sabzi home"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Paratha sabzi home"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Veg cutlet home"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Pakora home"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Paneer pakora home"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Veg sandwich home"){
			price = 140.0;
			return price;
		}
		else{
			System.out.println(itemName + " not found");
		}
		return price;
	}
	
	public static double search(String itemName, int quantity){
	double price = 0.0;

	if(itemName == "Homemade veg meal"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Homemade chicken meal"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Homemade mutton meal"){
		price = 220.0 * quantity;
		return price;
	}
	else if(itemName == "Chapati dal combo"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Rice dal combo"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Rice sambar combo"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Curd rice home"){
		price = 110.0 * quantity;
		return price;
	}
	else if(itemName == "Lemon rice home"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Tomato rice home"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Vegetable curry meal"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Paneer curry meal"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Aloo fry meal"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Bhindi fry meal"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Gobi fry meal"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Mixed veg fry meal"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Chicken curry meal"){
		price = 190.0 * quantity;
		return price;
	}
	else if(itemName == "Egg curry meal"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Fish curry meal"){
		price = 200.0 * quantity;
		return price;
	}
	else if(itemName == "Dal khichdi home"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Veg khichdi home"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Masala khichdi home"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Upma home style"){
		price = 100.0 * quantity;
		return price;
	}
	else if(itemName == "Poha home style"){
		price = 110.0 * quantity;
		return price;
	}
	else if(itemName == "Idli home meal"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Dosa home meal"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Set dosa home"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Plain dosa home"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Rava dosa home"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Masala dosa home"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Uttapam home"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Chapati paneer meal"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Chapati veg meal"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Chapati chicken meal"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Rice paneer meal"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Rice veg meal"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Rice chicken meal"){
		price = 190.0 * quantity;
		return price;
	}
	else if(itemName == "Rice egg meal"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Veg pulao home"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Paneer pulao home"){
		price = 170.0 * quantity;
		return price;
	}
	else if(itemName == "Peas pulao home"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Veg biryani home"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Chicken biryani home"){
		price = 220.0 * quantity;
		return price;
	}
	else if(itemName == "Egg biryani home"){
		price = 200.0 * quantity;
		return price;
	}
	else if(itemName == "Curd meal home"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Dal fry meal"){
		price = 140.0 * quantity;
		return price;
	}
	else if(itemName == "Dal tadka meal"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Veg thali home"){
		price = 180.0 * quantity;
		return price;
	}
	else if(itemName == "Mini thali home"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Full thali home"){
		price = 220.0 * quantity;
		return price;
	}
	else if(itemName == "Sweet pongal home"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Kesari bath home"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Roti sabzi home"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Paratha sabzi home"){
		price = 160.0 * quantity;
		return price;
	}
	else if(itemName == "Veg cutlet home"){
		price = 120.0 * quantity;
		return price;
	}
	else if(itemName == "Pakora home"){
		price = 130.0 * quantity;
		return price;
	}
	else if(itemName == "Paneer pakora home"){
		price = 150.0 * quantity;
		return price;
	}
	else if(itemName == "Veg sandwich home"){
		price = 140.0 * quantity;
		return price;
	}
	else{
		System.out.println(itemName + " not found");
	}
	return price;
 }
}