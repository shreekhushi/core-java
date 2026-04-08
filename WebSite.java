class WebSite{
	
	UserAccount userAccount;
	UserAccount accounts[] = new UserAccount[8];
	int index;
	
	public boolean createAccount(UserAccount userAccount){
		
		boolean isAccountAdded = false;
		
		boolean isUserIdValid = false;
		boolean isUserNameValid = false;
		boolean isEmailValid = false;
		boolean isPasswordValid = false;
		boolean isAccountTypeValid = false;
		boolean isInterestValid = false;
		
		
		if(userAccount.userId > 0){
			isUserIdValid = true;
		} else System.out.println(userAccount.userId + " not valid");
		
		if(userAccount.userName != null && !userAccount.userName.isEmpty()){
			isUserNameValid = true;
		} else System.out.println(userAccount.userName + " not valid");
		
		if(userAccount.email != null && !userAccount.email.isEmpty()){
			isEmailValid = true;
		} else System.out.println(userAccount.email + " not valid");
		
		if(userAccount.password != null && !userAccount.password.isEmpty()){
			isPasswordValid = true;
		} else System.out.println(userAccount.password + " not valid");
		
		if(userAccount.accountType != null && !userAccount.accountType.isEmpty()){
			isAccountTypeValid = true;
		} else System.out.println(userAccount.accountType + " not valid");
		
		if(userAccount.interests != null && userAccount.interests.length > 0){
			isInterestValid = true;
		} else System.out.println(userAccount.interests + " not valid");
		
		if(isUserIdValid && isUserNameValid && isEmailValid &&isPasswordValid && isAccountTypeValid && isInterestValid){
			accounts[index++] = userAccount;
			isAccountAdded = true;
		}
		
		return isAccountAdded;
	}
	
	public void getAccounts(){
		for(UserAccount userAccount : accounts){
			System.out.println("---------------------------");
			System.out.println("The user id is: " + userAccount.userId);
			System.out.println("The user name is: " + userAccount.userName);
			System.out.println("The user email id is: " + userAccount.email);
			System.out.println("The user password is: " + userAccount.password);
			System.out.println("The user account type is: " + userAccount.accountType);
			System.out.println("The user interests are: ");
			for(String interest : userAccount.interests){
				System.out.println(interest);
			}
		}
	}
	
}
