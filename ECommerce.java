class ECommerce{
	Product product;
	Product products[] = new Product[19];
	int index;
	
	public boolean createProduct(Product product){
		boolean isProductAdded = false;
		
		boolean isProductIdValid = false;
		boolean isProductNameValid = false;
		boolean isCategoryValid = false;
		boolean isPriceValid = false;
		boolean isBrandValid = false;
		boolean isFeaturesValid = false;
		
		if(product.productId > 0){
			isProductIdValid = true;
		}else System.out.println(product.productId + " not valid");
		
		if(product.productName != null && !product.productName.isEmpty()){
			isProductNameValid = true;
		}else System.out.println(product.productName + " not valid");
		
		if(product.category != null && !product.category.isEmpty()){
			isCategoryValid = true;
		}else System.out.println(product.category + " not valid");
		
		if(product.brand != null && !product.brand.isEmpty()){
			isBrandValid = true;
		}else System.out.println(product.brand + " not valid");
		
		if(product.features!= null && product.features.length > 0){
			isFeaturesValid = true;
		}else System.out.println(product.features + " not valid");
		
		if(product.price > 0){
			isPriceValid = true;
		}else System.out.println(product.price + " not valid");
		
		if(isProductIdValid && isProductNameValid &&  isCategoryValid && isBrandValid && isFeaturesValid && isPriceValid){
			products[index++] = product;
			isProductAdded = true;
		}

		return isProductAdded;
	}
	
	public void getProducts(){
		for(Product product : products){
		    System.out.println("-----------------------------------");
			System.out.println("the product Id is: " + product.productId);
			System.out.println("the product name is: " + product.productName);
			System.out.println("the product brand is: " + product.brand);
			System.out.println("the product category is: " + product.category);
			System.out.println("the product price is: " + product.price);
			System.out.println("the product Id is: " );
			for(String feature : product.features){
				System.out.println(feature);
			}
		}
	}

	
}