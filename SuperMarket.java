class SuperMarket{

    String productNames[] = new String[8];
    int index;

    public boolean addProduct(String product) {
        System.out.println("invoked addProduct");
        boolean isProductAdded = false;

        if (index < productNames.length) {

            if (product != null && !product.isEmpty()) {
                productNames[index++] = product;
                isProductAdded = true;
                System.out.println("added product");
            } else System.out.println("no product");
            

        } else System.out.println("contact later................");
        

        return isProductAdded;
    }

    public void getProducts() {
        System.out.println("invoked getProducts");
        for (String product : productNames) 
            System.out.println(product);
    }
	
	public String getProductByName(String nameOfProduct){
		System.out.println("invoked getProductByName");
		String name = null;
		for(String productName : productNames){
			if(productName == nameOfProduct){
				name = productName;
				break;
			}
		}
		
		if(name == null){
			System.out.println(nameOfProduct +" not found");
		}
		
		return name;
	}
	
	public boolean updateProduct(String oldName, String newName){
		System.out.println("-----------------------------");
		System.out.println("invoked updateProduct");
		boolean isProductUpdated = false;
		for(int index = 0; index < productNames.length; index++){
			if(productNames[index] == oldName){
				productNames[index] = newName;
				isProductUpdated = true;
			}
		}
		
		if(isProductUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isProductUpdated;
	}
	
	public boolean deleteProduct(String nameOfProduct){
		System.out.println("-----------------------------");
		System.out.println("invoked deleteProduct");
		boolean isProductDeleted = false;
		for(int index = 0; index < productNames.length; index++){
			if(productNames[index] == nameOfProduct){
				productNames[index] = null;
				isProductDeleted = true;
			}
		}
		
		if(isProductDeleted == false){
			System.out.println(nameOfProduct + " not found");
		}
		
		return isProductDeleted;
	}
}