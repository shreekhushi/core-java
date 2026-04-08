class ECommerceExecutor{
	
	public static void main(String[] p){
		
        String f1[] = {"5G", "128GB", "AMOLED"};
        String f2[] = {"8GB RAM", "256GB", "Snapdragon"};
        String f3[] = {"i5", "16GB RAM", "512GB SSD"};
        String f4[] = {"4K", "55 inch", "Smart TV"};
        String f5[] = {"Inverter", "Double Door", "Frost Free"};
        String f6[] = {"Noise Cancel", "Wireless", "Bluetooth"};
        String f7[] = {"Gaming", "16GB RAM", "RTX 3050"};
        String f8[] = {"Waterproof", "Fitness Tracking", "Bluetooth"};
        String f9[] = {"Cotton", "Slim Fit", "Casual"};
        String f10[] = {"Leather", "Comfort", "Durable"};
        String f11[] = {"1 Ton", "Inverter", "5 Star"};
        String f12[] = {"Front Load", "6kg", "Auto Clean"};
        String f13[] = {"4 Burner", "Gas Stove", "Steel"};
        String f14[] = {"Microwave", "Convection", "23L"};
        String f15[] = {"Bluetooth", "Bass Boost", "Portable"};
        String f16[] = {"DSLR", "24MP", "Zoom Lens"};
        String f17[] = {"Tablet", "10 inch", "64GB"};
        String f18[] = {"Office Chair", "Ergonomic", "Adjustable"};
        String f19[] = {"Study Table", "Wooden", "Compact"};

        ECommerce ecommerce = new ECommerce();

        Product p1 = new Product();
        p1.productId = 1;
        p1.productName = "iPhone 13";
        p1.category = "Mobile";
        p1.price = 65000;
        p1.brand = "Apple";
        p1.features = f1;
        boolean added = ecommerce.createProduct(p1);
        System.out.println(added);

        Product p2 = new Product();
        p2.productId = 2;
        p2.productName = "Galaxy S21";
        p2.category = "Mobile";
        p2.price = 55000;
        p2.brand = "Samsung";
        p2.features = f2;
        added = ecommerce.createProduct(p2);
        System.out.println(added);

        Product p3 = new Product();
        p3.productId = 3;
        p3.productName = "Dell Inspiron";
        p3.category = "Laptop";
        p3.price = 70000;
        p3.brand = "Dell";
        p3.features = f3;
        added = ecommerce.createProduct(p3);
        System.out.println(added);

        Product p4 = new Product();
        p4.productId = 4;
        p4.productName = "Sony Bravia";
        p4.category = "TV";
        p4.price = 60000;
        p4.brand = "Sony";
        p4.features = f4;
        added = ecommerce.createProduct(p4);
        System.out.println(added);

        Product p5 = new Product();
        p5.productId = 5;
        p5.productName = "LG Refrigerator";
        p5.category = "Appliance";
        p5.price = 30000;
        p5.brand = "LG";
        p5.features = f5;
        added = ecommerce.createProduct(p5);
        System.out.println(added);

        Product p6 = new Product();
        p6.productId = 6;
        p6.productName = "AirPods Pro";
        p6.category = "Accessories";
        p6.price = 24000;
        p6.brand = "Apple";
        p6.features = f6;
        added = ecommerce.createProduct(p6);
        System.out.println(added);

        Product p7 = new Product();
        p7.productId = 7;
        p7.productName = "HP Pavilion";
        p7.category = "Laptop";
        p7.price = 80000;
        p7.brand = "HP";
        p7.features = f7;
        added = ecommerce.createProduct(p7);
        System.out.println(added);

        Product p8 = new Product();
        p8.productId = 8;
        p8.productName = "Mi Watch";
        p8.category = "Smartwatch";
        p8.price = 10000;
        p8.brand = "Xiaomi";
        p8.features = f8;
        added = ecommerce.createProduct(p8);
        System.out.println(added);

        Product p9 = new Product();
        p9.productId = 9;
        p9.productName = "Men Shirt";
        p9.category = "Clothing";
        p9.price = 1500;
        p9.brand = "Zara";
        p9.features = f9;
        added = ecommerce.createProduct(p9);
        System.out.println(added);
		
        Product p10 = new Product();
        p10.productId = 10;
        p10.productName = "Leather Shoes";
        p10.category = "Footwear";
        p10.price = 3500;
        p10.brand = "Bata";
        p10.features = f10;
        added = ecommerce.createProduct(p10);
        System.out.println(added);

        Product p11 = new Product();
        p11.productId = 11;
        p11.productName = "Voltas AC";
        p11.category = "Appliance";
        p11.price = 40000;
        p11.brand = "Voltas";
        p11.features = f11;
        added = ecommerce.createProduct(p11);
        System.out.println(added);

        Product p12 = new Product();
        p12.productId = 12;
        p12.productName = "IFB Washing Machine";
        p12.category = "Appliance";
        p12.price = 25000;
        p12.brand = "IFB";
        p12.features = f12;
        added = ecommerce.createProduct(p12);
        System.out.println(added);

        Product p13 = new Product();
        p13.productId = 13;
        p13.productName = "Prestige Stove";
        p13.category = "Kitchen";
        p13.price = 5000;
        p13.brand = "Prestige";
        p13.features = f13;
        added = ecommerce.createProduct(p13);
        System.out.println(added);

        Product p14 = new Product();
        p14.productId = 14;
        p14.productName = "Samsung Microwave";
        p14.category = "Kitchen";
        p14.price = 12000;
        p14.brand = "Samsung";
        p14.features = f14;
        added = ecommerce.createProduct(p14);
        System.out.println(added);

        Product p15 = new Product();
        p15.productId = 15;
        p15.productName = "JBL Speaker";
        p15.category = "Audio";
        p15.price = 7000;
        p15.brand = "JBL";
        p15.features = f15;
        added = ecommerce.createProduct(p15);
        System.out.println(added);

        Product p16 = new Product();
        p16.productId = 16;
        p16.productName = "Canon DSLR";
        p16.category = "Camera";
        p16.price = 50000;
        p16.brand = "Canon";
        p16.features = f16;
        added = ecommerce.createProduct(p16);
        System.out.println(added);

        Product p17 = new Product();
        p17.productId = 17;
        p17.productName = "Lenovo Tablet";
        p17.category = "Tablet";
        p17.price = 20000;
        p17.brand = "Lenovo";
        p17.features = f17;
        added = ecommerce.createProduct(p17);
        System.out.println(added);

        Product p18 = new Product();
        p18.productId = 18;
        p18.productName = "Office Chair";
        p18.category = "Furniture";
        p18.price = 6000;
        p18.brand = "Nilkamal";
        p18.features = f18;
        added = ecommerce.createProduct(p18);
        System.out.println(added);

        Product p19 = new Product();
        p19.productId = 19;
        p19.productName = "Study Table";
        p19.category = "Furniture";
        p19.price = 8000;
        p19.brand = "IKEA";
        p19.features = f19;
        added = ecommerce.createProduct(p19);
        System.out.println(added);

        ecommerce.getProducts();
    }
}