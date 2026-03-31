class PersonExecutor{

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Rahul";
        p1.age = 25;
        p1.gender = "Male";
        p1.address = "Bangalore";
        p1.contactNumber = 9876543210L;

        GovernmentIdentification g1 = new GovernmentIdentification();
        g1.idNumber = 1001;
        g1.idType = "Aadhar";
        g1.issuedBy = "UIDAI";
        g1.issueDate = "01-01-2020";
        g1.expiryDate = "N/A";

        p1.governmentId = g1;
        p1.getPersonDetails();

        Person p2 = new Person();
        p2.name = "Sneha";
        p2.age = 23;
        p2.gender = "Female";
        p2.address = "Hyderabad";
        p2.contactNumber = 9123456780L;

        GovernmentIdentification g2 = new GovernmentIdentification();
        g2.idNumber = 1002;
        g2.idType = "PAN";
        g2.issuedBy = "Income Tax Dept";
        g2.issueDate = "15-03-2019";
        g2.expiryDate = "N/A";

        p2.governmentId = g2;
        p2.getPersonDetails();

        Person p3 = new Person();
        p3.name = "Arjun";
        p3.age = 28;
        p3.gender = "Male";
        p3.address = "Chennai";
        p3.contactNumber = 9988776655L;

        GovernmentIdentification g3 = new GovernmentIdentification();
        g3.idNumber = 1003;
        g3.idType = "Driving License";
        g3.issuedBy = "RTO";
        g3.issueDate = "10-06-2018";
        g3.expiryDate = "10-06-2038";

        p3.governmentId = g3;
        p3.getPersonDetails();


        Person p4 = new Person();
        p4.name = "Priya";
        p4.age = 26;
        p4.gender = "Female";
        p4.address = "Mumbai";
        p4.contactNumber = 9001122334L;

        GovernmentIdentification g4 = new GovernmentIdentification();
        g4.idNumber = 1004;
        g4.idType = "Passport";
        g4.issuedBy = "Govt of India";
        g4.issueDate = "05-08-2021";
        g4.expiryDate = "05-08-2031";

        p4.governmentId = g4;
        p4.getPersonDetails();


        Person p5 = new Person();
        p5.name = "Kiran";
        p5.age = 30;
        p5.gender = "Male";
        p5.address = "Pune";
        p5.contactNumber = 8899776655L;

        GovernmentIdentification g5 = new GovernmentIdentification();
        g5.idNumber = 1005;
        g5.idType = "Voter ID";
        g5.issuedBy = "Election Commission";
        g5.issueDate = "12-02-2017";
        g5.expiryDate = "N/A";

        p5.governmentId = g5;
        p5.getPersonDetails();


        Person p6 = new Person();
        p6.name = "Meena";
        p6.age = 27;
        p6.gender = "Female";
        p6.address = "Delhi";
        p6.contactNumber = 7766554433L;

        GovernmentIdentification g6 = new GovernmentIdentification();
        g6.idNumber = 1006;
        g6.idType = "Aadhar";
        g6.issuedBy = "UIDAI";
        g6.issueDate = "20-09-2020";
        g6.expiryDate = "N/A";

        p6.governmentId = g6;
        p6.getPersonDetails();


        Person p7 = new Person();
        p7.name = "Ramesh";
        p7.age = 35;
        p7.gender = "Male";
        p7.address = "Kolkata";
        p7.contactNumber = 6677889900L;

        GovernmentIdentification g7 = new GovernmentIdentification();
        g7.idNumber = 1007;
        g7.idType = "PAN";
        g7.issuedBy = "Income Tax Dept";
        g7.issueDate = "11-11-2016";
        g7.expiryDate = "N/A";

        p7.governmentId = g7;
        p7.getPersonDetails();


        Person p8 = new Person();
        p8.name = "Divya";
        p8.age = 24;
        p8.gender = "Female";
        p8.address = "Ahmedabad";
        p8.contactNumber = 9988007766L;

        GovernmentIdentification g8 = new GovernmentIdentification();
        g8.idNumber = 1008;
        g8.idType = "Driving License";
        g8.issuedBy = "RTO";
        g8.issueDate = "03-03-2022";
        g8.expiryDate = "03-03-2042";

        p8.governmentId = g8;
        p8.getPersonDetails();


        Person p9 = new Person();
        p9.name = "Anjali";
        p9.age = 29;
        p9.gender = "Female";
        p9.address = "Jaipur";
        p9.contactNumber = 8877665544L;

        GovernmentIdentification g9 = new GovernmentIdentification();
        g9.idNumber = 1009;
        g9.idType = "Passport";
        g9.issuedBy = "Govt of India";
        g9.issueDate = "18-07-2020";
        g9.expiryDate = "18-07-2030";

        p9.governmentId = g9;
        p9.getPersonDetails();

        Person p10 = new Person();
        p10.name = "Deepak";
        p10.age = 32;
        p10.gender = "Male";
        p10.address = "Lucknow";
        p10.contactNumber = 7766552211L;

        GovernmentIdentification g10 = new GovernmentIdentification();
        g10.idNumber = 1010;
        g10.idType = "Voter ID";
        g10.issuedBy = "Election Commission";
        g10.issueDate = "25-05-2015";
        g10.expiryDate = "N/A";

        p10.governmentId = g10;
        p10.getPersonDetails();

        Person p11 = new Person();
        p11.name = "Vikram";
        p11.age = 31;
        p11.gender = "Male";
        p11.address = "Nagpur";
        p11.contactNumber = 9000090000L;

        GovernmentIdentification g11 = new GovernmentIdentification();
        g11.idNumber = 1011;
        g11.idType = "Aadhar";
        g11.issuedBy = "UIDAI";
        g11.issueDate = "01-04-2019";
        g11.expiryDate = "N/A";

        p11.governmentId = g11;
        p11.getPersonDetails();


        Person p12 = new Person();
        p12.name = "Pooja";
        p12.age = 22;
        p12.gender = "Female";
        p12.address = "Bhopal";
        p12.contactNumber = 8111223344L;

        GovernmentIdentification g12 = new GovernmentIdentification();
        g12.idNumber = 1012;
        g12.idType = "PAN";
        g12.issuedBy = "Income Tax Dept";
        g12.issueDate = "10-10-2021";
        g12.expiryDate = "N/A";

        p12.governmentId = g12;
        p12.getPersonDetails();


        Person p13 = new Person();
        p13.name = "Manoj";
        p13.age = 34;
        p13.gender = "Male";
        p13.address = "Indore";
        p13.contactNumber = 8222334455L;

        GovernmentIdentification g13 = new GovernmentIdentification();
        g13.idNumber = 1013;
        g13.idType = "Driving License";
        g13.issuedBy = "RTO";
        g13.issueDate = "12-12-2017";
        g13.expiryDate = "12-12-2037";

        p13.governmentId = g13;
        p13.getPersonDetails();


        Person p14 = new Person();
        p14.name = "Kavya";
        p14.age = 27;
        p14.gender = "Female";
        p14.address = "Surat";
        p14.contactNumber = 8333445566L;

        GovernmentIdentification g14 = new GovernmentIdentification();
        g14.idNumber = 1014;
        g14.idType = "Passport";
        g14.issuedBy = "Govt of India";
        g14.issueDate = "22-02-2022";
        g14.expiryDate = "22-02-2032";

        p14.governmentId = g14;
        p14.getPersonDetails();


        Person p15 = new Person();
        p15.name = "Nithin";
        p15.age = 28;
        p15.gender = "Male";
        p15.address = "Trichy";
        p15.contactNumber = 8444556677L;

        GovernmentIdentification g15 = new GovernmentIdentification();
        g15.idNumber = 1015;
        g15.idType = "Voter ID";
        g15.issuedBy = "Election Commission";
        g15.issueDate = "30-08-2018";
        g15.expiryDate = "N/A";

        p15.governmentId = g15;
        p15.getPersonDetails();


        Person p16 = new Person();
        p16.name = "Divakar";
        p16.age = 33;
        p16.gender = "Male";
        p16.address = "Vizag";
        p16.contactNumber = 8555667788L;

        GovernmentIdentification g16 = new GovernmentIdentification();
        g16.idNumber = 1016;
        g16.idType = "Aadhar";
        g16.issuedBy = "UIDAI";
        g16.issueDate = "14-06-2020";
        g16.expiryDate = "N/A";

        p16.governmentId = g16;
        p16.getPersonDetails();


        Person p17 = new Person();
        p17.name = "Rohit";
        p17.age = 26;
        p17.gender = "Male";
        p17.address = "Patna";
        p17.contactNumber = 8666778899L;

        GovernmentIdentification g17 = new GovernmentIdentification();
        g17.idNumber = 1017;
        g17.idType = "PAN";
        g17.issuedBy = "Income Tax Dept";
        g17.issueDate = "05-01-2021";
        g17.expiryDate = "N/A";

        p17.governmentId = g17;
        p17.getPersonDetails();


        Person p18 = new Person();
        p18.name = "Sunita";
        p18.age = 36;
        p18.gender = "Female";
        p18.address = "Chandigarh";
        p18.contactNumber = 8777889900L;

        GovernmentIdentification g18 = new GovernmentIdentification();
        g18.idNumber = 1018;
        g18.idType = "Driving License";
        g18.issuedBy = "RTO";
        g18.issueDate = "09-09-2016";
        g18.expiryDate = "09-09-2036";

        p18.governmentId = g18;
        p18.getPersonDetails();


        Person p19 = new Person();
        p19.name = "Amit";
        p19.age = 38;
        p19.gender = "Male";
        p19.address = "Udupi";
        p19.contactNumber = 8888999900L;

        GovernmentIdentification g19 = new GovernmentIdentification();
        g19.idNumber = 1019;
        g19.idType = "Passport";
        g19.issuedBy = "Govt of India";
        g19.issueDate = "11-11-2019";
        g19.expiryDate = "11-11-2029";

        p19.governmentId = g19;
        p19.getPersonDetails();


        Person p20 = new Person();
        p20.name = "Neha";
        p20.age = 24;
        p20.gender = "Female";
        p20.address = "Mangalore";
        p20.contactNumber = 8999000011L;

        GovernmentIdentification g20 = new GovernmentIdentification();
        g20.idNumber = 1020;
        g20.idType = "Aadhar";
        g20.issuedBy = "UIDAI";
        g20.issueDate = "21-07-2023";
        g20.expiryDate = "N/A";

        p20.governmentId = g20;
        p20.getPersonDetails();
    }
}