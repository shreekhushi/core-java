class DigitalZoneExecutor{

    public static void main(String[] args) {

        DigitalZone zone = new DigitalZone();

        boolean added = zone.addLaptopBrand("Dell");
        System.out.println(added);
        System.out.println("---------------");

        added = zone.addLaptopBrand("HP");
        System.out.println(added);
        System.out.println("---------------");

        added = zone.addLaptopBrand("Lenovo");
        System.out.println(added);
        System.out.println("---------------");

        added = zone.addLaptopBrand("Asus");
        System.out.println(added);
        System.out.println("---------------");

        added = zone.addLaptopBrand("Acer");
        System.out.println(added);
        System.out.println("---------------");

        added = zone.addLaptopBrand("Apple");
        System.out.println(added);
        System.out.println("---------------");

        zone.getLaptopBrands();
		
		String name = zone.getBrandByName("HP");
		System.out.println(name);
		
		boolean update = zone.updateBrandName("Asus" , "Asus gaming");
		System.out.println(update);
		
		zone.getLaptopBrands();
		
		boolean delete = zone.deleteBrandName("Dell");
		System.out.println(delete);
		
		zone.getLaptopBrands();
    }
}