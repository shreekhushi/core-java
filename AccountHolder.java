class AccountHolder{

    int accountId;
    String name;
    String accountType;
    double balance;
    String branch;

    public void getAccountHolderDetails() {
        System.out.println("Account Holder Details:");
        System.out.println("Account Id: " + accountId);
        System.out.println("Name: " + name);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("Branch: " + branch);
        System.out.println("-----------------------------");
    }
}