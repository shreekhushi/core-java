class Ring {

    String materialType;
    String gemstoneType;
    String ringSize;
    String color;
    String brand;
	String style;
    String occasion;
    String gender;
    String platingType;
    double weight;
	
	Ring(String mt, String gt, String rs, String c, String b, String s, String o, String g, String pt, double w){
		materialType = mt;
		gemstoneType = gt;
		ringSize = rs;
		color = c;
		brand = b;
		style = s;
		occasion = o;
		gender = g;
		platingType = pt;
		weight = w;
	}
	
	public void displayDetails(){
		System.out.println(" The Material Type of Ring is " + materialType);
        System.out.println(" The Gemstone Type of Ring is " + gemstoneType);
        System.out.println(" The Ring Size is " + ringSize);
        System.out.println(" The Color of Ring is " + color);
        System.out.println(" The Brand of Ring is " + brand);
        System.out.println(" The Style of Ring is " + style);
        System.out.println(" The Occasion of Ring is " + occasion);
        System.out.println(" The Gender of Ring is " + gender);
        System.out.println(" The Plating Type of Ring is " + platingType);
        System.out.println(" The Weight of Ring is " + weight);
	}

}