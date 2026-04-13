class Criminal{
	int criminalId;
	String name;
	String crimeType;
	
	public void getCriminalDetails(){
		System.out.println("getCriminalDetails invoked");
		System.out.println("the criminal id is: " +criminalId);
		System.out.println("the criminal name is: " +name);
		System.out.println("the crime type is: " +crimeType);
		System.out.println("getCriminalDetails ended");
	}
}