class Amazon{

    String categoryNames[] = new String[21];
    int index;

    public boolean addCategory(String category) {
        System.out.println("invoked addCategory");
        boolean isCategoryAdded = false;

        if (index < categoryNames.length) {

            if (category != null && !category.isEmpty()) {
                categoryNames[index++] = category;
                isCategoryAdded = true;
                System.out.println("added category");
            }else System.out.println("no category");
            

        }else  System.out.println("contact later................");
        

        return isCategoryAdded;
    }

    public void getCategories() {
        System.out.println("invoked getCategories");
        for (String category : categoryNames) 
            System.out.println(category);
        
    }
	
	public String getCategoryByName(String categoryName){
		String name = null;
		for(String category : categoryNames){
			if(category == categoryName){
				name = categoryName;
				break;
			}
		}
		
		if(name == null){
			System.out.println(categoryName + " not found");
		}
		
		return name;
	}
	
	public boolean updateCategory(String oldCategoryName , String newCategoryName){
		System.out.println("-----------------");
		System.out.println("invoked updateCategory");
		boolean isCategoryUpdated = false;
		
		for(int index = 0; index < categoryNames.length ; index++){
			if(categoryNames[index] == oldCategoryName){
				categoryNames[index] = newCategoryName;
				isCategoryUpdated = true;
				break;
			}
		}
		
		if(isCategoryUpdated == false){
			System.out.println(oldCategoryName + " not fund in list");
		}
		
		return isCategoryUpdated;
	}
	
	public boolean deleteCategory(String categoryName){
		System.out.println("---------------------");
		boolean isCategoryDeleted = false;
		
		for(int index = 0; index < categoryNames.length; index++){
			if(categoryNames[index] == categoryName){
				categoryNames[index] = null;
				isCategoryDeleted = true;
			}
		}
		
		if(isCategoryDeleted == false){
			System.out.println(categoryName + " is deleted");
		}
		return isCategoryDeleted;
	}
	
	
}