class DoorExecutor{

    public static void main(String[] args) {

        Door d1 = new Door();
        d1.doorMaterial = "Wood";
        d1.color = "Brown";
        d1.height = 7.0;
        d1.width = 3.0;
        d1.location = "Main Entrance";

        Lock l1 = new Lock();
        l1.lockId = 1;
        l1.type = "Digital";
        l1.material = "Steel";
        l1.isLocked = true;
        l1.brand = "Godrej";

        d1.lock = l1;
        d1.getDoorDetails();


        Door d2 = new Door();
        d2.doorMaterial = "Steel";
        d2.color = "Black";
        d2.height = 6.5;
        d2.width = 3.2;
        d2.location = "Back Door";

        Lock l2 = new Lock();
        l2.lockId = 2;
        l2.type = "Manual";
        l2.material = "Iron";
        l2.isLocked = false;
        l2.brand = "Yale";

        d2.lock = l2;
        d2.getDoorDetails();

        Door d3 = new Door();
        d3.doorMaterial = "Glass";
        d3.color = "Transparent";
        d3.height = 7.5;
        d3.width = 4.0;
        d3.location = "Office";

        Lock l3 = new Lock();
        l3.lockId = 3;
        l3.type = "Smart";
        l3.material = "Alloy";
        l3.isLocked = true;
        l3.brand = "Samsung";

        d3.lock = l3;
        d3.getDoorDetails();


        Door d4 = new Door();
        d4.doorMaterial = "PVC";
        d4.color = "White";
        d4.height = 6.0;
        d4.width = 3.0;
        d4.location = "Bathroom";

        Lock l4 = new Lock();
        l4.lockId = 4;
        l4.type = "Latch";
        l4.material = "Plastic";
        l4.isLocked = false;
        l4.brand = "Europa";

        d4.lock = l4;
        d4.getDoorDetails();

        Door d5 = new Door();
        d5.doorMaterial = "Wood";
        d5.color = "Dark Brown";
        d5.height = 7.0;
        d5.width = 3.5;
        d5.location = "Bedroom";

        Lock l5 = new Lock();
        l5.lockId = 5;
        l5.type = "Key Lock";
        l5.material = "Steel";
        l5.isLocked = true;
        l5.brand = "Godrej";

        d5.lock = l5;
        d5.getDoorDetails();

        Door d6 = new Door();
        d6.doorMaterial = "Metal";
        d6.color = "Grey";
        d6.height = 6.8;
        d6.width = 3.1;
        d6.location = "Garage";

        Lock l6 = new Lock();
        l6.lockId = 6;
        l6.type = "Padlock";
        l6.material = "Iron";
        l6.isLocked = true;
        l6.brand = "Link";

        d6.lock = l6;
        d6.getDoorDetails();


        Door d7 = new Door();
        d7.doorMaterial = "Wood";
        d7.color = "Beige";
        d7.height = 7.2;
        d7.width = 3.2;
        d7.location = "Hall";

        Lock l7 = new Lock();
        l7.lockId = 7;
        l7.type = "Smart";
        l7.material = "Steel";
        l7.isLocked = false;
        l7.brand = "Samsung";

        d7.lock = l7;
        d7.getDoorDetails();


        Door d8 = new Door();
        d8.doorMaterial = "Glass";
        d8.color = "Blue Tint";
        d8.height = 7.0;
        d8.width = 3.8;
        d8.location = "Conference Room";

        Lock l8 = new Lock();
        l8.lockId = 8;
        l8.type = "Digital";
        l8.material = "Alloy";
        l8.isLocked = true;
        l8.brand = "Yale";

        d8.lock = l8;
        d8.getDoorDetails();


        Door d9 = new Door();
        d9.doorMaterial = "PVC";
        d9.color = "Cream";
        d9.height = 6.2;
        d9.width = 2.8;
        d9.location = "Store Room";

        Lock l9 = new Lock();
        l9.lockId = 9;
        l9.type = "Manual";
        l9.material = "Plastic";
        l9.isLocked = true;
        l9.brand = "Europa";

        d9.lock = l9;
        d9.getDoorDetails();


        Door d10 = new Door();
        d10.doorMaterial = "Wood";
        d10.color = "Mahogany";
        d10.height = 7.5;
        d10.width = 3.5;
        d10.location = "Office Cabin";

        Lock l10 = new Lock();
        l10.lockId = 10;
        l10.type = "Key Lock";
        l10.material = "Steel";
        l10.isLocked = false;
        l10.brand = "Godrej";

        d10.lock = l10;
        d10.getDoorDetails();


        // 11–20

        Door d11 = new Door();
        d11.doorMaterial = "Steel";
        d11.color = "Silver";
        d11.height = 7.0;
        d11.width = 3.0;
        d11.location = "Warehouse";

        Lock l11 = new Lock();
        l11.lockId = 11;
        l11.type = "Padlock";
        l11.material = "Iron";
        l11.isLocked = true;
        l11.brand = "Link";

        d11.lock = l11;
        d11.getDoorDetails();


        Door d12 = new Door();
        d12.doorMaterial = "Wood";
        d12.color = "Light Brown";
        d12.height = 6.8;
        d12.width = 3.2;
        d12.location = "Guest Room";

        Lock l12 = new Lock();
        l12.lockId = 12;
        l12.type = "Latch";
        l12.material = "Steel";
        l12.isLocked = false;
        l12.brand = "Europa";

        d12.lock = l12;
        d12.getDoorDetails();


        Door d13 = new Door();
        d13.doorMaterial = "Glass";
        d13.color = "Clear";
        d13.height = 7.3;
        d13.width = 3.6;
        d13.location = "Showroom";

        Lock l13 = new Lock();
        l13.lockId = 13;
        l13.type = "Digital";
        l13.material = "Alloy";
        l13.isLocked = true;
        l13.brand = "Samsung";

        d13.lock = l13;
        d13.getDoorDetails();


        Door d14 = new Door();
        d14.doorMaterial = "PVC";
        d14.color = "White";
        d14.height = 6.0;
        d14.width = 2.9;
        d14.location = "Washroom";

        Lock l14 = new Lock();
        l14.lockId = 14;
        l14.type = "Manual";
        l14.material = "Plastic";
        l14.isLocked = false;
        l14.brand = "Europa";

        d14.lock = l14;
        d14.getDoorDetails();


        Door d15 = new Door();
        d15.doorMaterial = "Wood";
        d15.color = "Dark Oak";
        d15.height = 7.4;
        d15.width = 3.3;
        d15.location = "Study Room";

        Lock l15 = new Lock();
        l15.lockId = 15;
        l15.type = "Smart";
        l15.material = "Steel";
        l15.isLocked = true;
        l15.brand = "Yale";

        d15.lock = l15;
        d15.getDoorDetails();


        Door d16 = new Door();
        d16.doorMaterial = "Metal";
        d16.color = "Grey";
        d16.height = 6.9;
        d16.width = 3.0;
        d16.location = "Storage";

        Lock l16 = new Lock();
        l16.lockId = 16;
        l16.type = "Padlock";
        l16.material = "Iron";
        l16.isLocked = true;
        l16.brand = "Link";

        d16.lock = l16;
        d16.getDoorDetails();


        Door d17 = new Door();
        d17.doorMaterial = "Wood";
        d17.color = "Brown";
        d17.height = 7.1;
        d17.width = 3.2;
        d17.location = "Living Room";

        Lock l17 = new Lock();
        l17.lockId = 17;
        l17.type = "Key Lock";
        l17.material = "Steel";
        l17.isLocked = false;
        l17.brand = "Godrej";

        d17.lock = l17;
        d17.getDoorDetails();


        Door d18 = new Door();
        d18.doorMaterial = "Glass";
        d18.color = "Frosted";
        d18.height = 7.2;
        d18.width = 3.7;
        d18.location = "Meeting Room";

        Lock l18 = new Lock();
        l18.lockId = 18;
        l18.type = "Digital";
        l18.material = "Alloy";
        l18.isLocked = true;
        l18.brand = "Samsung";

        d18.lock = l18;
        d18.getDoorDetails();


        Door d19 = new Door();
        d19.doorMaterial = "PVC";
        d19.color = "Ivory";
        d19.height = 6.3;
        d19.width = 2.8;
        d19.location = "Pantry";

        Lock l19 = new Lock();
        l19.lockId = 19;
        l19.type = "Latch";
        l19.material = "Plastic";
        l19.isLocked = false;
        l19.brand = "Europa";

        d19.lock = l19;
        d19.getDoorDetails();


        Door d20 = new Door();
        d20.doorMaterial = "Wood";
        d20.color = "Walnut";
        d20.height = 7.5;
        d20.width = 3.4;
        d20.location = "Main Hall";

        Lock l20 = new Lock();
        l20.lockId = 20;
        l20.type = "Smart";
        l20.material = "Steel";
        l20.isLocked = true;
        l20.brand = "Yale";

        d20.lock = l20;
        d20.getDoorDetails();
    }
}