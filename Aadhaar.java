class Aadhaar{
	long aadhaarNumber;
	String holderName;
	String address;
	
	public void getAadhaarDetails(){
		System.out.println("getAadhaarDetails invoked");
		System.out.println("the aadhaar number is: " +aadhaarNumber);
		System.out.println("the holder name is: " +holderName);
		System.out.println("the address is: " +address);
		System.out.println("getAadhaarDetails ended");
	}
}