class TalkTown{
	public static void logIn(String userName, int password){
		System.out.println("TalkTown login through username and password");
		System.out.println("the username: " + userName);
		System.out.println("password: " + password);
	}

	public static void logIn(long number, int password){
		System.out.println("TalkTown login through mobile number and password");
		System.out.println("the mobile number: " + number);
		System.out.println("the password: " + password);
	}

	public static void main(String[] args){
		logIn("talkUser",9999);
		logIn(9000000009L,9999);
	}
}	