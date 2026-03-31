class FactoryExecutor{

    public static void main(String[] args) {

        Factory f1 = new Factory();
        f1.factoryName = "Steel Plant";
        f1.location = "Bangalore";
        f1.totalWorkers = 200;
        f1.industryType = "Steel";
        f1.productionCapacity = 5000;

        Machine m1 = new Machine();
        m1.machineId = 1;
        m1.machineName = "Lathe Machine";
        m1.type = "Cutting";
        m1.capacity = 100;
        m1.status = "Active";

        f1.machine = m1;
        f1.getFactoryDetails();

        Factory f2 = new Factory();
        f2.factoryName = "Textile Unit";
        f2.location = "Coimbatore";
        f2.totalWorkers = 150;
        f2.industryType = "Textile";
        f2.productionCapacity = 3000;

        Machine m2 = new Machine();
        m2.machineId = 2;
        m2.machineName = "Weaving Machine";
        m2.type = "Weaving";
        m2.capacity = 80;
        m2.status = "Active";

        f2.machine = m2;
        f2.getFactoryDetails();

        Factory f3 = new Factory();
        f3.factoryName = "Automobile Factory";
        f3.location = "Chennai";
        f3.totalWorkers = 300;
        f3.industryType = "Automobile";
        f3.productionCapacity = 7000;

        Machine m3 = new Machine();
        m3.machineId = 3;
        m3.machineName = "Assembly Robot";
        m3.type = "Automation";
        m3.capacity = 150;
        m3.status = "Active";

        f3.machine = m3;
        f3.getFactoryDetails();

        Factory f4 = new Factory();
        f4.factoryName = "Food Processing";
        f4.location = "Hyderabad";
        f4.totalWorkers = 180;
        f4.industryType = "Food";
        f4.productionCapacity = 4000;

        Machine m4 = new Machine();
        m4.machineId = 4;
        m4.machineName = "Mixer Machine";
        m4.type = "Processing";
        m4.capacity = 120;
        m4.status = "Active";

        f4.machine = m4;
        f4.getFactoryDetails();

        Factory f5 = new Factory();
        f5.factoryName = "Pharma Unit";
        f5.location = "Mumbai";
        f5.totalWorkers = 220;
        f5.industryType = "Pharmaceutical";
        f5.productionCapacity = 4500;

        Machine m5 = new Machine();
        m5.machineId = 5;
        m5.machineName = "Tablet Press";
        m5.type = "Production";
        m5.capacity = 200;
        m5.status = "Active";

        f5.machine = m5;
        f5.getFactoryDetails();


        Factory f6 = new Factory();
        f6.factoryName = "Paper Mill";
        f6.location = "Pune";
        f6.totalWorkers = 140;
        f6.industryType = "Paper";
        f6.productionCapacity = 3200;

        Machine m6 = new Machine();
        m6.machineId = 6;
        m6.machineName = "Pulp Machine";
        m6.type = "Processing";
        m6.capacity = 90;
        m6.status = "Inactive";

        f6.machine = m6;
        f6.getFactoryDetails();


        Factory f7 = new Factory();
        f7.factoryName = "Plastic Factory";
        f7.location = "Delhi";
        f7.totalWorkers = 160;
        f7.industryType = "Plastic";
        f7.productionCapacity = 3500;

        Machine m7 = new Machine();
        m7.machineId = 7;
        m7.machineName = "Injection Molding";
        m7.type = "Molding";
        m7.capacity = 110;
        m7.status = "Active";

        f7.machine = m7;
        f7.getFactoryDetails();

        Factory f8 = new Factory();
        f8.factoryName = "Cement Factory";
        f8.location = "Jaipur";
        f8.totalWorkers = 250;
        f8.industryType = "Cement";
        f8.productionCapacity = 8000;

        Machine m8 = new Machine();
        m8.machineId = 8;
        m8.machineName = "Crusher";
        m8.type = "Crushing";
        m8.capacity = 300;
        m8.status = "Active";

        f8.machine = m8;
        f8.getFactoryDetails();

        Factory f9 = new Factory();
        f9.factoryName = "Electronics Unit";
        f9.location = "Noida";
        f9.totalWorkers = 190;
        f9.industryType = "Electronics";
        f9.productionCapacity = 4200;

        Machine m9 = new Machine();
        m9.machineId = 9;
        m9.machineName = "PCB Machine";
        m9.type = "Assembly";
        m9.capacity = 130;
        m9.status = "Active";

        f9.machine = m9;
        f9.getFactoryDetails();

        Factory f10 = new Factory();
        f10.factoryName = "Glass Factory";
        f10.location = "Surat";
        f10.totalWorkers = 170;
        f10.industryType = "Glass";
        f10.productionCapacity = 3600;

        Machine m10 = new Machine();
        m10.machineId = 10;
        m10.machineName = "Furnace";
        m10.type = "Heating";
        m10.capacity = 250;
        m10.status = "Active";

        f10.machine = m10;
        f10.getFactoryDetails();

        Factory f11 = new Factory();
        f11.factoryName = "Rubber Plant";
        f11.location = "Kochi";
        f11.totalWorkers = 130;
        f11.industryType = "Rubber";
        f11.productionCapacity = 2800;

        Machine m11 = new Machine();
        m11.machineId = 11;
        m11.machineName = "Rubber Mixer";
        m11.type = "Mixing";
        m11.capacity = 85;
        m11.status = "Active";

        f11.machine = m11;
        f11.getFactoryDetails();


        Factory f12 = new Factory();
        f12.factoryName = "Packaging Unit";
        f12.location = "Nagpur";
        f12.totalWorkers = 120;
        f12.industryType = "Packaging";
        f12.productionCapacity = 2600;

        Machine m12 = new Machine();
        m12.machineId = 12;
        m12.machineName = "Packing Machine";
        m12.type = "Packaging";
        m12.capacity = 95;
        m12.status = "Active";

        f12.machine = m12;
        f12.getFactoryDetails();


        Factory f13 = new Factory();
        f13.factoryName = "Furniture Factory";
        f13.location = "Indore";
        f13.totalWorkers = 140;
        f13.industryType = "Wood";
        f13.productionCapacity = 3000;

        Machine m13 = new Machine();
        m13.machineId = 13;
        m13.machineName = "Cutter";
        m13.type = "Cutting";
        m13.capacity = 100;
        m13.status = "Active";

        f13.machine = m13;
        f13.getFactoryDetails();


        Factory f14 = new Factory();
        f14.factoryName = "Chemical Plant";
        f14.location = "Vadodara";
        f14.totalWorkers = 210;
        f14.industryType = "Chemical";
        f14.productionCapacity = 6000;

        Machine m14 = new Machine();
        m14.machineId = 14;
        m14.machineName = "Reactor";
        m14.type = "Processing";
        m14.capacity = 220;
        m14.status = "Active";

        f14.machine = m14;
        f14.getFactoryDetails();


        Factory f15 = new Factory();
        f15.factoryName = "Oil Refinery";
        f15.location = "Visakhapatnam";
        f15.totalWorkers = 260;
        f15.industryType = "Oil";
        f15.productionCapacity = 9000;

        Machine m15 = new Machine();
        m15.machineId = 15;
        m15.machineName = "Distillation Unit";
        m15.type = "Refining";
        m15.capacity = 350;
        m15.status = "Active";

        f15.machine = m15;
        f15.getFactoryDetails();


        Factory f16 = new Factory();
        f16.factoryName = "Dairy Plant";
        f16.location = "Amul";
        f16.totalWorkers = 150;
        f16.industryType = "Dairy";
        f16.productionCapacity = 4000;

        Machine m16 = new Machine();
        m16.machineId = 16;
        m16.machineName = "Pasteurizer";
        m16.type = "Processing";
        m16.capacity = 180;
        m16.status = "Active";

        f16.machine = m16;
        f16.getFactoryDetails();


        Factory f17 = new Factory();
        f17.factoryName = "Leather Unit";
        f17.location = "Kanpur";
        f17.totalWorkers = 175;
        f17.industryType = "Leather";
        f17.productionCapacity = 3700;

        Machine m17 = new Machine();
        m17.machineId = 17;
        m17.machineName = "Tanning Machine";
        m17.type = "Processing";
        m17.capacity = 140;
        m17.status = "Active";

        f17.machine = m17;
        f17.getFactoryDetails();


        Factory f18 = new Factory();
        f18.factoryName = "Battery Plant";
        f18.location = "Bangalore";
        f18.totalWorkers = 190;
        f18.industryType = "Electronics";
        f18.productionCapacity = 4100;

        Machine m18 = new Machine();
        m18.machineId = 18;
        m18.machineName = "Battery Assembler";
        m18.type = "Assembly";
        m18.capacity = 130;
        m18.status = "Active";

        f18.machine = m18;
        f18.getFactoryDetails();


        Factory f19 = new Factory();
        f19.factoryName = "Solar Plant";
        f19.location = "Ahmedabad";
        f19.totalWorkers = 160;
        f19.industryType = "Energy";
        f19.productionCapacity = 5000;

        Machine m19 = new Machine();
        m19.machineId = 19;
        m19.machineName = "Panel Assembler";
        m19.type = "Assembly";
        m19.capacity = 150;
        m19.status = "Active";

        f19.machine = m19;
        f19.getFactoryDetails();


        Factory f20 = new Factory();
        f20.factoryName = "Tyre Factory";
        f20.location = "Chennai";
        f20.totalWorkers = 230;
        f20.industryType = "Automobile";
        f20.productionCapacity = 6000;

        Machine m20 = new Machine();
        m20.machineId = 20;
        m20.machineName = "Tyre Press";
        m20.type = "Molding";
        m20.capacity = 200;
        m20.status = "Active";

        f20.machine = m20;
        f20.getFactoryDetails();
    }
}