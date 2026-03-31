class TVExecutor{

    public static void main(String[] args) {

        TV t1 = new TV();
        t1.brand = "Samsung";
        t1.model = "QLED X1";
        t1.screenSize = 55;
        t1.price = 65000;
        t1.displayType = "QLED";

        Remote r1 = new Remote();
        r1.remoteId = 1;
        r1.brand = "Samsung";
        r1.type = "Smart";
        r1.batteryLevel = 80;
        r1.range = "10m";

        t1.remote = r1;
        t1.getTVDetails();


        TV t2 = new TV();
        t2.brand = "LG";
        t2.model = "OLED A2";
        t2.screenSize = 65;
        t2.price = 90000;
        t2.displayType = "OLED";

        Remote r2 = new Remote();
        r2.remoteId = 2;
        r2.brand = "LG";
        r2.type = "Magic Remote";
        r2.batteryLevel = 75;
        r2.range = "12m";

        t2.remote = r2;
        t2.getTVDetails();


        TV t3 = new TV();
        t3.brand = "Sony";
        t3.model = "Bravia X90";
        t3.screenSize = 50;
        t3.price = 70000;
        t3.displayType = "LED";

        Remote r3 = new Remote();
        r3.remoteId = 3;
        r3.brand = "Sony";
        r3.type = "Voice Remote";
        r3.batteryLevel = 85;
        r3.range = "10m";

        t3.remote = r3;
        t3.getTVDetails();


        TV t4 = new TV();
        t4.brand = "Mi";
        t4.model = "Smart 5X";
        t4.screenSize = 43;
        t4.price = 30000;
        t4.displayType = "LED";

        Remote r4 = new Remote();
        r4.remoteId = 4;
        r4.brand = "Mi";
        r4.type = "Bluetooth";
        r4.batteryLevel = 90;
        r4.range = "8m";

        t4.remote = r4;
        t4.getTVDetails();


        TV t5 = new TV();
        t5.brand = "OnePlus";
        t5.model = "Y Series";
        t5.screenSize = 55;
        t5.price = 45000;
        t5.displayType = "LED";

        Remote r5 = new Remote();
        r5.remoteId = 5;
        r5.brand = "OnePlus";
        r5.type = "Smart";
        r5.batteryLevel = 70;
        r5.range = "9m";

        t5.remote = r5;
        t5.getTVDetails();


        TV t6 = new TV();
        t6.brand = "Panasonic";
        t6.model = "Viera";
        t6.screenSize = 49;
        t6.price = 52000;
        t6.displayType = "LED";

        Remote r6 = new Remote();
        r6.remoteId = 6;
        r6.brand = "Panasonic";
        r6.type = "Standard";
        r6.batteryLevel = 65;
        r6.range = "10m";

        t6.remote = r6;
        t6.getTVDetails();


        TV t7 = new TV();
        t7.brand = "TCL";
        t7.model = "4K UHD";
        t7.screenSize = 55;
        t7.price = 40000;
        t7.displayType = "LED";

        Remote r7 = new Remote();
        r7.remoteId = 7;
        r7.brand = "TCL";
        r7.type = "Voice";
        r7.batteryLevel = 88;
        r7.range = "11m";

        t7.remote = r7;
        t7.getTVDetails();


        TV t8 = new TV();
        t8.brand = "Vu";
        t8.model = "Premium TV";
        t8.screenSize = 50;
        t8.price = 35000;
        t8.displayType = "LED";

        Remote r8 = new Remote();
        r8.remoteId = 8;
        r8.brand = "Vu";
        r8.type = "Smart";
        r8.batteryLevel = 82;
        r8.range = "10m";

        t8.remote = r8;
        t8.getTVDetails();


        TV t9 = new TV();
        t9.brand = "Philips";
        t9.model = "Ambilight";
        t9.screenSize = 58;
        t9.price = 60000;
        t9.displayType = "LED";

        Remote r9 = new Remote();
        r9.remoteId = 9;
        r9.brand = "Philips";
        r9.type = "Standard";
        r9.batteryLevel = 77;
        r9.range = "9m";

        t9.remote = r9;
        t9.getTVDetails();


        TV t10 = new TV();
        t10.brand = "Realme";
        t10.model = "Smart TV";
        t10.screenSize = 43;
        t10.price = 28000;
        t10.displayType = "LED";

        Remote r10 = new Remote();
        r10.remoteId = 10;
        r10.brand = "Realme";
        r10.type = "Bluetooth";
        r10.batteryLevel = 90;
        r10.range = "8m";

        t10.remote = r10;
        t10.getTVDetails();


        TV t11 = new TV();
        t11.brand = "Samsung";
        t11.model = "Crystal UHD";
        t11.screenSize = 65;
        t11.price = 80000;
        t11.displayType = "LED";

        Remote r11 = new Remote();
        r11.remoteId = 11;
        r11.brand = "Samsung";
        r11.type = "Smart";
        r11.batteryLevel = 85;
        r11.range = "10m";

        t11.remote = r11;
        t11.getTVDetails();


        TV t12 = new TV();
        t12.brand = "LG";
        t12.model = "NanoCell";
        t12.screenSize = 55;
        t12.price = 75000;
        t12.displayType = "LED";

        Remote r12 = new Remote();
        r12.remoteId = 12;
        r12.brand = "LG";
        r12.type = "Magic Remote";
        r12.batteryLevel = 80;
        r12.range = "12m";

        t12.remote = r12;
        t12.getTVDetails();


        TV t13 = new TV();
        t13.brand = "Sony";
        t13.model = "Bravia OLED";
        t13.screenSize = 65;
        t13.price = 120000;
        t13.displayType = "OLED";

        Remote r13 = new Remote();
        r13.remoteId = 13;
        r13.brand = "Sony";
        r13.type = "Voice";
        r13.batteryLevel = 78;
        r13.range = "11m";

        t13.remote = r13;
        t13.getTVDetails();


        TV t14 = new TV();
        t14.brand = "Mi";
        t14.model = "X Series";
        t14.screenSize = 50;
        t14.price = 32000;
        t14.displayType = "LED";

        Remote r14 = new Remote();
        r14.remoteId = 14;
        r14.brand = "Mi";
        r14.type = "Bluetooth";
        r14.batteryLevel = 92;
        r14.range = "9m";

        t14.remote = r14;
        t14.getTVDetails();


        TV t15 = new TV();
        t15.brand = "OnePlus";
        t15.model = "U Series";
        t15.screenSize = 65;
        t15.price = 85000;
        t15.displayType = "LED";

        Remote r15 = new Remote();
        r15.remoteId = 15;
        r15.brand = "OnePlus";
        r15.type = "Smart";
        r15.batteryLevel = 87;
        r15.range = "10m";

        t15.remote = r15;
        t15.getTVDetails();


        TV t16 = new TV();
        t16.brand = "Panasonic";
        t16.model = "4K Smart";
        t16.screenSize = 55;
        t16.price = 60000;
        t16.displayType = "LED";

        Remote r16 = new Remote();
        r16.remoteId = 16;
        r16.brand = "Panasonic";
        r16.type = "Standard";
        r16.batteryLevel = 70;
        r16.range = "10m";

        t16.remote = r16;
        t16.getTVDetails();


        TV t17 = new TV();
        t17.brand = "TCL";
        t17.model = "Mini LED";
        t17.screenSize = 65;
        t17.price = 70000;
        t17.displayType = "LED";

        Remote r17 = new Remote();
        r17.remoteId = 17;
        r17.brand = "TCL";
        r17.type = "Voice";
        r17.batteryLevel = 83;
        r17.range = "11m";

        t17.remote = r17;
        t17.getTVDetails();


        TV t18 = new TV();
        t18.brand = "Vu";
        t18.model = "Cinema TV";
        t18.screenSize = 55;
        t18.price = 42000;
        t18.displayType = "LED";

        Remote r18 = new Remote();
        r18.remoteId = 18;
        r18.brand = "Vu";
        r18.type = "Smart";
        r18.batteryLevel = 88;
        r18.range = "10m";

        t18.remote = r18;
        t18.getTVDetails();


        TV t19 = new TV();
        t19.brand = "Philips";
        t19.model = "OLED+";
        t19.screenSize = 65;
        t19.price = 95000;
        t19.displayType = "OLED";

        Remote r19 = new Remote();
        r19.remoteId = 19;
        r19.brand = "Philips";
        r19.type = "Standard";
        r19.batteryLevel = 76;
        r19.range = "9m";

        t19.remote = r19;
        t19.getTVDetails();


        TV t20 = new TV();
        t20.brand = "Realme";
        t20.model = "Neo TV";
        t20.screenSize = 50;
        t20.price = 30000;
        t20.displayType = "LED";

        Remote r20 = new Remote();
        r20.remoteId = 20;
        r20.brand = "Realme";
        r20.type = "Bluetooth";
        r20.batteryLevel = 91;
        r20.range = "8m";

        t20.remote = r20;
        t20.getTVDetails();
    }
}