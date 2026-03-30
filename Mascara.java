class Mascara {

    String brand;
    String type;          
    String color;         
    boolean isWaterproof;
    boolean isSmudgeProof;
    boolean isLongLasting;
    double price;
	
	
	Mascara(String b, String t, String c, boolean wp, boolean sp, boolean l, double p){
		brand = b;
		type = t;
		color = c;
		isWaterproof = wp;
		isSmudgeProof = sp;
		isLongLasting = l;
		price = p;
	}
	
	public void displayDetails(){
		System.out.println("Brand: "+ brand);
        System.out.println("Type: "+ type);
        System.out.println("Color: "+ color);
        System.out.println("Waterproof: "+ isWaterproof);
        System.out.println("Smudge Proof: "+ isSmudgeProof);
        System.out.println("Long Lasting: "+ isLongLasting);
        System.out.println("Price: "+ price);
	}
}