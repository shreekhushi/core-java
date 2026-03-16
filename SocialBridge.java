class SocialBridge{
	public static void logIn(String userName, int password){
		System.out.println("SocialBridge login through username and password");
		System.out.println("the username: " + userName);
		System.out.println("password: " + password);
	}

	public static void logIn(long number, int password){
		System.out.println("SocialBridge login through mobile number and password");
		System.out.println("the mobile number: " + number);
		System.out.println("the password: " + password);
	}

	public static void main(String[] args){
		logIn("bridgeUser",2424);
		logIn(9000000022L,2424);
	}
}