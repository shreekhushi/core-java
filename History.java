class History{

    int transactionId;
    String transactionType;
    double amount;
    String date;
    String status;

    public void getHistoryDetails() {
        System.out.println("Transaction Id: " + transactionId);
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------");
    }
}