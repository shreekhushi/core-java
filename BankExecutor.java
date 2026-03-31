class BankExecutor{

    public static void main(String[] args) {

        
        Bank b1 = new Bank();
        b1.bankName = "SBI";
        b1.location = "Bangalore";
        b1.ifscCode = "SBIN0001";
        b1.contactNumber = 9876543210L;
        b1.totalBranches = 1200;

        AccountHolder a1 = new AccountHolder();
        a1.accountId = 101;
        a1.name = "Ravi Kumar";
        a1.accountType = "Savings";
        a1.balance = 50000;
        a1.branch = "BTM";

        b1.accountHolder = a1;
        b1.getBankDetails();


        Bank b2 = new Bank();
        b2.bankName = "HDFC";
        b2.location = "Mumbai";
        b2.ifscCode = "HDFC0002";
        b2.contactNumber = 9123456780L;
        b2.totalBranches = 900;

        AccountHolder a2 = new AccountHolder();
        a2.accountId = 102;
        a2.name = "Sneha Reddy";
        a2.accountType = "Current";
        a2.balance = 120000;
        a2.branch = "Andheri";

        b2.accountHolder = a2;
        b2.getBankDetails();


        Bank b3 = new Bank();
        b3.bankName = "ICICI";
        b3.location = "Chennai";
        b3.ifscCode = "ICIC0003";
        b3.contactNumber = 9988776655L;
        b3.totalBranches = 800;

        AccountHolder a3 = new AccountHolder();
        a3.accountId = 103;
        a3.name = "Arjun";
        a3.accountType = "Savings";
        a3.balance = 75000;
        a3.branch = "T Nagar";

        b3.accountHolder = a3;
        b3.getBankDetails();


        Bank b4 = new Bank();
        b4.bankName = "Axis";
        b4.location = "Delhi";
        b4.ifscCode = "AXIS0004";
        b4.contactNumber = 9001122334L;
        b4.totalBranches = 700;

        AccountHolder a4 = new AccountHolder();
        a4.accountId = 104;
        a4.name = "Priya";
        a4.accountType = "Current";
        a4.balance = 95000;
        a4.branch = "Karol Bagh";

        b4.accountHolder = a4;
        b4.getBankDetails();


        Bank b5 = new Bank();
        b5.bankName = "Canara";
        b5.location = "Mysore";
        b5.ifscCode = "CNRB0005";
        b5.contactNumber = 8899776655L;
        b5.totalBranches = 600;

        AccountHolder a5 = new AccountHolder();
        a5.accountId = 105;
        a5.name = "Rahul";
        a5.accountType = "Savings";
        a5.balance = 30000;
        a5.branch = "VV Mohalla";

        b5.accountHolder = a5;
        b5.getBankDetails();


        Bank b6 = new Bank();
        b6.bankName = "Union Bank";
        b6.location = "Hyderabad";
        b6.ifscCode = "UBIN0006";
        b6.contactNumber = 7766554433L;
        b6.totalBranches = 500;

        AccountHolder a6 = new AccountHolder();
        a6.accountId = 106;
        a6.name = "Kiran";
        a6.accountType = "Savings";
        a6.balance = 45000;
        a6.branch = "Ameerpet";

        b6.accountHolder = a6;
        b6.getBankDetails();


        Bank b7 = new Bank();
        b7.bankName = "Kotak";
        b7.location = "Pune";
        b7.ifscCode = "KKBK0007";
        b7.contactNumber = 6677889900L;
        b7.totalBranches = 400;

        AccountHolder a7 = new AccountHolder();
        a7.accountId = 107;
        a7.name = "Meena";
        a7.accountType = "Current";
        a7.balance = 110000;
        a7.branch = "Shivaji Nagar";

        b7.accountHolder = a7;
        b7.getBankDetails();


        Bank b8 = new Bank();
        b8.bankName = "IndusInd";
        b8.location = "Kolkata";
        b8.ifscCode = "INDB0008";
        b8.contactNumber = 9988007766L;
        b8.totalBranches = 350;

        AccountHolder a8 = new AccountHolder();
        a8.accountId = 108;
        a8.name = "Suresh";
        a8.accountType = "Savings";
        a8.balance = 65000;
        a8.branch = "Salt Lake";

        b8.accountHolder = a8;
        b8.getBankDetails();

        Bank b9 = new Bank();
        b9.bankName = "Yes Bank";
        b9.location = "Noida";
        b9.ifscCode = "YESB0009";
        b9.contactNumber = 8877665544L;
        b9.totalBranches = 300;

        AccountHolder a9 = new AccountHolder();
        a9.accountId = 109;
        a9.name = "Deepak";
        a9.accountType = "Savings";
        a9.balance = 72000;
        a9.branch = "Sector 18";

        b9.accountHolder = a9;
        b9.getBankDetails();


        Bank b10 = new Bank();
        b10.bankName = "PNB";
        b10.location = "Lucknow";
        b10.ifscCode = "PNB0010";
        b10.contactNumber = 7766552211L;
        b10.totalBranches = 650;

        AccountHolder a10 = new AccountHolder();
        a10.accountId = 110;
        a10.name = "Anjali";
        a10.accountType = "Current";
        a10.balance = 130000;
        a10.branch = "Hazratganj";

        b10.accountHolder = a10;
        b10.getBankDetails();



        Bank b11 = new Bank();
        b11.bankName = "SBI";
        b11.location = "Coimbatore";
        b11.ifscCode = "SBIN0011";
        b11.contactNumber = 9000090000L;
        b11.totalBranches = 1200;

        AccountHolder a11 = new AccountHolder();
        a11.accountId = 111;
        a11.name = "Vikram";
        a11.accountType = "Savings";
        a11.balance = 55000;
        a11.branch = "RS Puram";

        b11.accountHolder = a11;
        b11.getBankDetails();


        Bank b12 = new Bank();
        b12.bankName = "HDFC";
        b12.location = "Nagpur";
        b12.ifscCode = "HDFC0012";
        b12.contactNumber = 8111223344L;
        b12.totalBranches = 900;

        AccountHolder a12 = new AccountHolder();
        a12.accountId = 112;
        a12.name = "Pooja";
        a12.accountType = "Savings";
        a12.balance = 48000;
        a12.branch = "Sitabuldi";

        b12.accountHolder = a12;
        b12.getBankDetails();


        Bank b13 = new Bank();
        b13.bankName = "ICICI";
        b13.location = "Surat";
        b13.ifscCode = "ICIC0013";
        b13.contactNumber = 8222334455L;
        b13.totalBranches = 800;

        AccountHolder a13 = new AccountHolder();
        a13.accountId = 113;
        a13.name = "Manoj";
        a13.accountType = "Current";
        a13.balance = 140000;
        a13.branch = "Adajan";

        b13.accountHolder = a13;
        b13.getBankDetails();


        Bank b14 = new Bank();
        b14.bankName = "Axis";
        b14.location = "Jaipur";
        b14.ifscCode = "AXIS0014";
        b14.contactNumber = 8333445566L;
        b14.totalBranches = 700;

        AccountHolder a14 = new AccountHolder();
        a14.accountId = 114;
        a14.name = "Kavya";
        a14.accountType = "Savings";
        a14.balance = 60000;
        a14.branch = "Malviya Nagar";

        b14.accountHolder = a14;
        b14.getBankDetails();


        Bank b15 = new Bank();
        b15.bankName = "Canara";
        b15.location = "Udupi";
        b15.ifscCode = "CNRB0015";
        b15.contactNumber = 8444556677L;
        b15.totalBranches = 600;

        AccountHolder a15 = new AccountHolder();
        a15.accountId = 115;
        a15.name = "Nithin";
        a15.accountType = "Savings";
        a15.balance = 35000;
        a15.branch = "Manipal";

        b15.accountHolder = a15;
        b15.getBankDetails();


        Bank b16 = new Bank();
        b16.bankName = "Union Bank";
        b16.location = "Vizag";
        b16.ifscCode = "UBIN0016";
        b16.contactNumber = 8555667788L;
        b16.totalBranches = 500;

        AccountHolder a16 = new AccountHolder();
        a16.accountId = 116;
        a16.name = "Divya";
        a16.accountType = "Current";
        a16.balance = 125000;
        a16.branch = "MVP Colony";

        b16.accountHolder = a16;
        b16.getBankDetails();


        Bank b17 = new Bank();
        b17.bankName = "Kotak";
        b17.location = "Bhopal";
        b17.ifscCode = "KKBK0017";
        b17.contactNumber = 8666778899L;
        b17.totalBranches = 400;

        AccountHolder a17 = new AccountHolder();
        a17.accountId = 117;
        a17.name = "Ramesh";
        a17.accountType = "Savings";
        a17.balance = 52000;
        a17.branch = "MP Nagar";

        b17.accountHolder = a17;
        b17.getBankDetails();


        Bank b18 = new Bank();
        b18.bankName = "IndusInd";
        b18.location = "Patna";
        b18.ifscCode = "INDB0018";
        b18.contactNumber = 8777889900L;
        b18.totalBranches = 350;

        AccountHolder a18 = new AccountHolder();
        a18.accountId = 118;
        a18.name = "Sunita";
        a18.accountType = "Savings";
        a18.balance = 68000;
        a18.branch = "Kankarbagh";

        b18.accountHolder = a18;
        b18.getBankDetails();


        Bank b19 = new Bank();
        b19.bankName = "Yes Bank";
        b19.location = "Chandigarh";
        b19.ifscCode = "YESB0019";
        b19.contactNumber = 8888999900L;
        b19.totalBranches = 300;

        AccountHolder a19 = new AccountHolder();
        a19.accountId = 119;
        a19.name = "Amit";
        a19.accountType = "Current";
        a19.balance = 150000;
        a19.branch = "Sector 17";

        b19.accountHolder = a19;
        b19.getBankDetails();


        Bank b20 = new Bank();
        b20.bankName = "PNB";
        b20.location = "Indore";
        b20.ifscCode = "PNB0020";
        b20.contactNumber = 8999000011L;
        b20.totalBranches = 650;

        AccountHolder a20 = new AccountHolder();
        a20.accountId = 120;
        a20.name = "Neha";
        a20.accountType = "Savings";
        a20.balance = 70000;
        a20.branch = "Vijay Nagar";

        b20.accountHolder = a20;
        b20.getBankDetails();
    }
}