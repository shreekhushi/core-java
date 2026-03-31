class Bank{

    String bankName;
    String location;
    String ifscCode;
    long contactNumber;
    int totalBranches;

    AccountHolder accountHolder; 

    public void getBankDetails() {
        System.out.println("Bank Details:");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Location: " + location);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Total Branches: " + totalBranches);
        System.out.println("--------------------------------");

        accountHolder.getAccountHolderDetails();

    }
}