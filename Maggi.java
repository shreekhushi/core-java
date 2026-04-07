class Maggi{

    String ingredients[] = new String[12];
    int index;

    public boolean addIngredient(String ingredient){
        System.out.println("Invoked addIngredient");
        boolean isIngredientAdded = false;

        if (index < ingredients.length){

            if (ingredient != null && !ingredient.isEmpty()){
                ingredients[index++] = ingredient;
                isIngredientAdded = true;
            } else  System.out.println("Invalid Ingredient");
            

        } else System.out.println("Cannot add more ingredients");
        

        return isIngredientAdded;
    }

    public void getIngredients(){
        System.out.println("The list of ingredients are:");
        for (String ingredient : ingredients) 
            System.out.println(ingredient);
        
    }
	
	public String getIngredientByName(String nameOfIngredient){
		String name = null;
		for(String ingredient : ingredients){
			if(ingredient == nameOfIngredient){
				name = ingredient;
				break;
			}
		}
		if(name == null){
			System.out.println(nameOfIngredient + " is not found");
		}
		
		return name;
	}
	
	public boolean updateIngredient(String oldIngredient , String newIngredient){
		System.out.println("---------------");
		System.out.println("invoked updateIngredient");
		boolean isIngredientUpdated = false;
		
		for(int index = 0; index < ingredients.length ; index++){
			if(ingredients[index] == oldIngredient){
				ingredients[index] = newIngredient;
				isIngredientUpdated = true;
				break;
			}
		}
		
		if(isIngredientUpdated == false){
			System.out.println(oldIngredient + " not fund in list");
		}
		
		return isIngredientUpdated;
	}
	
	public boolean deleteIngredient(String ingredient){
		System.out.println("invoked deleteIngredient");
		boolean isIngredientDeleted = false;
		
		for(int index = 0; index < ingredients.length ; index++){
			if(ingredients[index] == ingredient ){
				ingredients[index] = null;
				isIngredientDeleted = true;
			}
		}
		
		if(isIngredientDeleted == false){
			System.out.println(ingredient + " deleted");
		}

		 return isIngredientDeleted;
	}
}