class ShopifyCommunity{
	public static void logIn(String email, String password){
		System.out.println("ShopifyCommunity login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String deviceFingerprint){
		System.out.println("ShopifyCommunity login using mobile and deviceFingerprint");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Device Fingerprint: " + deviceFingerprint);
	}

	public static void main(String[] args){
		logIn("shopify@gmail.com","shopify@123");
		logIn(8296897154L,"FP890");
	}
}