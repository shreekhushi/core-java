class TalkBridge{
	public static void logIn(String userName, int password){
		System.out.println("TalkBridge login through username and password");
		System.out.println("the username: " + userName);
		System.out.println("password: " + password);
	}

	public static void logIn(long number, int password){
		System.out.println("TalkBridge login through mobile number and password");
		System.out.println("the mobile number: " + number);
		System.out.println("the password: " + password);
	}

	public static void main(String[] args){
		logIn("talkBridgeUser",2525);
		logIn(9000000023L,2525);
	}
}