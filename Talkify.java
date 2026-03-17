class Talkify{
	public static void logIn(String userName, int password){
		System.out.println("Talkify login through username and password");
		System.out.println("the username: " + userName);
		System.out.println("password: " + password);
	}

	public static void logIn(long number, int password){
		System.out.println("Talkify login through mobile number and password");
		System.out.println("the mobile number: " + number);
		System.out.println("the password: " + password);
	}

	public static void main(String[] args){
		logIn("talkUser",8888);
		logIn(9100000008L,8888);
	}
}