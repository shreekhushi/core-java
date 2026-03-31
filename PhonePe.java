class PhonePe{

    String userName;
    long mobileNumber;
    String upiId;
    String bankName;
    double walletBalance;

    History history; 

    public void getPhonePeDetails() {
        System.out.println("PhonePe Details:");
        System.out.println("User Name: " + userName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("UPI Id: " + upiId);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Wallet Balance: " + walletBalance);
        System.out.println("--------------------------------");

        history.getHistoryDetails();

      
    }
}