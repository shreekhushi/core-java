class MagicPin{
	public static double search(String itemName){
		double price = 0.0;

		if(itemName == "BBQ chicken pizza"){
			price = 240.0;
			return price;
		}
		else if(itemName == "Veg extravaganza pizza"){
			price = 210.0;
			return price;
		}
		else if(itemName == "Chicken sausage pizza"){
			price = 220.0;
			return price;
		}
		else if(itemName == "Paneer cheese pizza"){
			price = 200.0;
			return price;
		}
		else if(itemName == "Mexican taco"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Chicken taco"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Veg burrito"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Chicken burrito"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Cheese quesadilla"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Chicken quesadilla"){
			price = 190.0;
			return price;
		}
		else if(itemName == "Loaded fries"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Peri peri fries"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Cheese fries"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Garlic breadsticks"){
			price = 110.0;
			return price;
		}
		else if(itemName == "Stuffed garlic bread"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Veg burger deluxe"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Chicken burger deluxe"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Double cheese burger"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Grilled veg sandwich"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Chicken club sandwich"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Veg noodles spicy"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Chicken noodles spicy"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Egg fried rice special"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Chicken fried rice special"){
			price = 190.0;
			return price;
		}
		else if(itemName == "Paneer fried rice"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Veg manchurian gravy"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Chicken manchurian gravy"){
			price = 200.0;
			return price;
		}
		else if(itemName == "Paneer chilli gravy"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Chicken chilli gravy"){
			price = 210.0;
			return price;
		}
		else if(itemName == "Veg spring dosa roll"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Cheese dosa roll"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Paneer dosa roll"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Chocolate waffle deluxe"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Strawberry waffle"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Blueberry pancake"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Chocolate pancake"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Vanilla milkshake"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Strawberry milkshake"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Chocolate milkshake"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Oreo shake"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Kitkat shake"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Cold cocoa"){
			price = 110.0;
			return price;
		}
		else if(itemName == "Ice lemon tea"){
			price = 90.0;
			return price;
		}
		else if(itemName == "Peach iced tea"){
			price = 100.0;
			return price;
		}
		else if(itemName == "Virgin mojito"){
			price = 120.0;
			return price;
		}
		else if(itemName == "Blue lagoon"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Fruit punch"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Chocolate donut"){
			price = 80.0;
			return price;
		}
		else if(itemName == "Glazed donut"){
			price = 70.0;
			return price;
		}
		else if(itemName == "Caramel donut"){
			price = 90.0;
			return price;
		}
		else if(itemName == "Red velvet pastry"){
			price = 150.0;
			return price;
		}
		else if(itemName == "Black forest pastry"){
			price = 140.0;
			return price;
		}
		else if(itemName == "Butterscotch pastry"){
			price = 130.0;
			return price;
		}
		else if(itemName == "Chocolate truffle pastry"){
			price = 160.0;
			return price;
		}
		else if(itemName == "Ice cream sundae"){
			price = 180.0;
			return price;
		}
		else if(itemName == "Chocolate sundae"){
			price = 170.0;
			return price;
		}
		else if(itemName == "Fruit sundae"){
			price = 160.0;
			return price;
		}
		else{
			System.out.println(itemName + " not found");
		}
		return price;
	}
	
	public static double search(String itemName, int quantity) {

        double price = 0.0;

        if(itemName == "BBQ chicken pizza"){
            price = 240.0 * quantity;
            return price;
        }
        else if(itemName == "Veg extravaganza pizza"){
            price = 210.0 * quantity;
            return price;
        }
        else if(itemName == "Chicken sausage pizza"){
            price = 220.0 * quantity;
            return price;
        }
        else if(itemName == "Paneer cheese pizza"){
            price = 200.0 * quantity;
            return price;
        }
        else if(itemName == "Mexican taco"){
            price = 150.0 * quantity;
            return price;
        }
        else if(itemName == "Chicken taco"){
            price = 170.0 * quantity;
            return price;
        }
        else if(itemName == "Veg burrito"){
            price = 160.0 * quantity;
            return price;
        }
        else if(itemName == "Chicken burrito"){
            price = 180.0 * quantity;
            return price;
        }
        else if(itemName == "Cheese quesadilla"){
            price = 140.0 * quantity;
            return price;
        }
        else if(itemName == "Chicken quesadilla"){
            price = 190.0 * quantity;
            return price;
        }
        else if(itemName == "Loaded fries"){
            price = 130.0 * quantity;
            return price;
        }
        else if(itemName == "Peri peri fries"){
            price = 120.0 * quantity;
            return price;
        }
        else if(itemName == "Cheese fries"){
            price = 150.0 * quantity;
            return price;
        }
        else if(itemName == "Garlic breadsticks"){
            price = 110.0 * quantity;
            return price;
        }
        else if(itemName == "Stuffed garlic bread"){
            price = 140.0 * quantity;
            return price;
        }
        else if(itemName == "Veg burger deluxe"){
            price = 130.0 * quantity;
            return price;
        }
        else if(itemName == "Chicken burger deluxe"){
            price = 160.0 * quantity;
            return price;
        }
        else if(itemName == "Double cheese burger"){
            price = 180.0 * quantity;
            return price;
        }
        else if(itemName == "Grilled veg sandwich"){
            price = 120.0 * quantity;
            return price;
        }
        else if(itemName == "Chicken club sandwich"){
            price = 170.0 * quantity;
            return price;
        }
        else if(itemName == "Veg noodles spicy"){
            price = 140.0 * quantity;
            return price;
        }
        else if(itemName == "Chicken noodles spicy"){
            price = 180.0 * quantity;
            return price;
        }
        else if(itemName == "Egg fried rice special"){
            price = 160.0 * quantity;
            return price;
        }
        else if(itemName == "Chicken fried rice special"){
            price = 190.0 * quantity;
            return price;
        }
        else if(itemName == "Paneer fried rice"){
            price = 170.0 * quantity;
            return price;
        }
        else if(itemName == "Veg manchurian gravy"){
            price = 150.0 * quantity;
            return price;
        }
        else if(itemName == "Chicken manchurian gravy"){
            price = 200.0 * quantity;
            return price;
        }
        else if(itemName == "Paneer chilli gravy"){
            price = 160.0 * quantity;
            return price;
        }
        else if(itemName == "Chicken chilli gravy"){
            price = 210.0 * quantity;
            return price;
        }
        else if(itemName == "Veg spring dosa roll"){
            price = 130.0 * quantity;
            return price;
        }
        else if(itemName == "Cheese dosa roll"){
            price = 140.0 * quantity;
            return price;
        }
        else if(itemName == "Paneer dosa roll"){
            price = 150.0 * quantity;
            return price;
        }
        else if(itemName == "Chocolate waffle deluxe"){
            price = 180.0 * quantity;
            return price;
        }
        else if(itemName == "Strawberry waffle"){
            price = 160.0 * quantity;
            return price;
        }
        else if(itemName == "Blueberry pancake"){
            price = 170.0 * quantity;
            return price;
        }
        else if(itemName == "Chocolate pancake"){
            price = 150.0 * quantity;
            return price;
        }
        else if(itemName == "Vanilla milkshake"){
            price = 120.0 * quantity;
            return price;
        }
        else if(itemName == "Strawberry milkshake"){
            price = 130.0 * quantity;
            return price;
        }
        else if(itemName == "Chocolate milkshake"){
            price = 140.0 * quantity;
            return price;
        }
        else if(itemName == "Oreo shake"){
            price = 160.0 * quantity;
            return price;
        }
        else if(itemName == "Kitkat shake"){
            price = 170.0 * quantity;
            return price;
        }
        else if(itemName == "Cold cocoa"){
            price = 110.0 * quantity;
            return price;
        }
        else if(itemName == "Ice lemon tea"){
            price = 90.0 * quantity;
            return price;
        }
        else if(itemName == "Peach iced tea"){
            price = 100.0 * quantity;
            return price;
        }
        else if(itemName == "Virgin mojito"){
            price = 120.0 * quantity;
            return price;
        }
        else if(itemName == "Blue lagoon"){
            price = 130.0 * quantity;
            return price;
        }
        else if(itemName == "Fruit punch"){
            price = 140.0 * quantity;
            return price;
        }
        else if(itemName == "Chocolate donut"){
            price = 80.0 * quantity;
            return price;
        }
        else if(itemName == "Glazed donut"){
            price = 70.0 * quantity;
            return price;
        }
        else if(itemName == "Caramel donut"){
            price = 90.0 * quantity;
            return price;
        }
        else if(itemName == "Red velvet pastry"){
            price = 150.0 * quantity;
            return price;
        }
        else if(itemName == "Black forest pastry"){
            price = 140.0 * quantity;
            return price;
        }
        else if(itemName == "Butterscotch pastry"){
            price = 130.0 * quantity;
            return price;
        }
        else if(itemName == "Chocolate truffle pastry"){
            price = 160.0 * quantity;
            return price;
        }
        else if(itemName == "Ice cream sundae"){
            price = 180.0 * quantity;
            return price;
        }
        else if(itemName == "Chocolate sundae"){
            price = 170.0 * quantity;
            return price;
        }
        else if(itemName == "Fruit sundae"){
            price = 160.0 * quantity;
            return price;
        }
        else{
            System.out.println(itemName + " not found");
        }

        return price;
    }
	
	
}