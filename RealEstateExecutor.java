class RealEstateExecutor{

    public static void main(String[] args) {

        RealEstate r1 = new RealEstate();
        r1.companyName = "Dream Homes";
        r1.officeLocation = "Bangalore";
        r1.totalAgents = 25;
        r1.contactNumber = 9876500001L;
        r1.registrationId = "RE001";

        Property p1 = new Property();
        p1.propertyId = 101;
        p1.propertyType = "Apartment";
        p1.location = "Whitefield";
        p1.price = 7500000;
        p1.status = "Available";

        r1.property = p1;
        r1.getRealEstateDetails();

        RealEstate r2 = new RealEstate();
        r2.companyName = "Urban Estates";
        r2.officeLocation = "Hyderabad";
        r2.totalAgents = 18;
        r2.contactNumber = 9876500002L;
        r2.registrationId = "RE002";

        Property p2 = new Property();
        p2.propertyId = 102;
        p2.propertyType = "Villa";
        p2.location = "Gachibowli";
        p2.price = 15000000;
        p2.status = "Sold";

        r2.property = p2;
        r2.getRealEstateDetails();

        RealEstate r3 = new RealEstate();
        r3.companyName = "Prime Properties";
        r3.officeLocation = "Chennai";
        r3.totalAgents = 20;
        r3.contactNumber = 9876500003L;
        r3.registrationId = "RE003";

        Property p3 = new Property();
        p3.propertyId = 103;
        p3.propertyType = "Plot";
        p3.location = "OMR";
        p3.price = 5000000;
        p3.status = "Available";

        r3.property = p3;
        r3.getRealEstateDetails();


        RealEstate r4 = new RealEstate();
        r4.companyName = "Elite Realty";
        r4.officeLocation = "Mumbai";
        r4.totalAgents = 30;
        r4.contactNumber = 9876500004L;
        r4.registrationId = "RE004";

        Property p4 = new Property();
        p4.propertyId = 104;
        p4.propertyType = "Apartment";
        p4.location = "Andheri";
        p4.price = 12000000;
        p4.status = "Available";

        r4.property = p4;
        r4.getRealEstateDetails();


        RealEstate r5 = new RealEstate();
        r5.companyName = "Skyline Builders";
        r5.officeLocation = "Pune";
        r5.totalAgents = 15;
        r5.contactNumber = 9876500005L;
        r5.registrationId = "RE005";

        Property p5 = new Property();
        p5.propertyId = 105;
        p5.propertyType = "Villa";
        p5.location = "Hinjewadi";
        p5.price = 18000000;
        p5.status = "Sold";

        r5.property = p5;
        r5.getRealEstateDetails();


        RealEstate r6 = new RealEstate();
        r6.companyName = "Green Valley";
        r6.officeLocation = "Coimbatore";
        r6.totalAgents = 12;
        r6.contactNumber = 9876500006L;
        r6.registrationId = "RE006";

        Property p6 = new Property();
        p6.propertyId = 106;
        p6.propertyType = "Plot";
        p6.location = "Saravanampatti";
        p6.price = 3000000;
        p6.status = "Available";

        r6.property = p6;
        r6.getRealEstateDetails();


        RealEstate r7 = new RealEstate();
        r7.companyName = "Golden Nest";
        r7.officeLocation = "Delhi";
        r7.totalAgents = 28;
        r7.contactNumber = 9876500007L;
        r7.registrationId = "RE007";

        Property p7 = new Property();
        p7.propertyId = 107;
        p7.propertyType = "Apartment";
        p7.location = "Dwarka";
        p7.price = 9000000;
        p7.status = "Available";

        r7.property = p7;
        r7.getRealEstateDetails();


        RealEstate r8 = new RealEstate();
        r8.companyName = "Silver Key Realty";
        r8.officeLocation = "Kolkata";
        r8.totalAgents = 10;
        r8.contactNumber = 9876500008L;
        r8.registrationId = "RE008";

        Property p8 = new Property();
        p8.propertyId = 108;
        p8.propertyType = "Villa";
        p8.location = "Salt Lake";
        p8.price = 11000000;
        p8.status = "Sold";

        r8.property = p8;
        r8.getRealEstateDetails();


        RealEstate r9 = new RealEstate();
        r9.companyName = "City Developers";
        r9.officeLocation = "Ahmedabad";
        r9.totalAgents = 16;
        r9.contactNumber = 9876500009L;
        r9.registrationId = "RE009";

        Property p9 = new Property();
        p9.propertyId = 109;
        p9.propertyType = "Plot";
        p9.location = "Bopal";
        p9.price = 4000000;
        p9.status = "Available";

        r9.property = p9;
        r9.getRealEstateDetails();


        RealEstate r10 = new RealEstate();
        r10.companyName = "BlueStone Realty";
        r10.officeLocation = "Jaipur";
        r10.totalAgents = 14;
        r10.contactNumber = 9876500010L;
        r10.registrationId = "RE010";

        Property p10 = new Property();
        p10.propertyId = 110;
        p10.propertyType = "Apartment";
        p10.location = "Malviya Nagar";
        p10.price = 6500000;
        p10.status = "Sold";

        r10.property = p10;
        r10.getRealEstateDetails();


        RealEstate r11 = new RealEstate();
        r11.companyName = "Royal Lands";
        r11.officeLocation = "Nagpur";
        r11.totalAgents = 11;
        r11.contactNumber = 9876500011L;
        r11.registrationId = "RE011";

        Property p11 = new Property();
        p11.propertyId = 111;
        p11.propertyType = "Villa";
        p11.location = "Manish Nagar";
        p11.price = 14000000;
        p11.status = "Available";

        r11.property = p11;
        r11.getRealEstateDetails();


        RealEstate r12 = new RealEstate();
        r12.companyName = "Sunrise Realty";
        r12.officeLocation = "Bhopal";
        r12.totalAgents = 9;
        r12.contactNumber = 9876500012L;
        r12.registrationId = "RE012";

        Property p12 = new Property();
        p12.propertyId = 112;
        p12.propertyType = "Plot";
        p12.location = "Kolar Road";
        p12.price = 2800000;
        p12.status = "Available";

        r12.property = p12;
        r12.getRealEstateDetails();


        RealEstate r13 = new RealEstate();
        r13.companyName = "Happy Homes";
        r13.officeLocation = "Lucknow";
        r13.totalAgents = 13;
        r13.contactNumber = 9876500013L;
        r13.registrationId = "RE013";

        Property p13 = new Property();
        p13.propertyId = 113;
        p13.propertyType = "Apartment";
        p13.location = "Gomti Nagar";
        p13.price = 7200000;
        p13.status = "Sold";

        r13.property = p13;
        r13.getRealEstateDetails();


        RealEstate r14 = new RealEstate();
        r14.companyName = "Metro Realty";
        r14.officeLocation = "Indore";
        r14.totalAgents = 17;
        r14.contactNumber = 9876500014L;
        r14.registrationId = "RE014";

        Property p14 = new Property();
        p14.propertyId = 114;
        p14.propertyType = "Villa";
        p14.location = "Vijay Nagar";
        p14.price = 13500000;
        p14.status = "Available";

        r14.property = p14;
        r14.getRealEstateDetails();


        RealEstate r15 = new RealEstate();
        r15.companyName = "Urban Nest";
        r15.officeLocation = "Surat";
        r15.totalAgents = 8;
        r15.contactNumber = 9876500015L;
        r15.registrationId = "RE015";

        Property p15 = new Property();
        p15.propertyId = 115;
        p15.propertyType = "Plot";
        p15.location = "Adajan";
        p15.price = 3500000;
        p15.status = "Sold";

        r15.property = p15;
        r15.getRealEstateDetails();


        RealEstate r16 = new RealEstate();
        r16.companyName = "Dream City";
        r16.officeLocation = "Trichy";
        r16.totalAgents = 7;
        r16.contactNumber = 9876500016L;
        r16.registrationId = "RE016";

        Property p16 = new Property();
        p16.propertyId = 116;
        p16.propertyType = "Apartment";
        p16.location = "Srirangam";
        p16.price = 6000000;
        p16.status = "Available";

        r16.property = p16;
        r16.getRealEstateDetails();


        RealEstate r17 = new RealEstate();
        r17.companyName = "Green Homes";
        r17.officeLocation = "Vizag";
        r17.totalAgents = 10;
        r17.contactNumber = 9876500017L;
        r17.registrationId = "RE017";

        Property p17 = new Property();
        p17.propertyId = 117;
        p17.propertyType = "Villa";
        p17.location = "MVP Colony";
        p17.price = 12500000;
        p17.status = "Available";

        r17.property = p17;
        r17.getRealEstateDetails();


        RealEstate r18 = new RealEstate();
        r18.companyName = "City Square";
        r18.officeLocation = "Patna";
        r18.totalAgents = 6;
        r18.contactNumber = 9876500018L;
        r18.registrationId = "RE018";

        Property p18 = new Property();
        p18.propertyId = 118;
        p18.propertyType = "Apartment";
        p18.location = "Kankarbagh";
        p18.price = 5800000;
        p18.status = "Sold";

        r18.property = p18;
        r18.getRealEstateDetails();


        RealEstate r19 = new RealEstate();
        r19.companyName = "Elite Spaces";
        r19.officeLocation = "Chandigarh";
        r19.totalAgents = 12;
        r19.contactNumber = 9876500019L;
        r19.registrationId = "RE019";

        Property p19 = new Property();
        p19.propertyId = 119;
        p19.propertyType = "Plot";
        p19.location = "Sector 17";
        p19.price = 4200000;
        p19.status = "Available";

        r19.property = p19;
        r19.getRealEstateDetails();


        RealEstate r20 = new RealEstate();
        r20.companyName = "Modern Realty";
        r20.officeLocation = "Udupi";
        r20.totalAgents = 5;
        r20.contactNumber = 9876500020L;
        r20.registrationId = "RE020";

        Property p20 = new Property();
        p20.propertyId = 120;
        p20.propertyType = "Villa";
        p20.location = "Manipal";
        p20.price = 9800000;
        p20.status = "Available";

        r20.property = p20;
        r20.getRealEstateDetails();
    }
}