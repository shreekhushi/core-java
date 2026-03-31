class GovernmentIdentification{

    int idNumber;
    String idType;
    String issuedBy;
    String issueDate;
    String expiryDate;

    public void getIdDetails() {
        System.out.println("Government ID Details:");
        System.out.println("ID Number: " + idNumber);
        System.out.println("ID Type: " + idType);
        System.out.println("Issued By: " + issuedBy);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("-----------------------------");
    }
}