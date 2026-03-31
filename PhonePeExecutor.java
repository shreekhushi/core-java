class PhonePeExecutor {

    public static void main(String[] args) {

        PhonePe p1 = new PhonePe();
        p1.userName = "Rahul";
        p1.mobileNumber = 9876543210L;
        p1.upiId = "rahul@upi";
        p1.bankName = "SBI";
        p1.walletBalance = 5000;

        History h1 = new History();
        h1.transactionId = 1;
        h1.transactionType = "Recharge";
        h1.amount = 299;
        h1.date = "01-01-2026";
        h1.status = "Success";

        p1.history = h1;
        p1.getPhonePeDetails();


        PhonePe p2 = new PhonePe();
        p2.userName = "Sneha";
        p2.mobileNumber = 9123456780L;
        p2.upiId = "sneha@upi";
        p2.bankName = "HDFC";
        p2.walletBalance = 8000;

        History h2 = new History();
        h2.transactionId = 2;
        h2.transactionType = "Bill Payment";
        h2.amount = 1200;
        h2.date = "02-01-2026";
        h2.status = "Success";

        p2.history = h2;
        p2.getPhonePeDetails();


        PhonePe p3 = new PhonePe();
        p3.userName = "Arjun";
        p3.mobileNumber = 9988776655L;
        p3.upiId = "arjun@upi";
        p3.bankName = "ICICI";
        p3.walletBalance = 6500;

        History h3 = new History();
        h3.transactionId = 3;
        h3.transactionType = "Transfer";
        h3.amount = 2000;
        h3.date = "03-01-2026";
        h3.status = "Failed";

        p3.history = h3;
        p3.getPhonePeDetails();


        PhonePe p4 = new PhonePe();
        p4.userName = "Priya";
        p4.mobileNumber = 9001122334L;
        p4.upiId = "priya@upi";
        p4.bankName = "Axis";
        p4.walletBalance = 7200;

        History h4 = new History();
        h4.transactionId = 4;
        h4.transactionType = "Recharge";
        h4.amount = 399;
        h4.date = "04-01-2026";
        h4.status = "Success";

        p4.history = h4;
        p4.getPhonePeDetails();


        PhonePe p5 = new PhonePe();
        p5.userName = "Kiran";
        p5.mobileNumber = 8899776655L;
        p5.upiId = "kiran@upi";
        p5.bankName = "Canara";
        p5.walletBalance = 3000;

        History h5 = new History();
        h5.transactionId = 5;
        h5.transactionType = "Bill Payment";
        h5.amount = 850;
        h5.date = "05-01-2026";
        h5.status = "Success";

        p5.history = h5;
        p5.getPhonePeDetails();


        PhonePe p6 = new PhonePe();
        p6.userName = "Meena";
        p6.mobileNumber = 7766554433L;
        p6.upiId = "meena@upi";
        p6.bankName = "Union";
        p6.walletBalance = 9200;

        History h6 = new History();
        h6.transactionId = 6;
        h6.transactionType = "Transfer";
        h6.amount = 1500;
        h6.date = "06-01-2026";
        h6.status = "Success";

        p6.history = h6;
        p6.getPhonePeDetails();

        PhonePe p7 = new PhonePe();
        p7.userName = "Ramesh";
        p7.mobileNumber = 6677889900L;
        p7.upiId = "ramesh@upi";
        p7.bankName = "Kotak";
        p7.walletBalance = 4100;

        History h7 = new History();
        h7.transactionId = 7;
        h7.transactionType = "Recharge";
        h7.amount = 199;
        h7.date = "07-01-2026";
        h7.status = "Success";

        p7.history = h7;
        p7.getPhonePeDetails();


        PhonePe p8 = new PhonePe();
        p8.userName = "Divya";
        p8.mobileNumber = 9988007766L;
        p8.upiId = "divya@upi";
        p8.bankName = "IndusInd";
        p8.walletBalance = 7800;

        History h8 = new History();
        h8.transactionId = 8;
        h8.transactionType = "Bill Payment";
        h8.amount = 1100;
        h8.date = "08-01-2026";
        h8.status = "Failed";

        p8.history = h8;
        p8.getPhonePeDetails();


        PhonePe p9 = new PhonePe();
        p9.userName = "Anjali";
        p9.mobileNumber = 8877665544L;
        p9.upiId = "anjali@upi";
        p9.bankName = "Yes Bank";
        p9.walletBalance = 6000;

        History h9 = new History();
        h9.transactionId = 9;
        h9.transactionType = "Transfer";
        h9.amount = 2500;
        h9.date = "09-01-2026";
        h9.status = "Success";

        p9.history = h9;
        p9.getPhonePeDetails();


        PhonePe p10 = new PhonePe();
        p10.userName = "Deepak";
        p10.mobileNumber = 7766552211L;
        p10.upiId = "deepak@upi";
        p10.bankName = "PNB";
        p10.walletBalance = 5400;

        History h10 = new History();
        h10.transactionId = 10;
        h10.transactionType = "Recharge";
        h10.amount = 349;
        h10.date = "10-01-2026";
        h10.status = "Success";

        p10.history = h10;
        p10.getPhonePeDetails();

        PhonePe p11 = new PhonePe();
        p11.userName = "Vikram";
        p11.mobileNumber = 9000090000L;
        p11.upiId = "vikram@upi";
        p11.bankName = "SBI";
        p11.walletBalance = 7200;

        History h11 = new History();
        h11.transactionId = 11;
        h11.transactionType = "Transfer";
        h11.amount = 1800;
        h11.date = "11-01-2026";
        h11.status = "Success";

        p11.history = h11;
        p11.getPhonePeDetails();


        PhonePe p12 = new PhonePe();
        p12.userName = "Pooja";
        p12.mobileNumber = 8111223344L;
        p12.upiId = "pooja@upi";
        p12.bankName = "HDFC";
        p12.walletBalance = 4600;

        History h12 = new History();
        h12.transactionId = 12;
        h12.transactionType = "Recharge";
        h12.amount = 249;
        h12.date = "12-01-2026";
        h12.status = "Success";

        p12.history = h12;
        p12.getPhonePeDetails();


        PhonePe p13 = new PhonePe();
        p13.userName = "Manoj";
        p13.mobileNumber = 8222334455L;
        p13.upiId = "manoj@upi";
        p13.bankName = "ICICI";
        p13.walletBalance = 8800;

        History h13 = new History();
        h13.transactionId = 13;
        h13.transactionType = "Bill Payment";
        h13.amount = 1400;
        h13.date = "13-01-2026";
        h13.status = "Success";

        p13.history = h13;
        p13.getPhonePeDetails();


        PhonePe p14 = new PhonePe();
        p14.userName = "Kavya";
        p14.mobileNumber = 8333445566L;
        p14.upiId = "kavya@upi";
        p14.bankName = "Axis";
        p14.walletBalance = 5300;

        History h14 = new History();
        h14.transactionId = 14;
        h14.transactionType = "Transfer";
        h14.amount = 2200;
        h14.date = "14-01-2026";
        h14.status = "Failed";

        p14.history = h14;
        p14.getPhonePeDetails();


        PhonePe p15 = new PhonePe();
        p15.userName = "Nithin";
        p15.mobileNumber = 8444556677L;
        p15.upiId = "nithin@upi";
        p15.bankName = "Canara";
        p15.walletBalance = 3900;

        History h15 = new History();
        h15.transactionId = 15;
        h15.transactionType = "Recharge";
        h15.amount = 199;
        h15.date = "15-01-2026";
        h15.status = "Success";

        p15.history = h15;
        p15.getPhonePeDetails();


        PhonePe p16 = new PhonePe();
        p16.userName = "Divakar";
        p16.mobileNumber = 8555667788L;
        p16.upiId = "divakar@upi";
        p16.bankName = "Union";
        p16.walletBalance = 6100;

        History h16 = new History();
        h16.transactionId = 16;
        h16.transactionType = "Bill Payment";
        h16.amount = 980;
        h16.date = "16-01-2026";
        h16.status = "Success";

        p16.history = h16;
        p16.getPhonePeDetails();


        PhonePe p17 = new PhonePe();
        p17.userName = "Rohit";
        p17.mobileNumber = 8666778899L;
        p17.upiId = "rohit@upi";
        p17.bankName = "Kotak";
        p17.walletBalance = 4700;

        History h17 = new History();
        h17.transactionId = 17;
        h17.transactionType = "Transfer";
        h17.amount = 2100;
        h17.date = "17-01-2026";
        h17.status = "Success";

        p17.history = h17;
        p17.getPhonePeDetails();


        PhonePe p18 = new PhonePe();
        p18.userName = "Sunita";
        p18.mobileNumber = 8777889900L;
        p18.upiId = "sunita@upi";
        p18.bankName = "IndusInd";
        p18.walletBalance = 8200;

        History h18 = new History();
        h18.transactionId = 18;
        h18.transactionType = "Recharge";
        h18.amount = 299;
        h18.date = "18-01-2026";
        h18.status = "Success";

        p18.history = h18;
        p18.getPhonePeDetails();


        PhonePe p19 = new PhonePe();
        p19.userName = "Amit";
        p19.mobileNumber = 8888999900L;
        p19.upiId = "amit@upi";
        p19.bankName = "Yes Bank";
        p19.walletBalance = 9100;

        History h19 = new History();
        h19.transactionId = 19;
        h19.transactionType = "Bill Payment";
        h19.amount = 1250;
        h19.date = "19-01-2026";
        h19.status = "Failed";

        p19.history = h19;
        p19.getPhonePeDetails();


        PhonePe p20 = new PhonePe();
        p20.userName = "Neha";
        p20.mobileNumber = 8999000011L;
        p20.upiId = "neha@upi";
        p20.bankName = "PNB";
        p20.walletBalance = 6700;

        History h20 = new History();
        h20.transactionId = 20;
        h20.transactionType = "Transfer";
        h20.amount = 3000;
        h20.date = "20-01-2026";
        h20.status = "Success";

        p20.history = h20;
        p20.getPhonePeDetails();
    }
}