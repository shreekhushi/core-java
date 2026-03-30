class Watch{

    String operatingSystem;
    String specialFeature;
    String connectivityTechnology;
    String gps; 
    String brand;
    String bandMaterialType;
    double waterResistanceDepth;
	
	Watch(String os, String sf, String ct, String g, String b, String bm, double wr){
		operatingSystem = os;
		specialFeature = sf;
		connectivityTechnology = ct;
		gps = g;
		brand = b;
		bandMaterialType = bm;
		waterResistanceDepth = wr;
	}
	
	public void displayDetails(){
		System.out.println(" Operating System: " + operatingSystem);
        System.out.println(" Special Feature: " + specialFeature);
        System.out.println(" Connectivity Technology: " + connectivityTechnology);
        System.out.println(" GPS: " + gps);
        System.out.println(" Brand: " + brand);
        System.out.println(" Band Material Type: " + bandMaterialType);
        System.out.println(" Water Resistance Depth: " + waterResistanceDepth);
	}

}