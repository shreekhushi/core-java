class BeReal{
	public static void logIn(String username, String password){
		System.out.println("BeReal login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String deviceFingerprint){
		System.out.println("BeReal login using mobile and deviceFingerprint");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Device Fingerprint: " + deviceFingerprint);
	}

	public static void main(String[] args){
		logIn("bereal_user","bereal@123");
		logIn(8296897154L,"FP123");
	}
}