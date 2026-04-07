class DigitalZone{

    String laptopBrandNames[] = new String[6];
    int index;

    public boolean addLaptopBrand(String brand) {
        System.out.println("invoked addLaptopBrand");
        boolean isBrandAdded = false;

        if (index < laptopBrandNames.length) {

            if (brand != null && !brand.isEmpty()) {
                laptopBrandNames[index++] = brand;
                isBrandAdded = true;
                System.out.println("added brand");
            } else {
                System.out.println("no brand");
            }

        } else {
            System.out.println("contact later................");
        }

        return isBrandAdded;
    }

    public void getLaptopBrands() {
        System.out.println("invoked getLaptopBrands");
        for (String brand : laptopBrandNames) {
            System.out.println(brand);
        }
    }
	
	public String getBrandByName(String brandName){
		String name= null;
		for(String laptopBrand: laptopBrandNames){
			if(laptopBrand == brandName){
				name = laptopBrand;
				break;
			}
		}
		
		if(name == null){
			System.out.println(brandName + " not found");
		}
		
		return name;
	}
	
	public boolean updateBrandName(String oldBrand, String newBrand){
		System.out.println("---------------------------");
		boolean isBrandUpdated = false;
		for(int index=0; index < laptopBrandNames.length; index++){
			if(laptopBrandNames[index] == oldBrand){
				laptopBrandNames[index] = newBrand;
				isBrandUpdated = true;
			}
		}
		
		if(isBrandUpdated == false){
			System.out.println(oldBrand + " not found");
		}
		
		return isBrandUpdated;
	}
	
	public boolean deleteBrandName(String brandName){
		System.out.println("---------------------");
		boolean isBrandDeleted = false;
		for(int index = 0; index < laptopBrandNames.length; index++){
			if(laptopBrandNames[index] == brandName){
				laptopBrandNames[index] = null;
				isBrandDeleted = true;
			}
	    }
		
		if(isBrandDeleted == false){
			System.out.println(brandName + " not found");
		}
		
		return isBrandDeleted;
	}
}