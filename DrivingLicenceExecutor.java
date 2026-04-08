class DrivingLicenceExecutor{

    public static void main(String[] l){

        String v1[] = {"Car", "Bike"};
        String v2[] = {"Car"};
        String v3[] = {"Truck", "Bus"};
        String v4[] = {"Scooter"};
        String v5[] = {"Car", "Taxi"};
        String v6[] = {"Truck"};
        String v7[] = {"Car", "Bike"};
        String v8[] = {"Bus"};
        String v9[] = {"Car"};
        String v10[] = {"Bike", "Truck"};
        String v11[] = {"Car", "Truck"};
        String v12[] = {"Bus", "Scooter"};
        String v13[] = {"Car", "Taxi"};

        RTO rto = new RTO();

        DrivingLicence d1 = new DrivingLicence();
        d1.licenceId = 1;
        d1.holderName = "Rahul";
        d1.licenceType = "Permanent";
        d1.issueDate = "2020";
        d1.expiryDate = "2040";
        d1.vehicleTypes = v1;
        boolean added = rto.createLicence(d1);
        System.out.println(added);

        DrivingLicence d2 = new DrivingLicence();
        d2.licenceId = 2;
        d2.holderName = "Priya";
        d2.licenceType = "Permanent";
        d2.issueDate = "2019";
        d2.expiryDate = "2039";
        d2.vehicleTypes = v2;
        added = rto.createLicence(d2);
        System.out.println(added);

        DrivingLicence d3 = new DrivingLicence();
        d3.licenceId = 3;
        d3.holderName = "Amit";
        d3.licenceType = "Commercial";
        d3.issueDate = "2018";
        d3.expiryDate = "2033";
        d3.vehicleTypes = v3;
        added = rto.createLicence(d3);
        System.out.println(added);

        DrivingLicence d4 = new DrivingLicence();
        d4.licenceId = 4;
        d4.holderName = "Sneha";
        d4.licenceType = "Permanent";
        d4.issueDate = "2021";
        d4.expiryDate = "2041";
        d4.vehicleTypes = v4;
        added = rto.createLicence(d4);
        System.out.println(added);

        DrivingLicence d5 = new DrivingLicence();
        d5.licenceId = 5;
        d5.holderName = "Kiran";
        d5.licenceType = "Commercial";
        d5.issueDate = "2017";
        d5.expiryDate = "2032";
        d5.vehicleTypes = v5;
        added = rto.createLicence(d5);
        System.out.println(added);

        DrivingLicence d6 = new DrivingLicence();
        d6.licenceId = 6;
        d6.holderName = "Anjali";
        d6.licenceType = "Permanent";
        d6.issueDate = "2022";
        d6.expiryDate = "2042";
        d6.vehicleTypes = v6;
        added = rto.createLicence(d6);
        System.out.println(added);

        DrivingLicence d7 = new DrivingLicence();
        d7.licenceId = 7;
        d7.holderName = "Ramesh";
        d7.licenceType = "Permanent";
        d7.issueDate = "2020";
        d7.expiryDate = "2040";
        d7.vehicleTypes = v7;
        added = rto.createLicence(d7);
        System.out.println(added);

        DrivingLicence d8 = new DrivingLicence();
        d8.licenceId = 8;
        d8.holderName = "Pooja";
        d8.licenceType = "Commercial";
        d8.issueDate = "2016";
        d8.expiryDate = "2031";
        d8.vehicleTypes = v8;
        added = rto.createLicence(d8);
        System.out.println(added);

        DrivingLicence d9 = new DrivingLicence();
        d9.licenceId = 9;
        d9.holderName = "Arjun";
        d9.licenceType = "Permanent";
        d9.issueDate = "2019";
        d9.expiryDate = "2039";
        d9.vehicleTypes = v9;
        added = rto.createLicence(d9);
        System.out.println(added);

        DrivingLicence d10 = new DrivingLicence();
        d10.licenceId = 10;
        d10.holderName = "Divya";
        d10.licenceType = "Permanent";
        d10.issueDate = "2021";
        d10.expiryDate = "2041";
        d10.vehicleTypes = v10;
        added = rto.createLicence(d10);
        System.out.println(added);

        DrivingLicence d11 = new DrivingLicence();
        d11.licenceId = 11;
        d11.holderName = "Vikram";
        d11.licenceType = "Commercial";
        d11.issueDate = "2015";
        d11.expiryDate = "2030";
        d11.vehicleTypes = v11;
        added = rto.createLicence(d11);
        System.out.println(added);

        DrivingLicence d12 = new DrivingLicence();
        d12.licenceId = 12;
        d12.holderName = "Meena";
        d12.licenceType = "Permanent";
        d12.issueDate = "2023";
        d12.expiryDate = "2043";
        d12.vehicleTypes = v12;
        added = rto.createLicence(d12);
        System.out.println(added);

        DrivingLicence d13 = new DrivingLicence();
        d13.licenceId = 13;
        d13.holderName = "Suresh";
        d13.licenceType = "Commercial";
        d13.issueDate = "2018";
        d13.expiryDate = "2033";
        d13.vehicleTypes = v13;
        added = rto.createLicence(d13);
        System.out.println(added);

        rto.getLicences();
    }
}